package dao;

import domain.*;
import java.sql.*;

public class VeterinarioDao {

    public void inserir(Veterinario veterinario) throws Exception {
        String sql = "INSERT INTO TB_VETERINARIO(NOM_VETERINARIO,DES_TELEFONE,DES_CRMV) VALUES (?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql,
                                      Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, veterinario.getNome());
        stmt.setString(2, veterinario.getTelefone());
        stmt.setString(3, veterinario.getCrmv());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            veterinario.setCodigo(rs.getInt(1));
        }
        stmt.close();
        conexao.close();
    }

}
