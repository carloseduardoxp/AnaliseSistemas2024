package dao;

import domain.*;
import java.sql.*;

public class ConsultaDao {

    public void inserir(Consulta consulta) throws Exception {
        String sql = "INSERT INTO TB_CONSULTA(DES_RESUMO,DAT_CONSULTA,COD_TRATAMENTO,COD_VETERINARIO) VALUES (?,?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql,
                                        Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, consulta.getResumo());
        stmt.setObject(2, consulta.getData());
        stmt.setInt(3, consulta.getTratamento().getCodigo());
        stmt.setInt(4, consulta.getVeterinario().getCodigo());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            consulta.setCodigo(rs.getInt(1));
        }            
        stmt.close();
        conexao.close();
    }


}
