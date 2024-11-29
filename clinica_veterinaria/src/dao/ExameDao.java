package dao;
import domain.*;
import java.sql.*;

public class ExameDao {

    public void inserir(Exame exame) throws Exception {
        String sql = "INSERT INTO TB_EXAME(DES_TIPO,DES_RESULTADO,DAT_EXAME,COD_CONSULTA) VALUES (?,?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql,
                                        Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, exame.getTipo());
        stmt.setObject(2, exame.getResultado());
        stmt.setObject(3, exame.getData());
        stmt.setInt(4, exame.getConsulta().getCodigo());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            exame.setCodigo(rs.getInt(1));
        }            
        stmt.close();
        conexao.close();
    }

}
