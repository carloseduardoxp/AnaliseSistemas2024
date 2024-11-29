package dao;

import domain.*;
import java.sql.*;

public class TratamentoDao {

    public void inserir(Tratamento tratamento) throws Exception {
        String sql = "INSERT INTO TB_TRATAMENTO(DES_TRATAMENTO,COD_VETERINARIO) VALUES (?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql,
                                      Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, tratamento.getDescricao());
        stmt.setInt(2, tratamento.getIniciadoPor().getCodigo());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            tratamento.setCodigo(rs.getInt(1));
        }
        stmt.close();
        conexao.close();
    }

}
