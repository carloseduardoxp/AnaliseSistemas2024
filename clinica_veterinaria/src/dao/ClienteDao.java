package dao;

import domain.*;
import java.sql.*;

public class ClienteDao {

    public void inserir(Cliente cliente) throws Exception {
        String sql = "INSERT INTO TB_CLIENTE(NOM_CLIENTE,DES_TELEFONE,DES_ENDERECO,COD_CADASTRADO_POR) VALUES (?,?,?,?)";
        Connection conexao = ConexaoMysql.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(sql,
                                      Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getTelefone());
        stmt.setString(3, cliente.getEndereco());
        stmt.setInt(4, cliente.getCadastradoPor().getCodigo());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            cliente.setCodigo(rs.getInt(1));
        }
        inserirPets(cliente);
        stmt.close();
        conexao.close();
    }

    private void inserirPets(Cliente cliente) throws Exception {
        for (Pet pet: cliente.getPets()) {
            String sql = "INSERT INTO TB_PET(NOM_PET,DAT_NASCIMENTO,DES_GENERO,COD_TUTOR,COD_ESPECIE) VALUES (?,?,?,?,?)";
            Connection conexao = ConexaoMysql.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql,
                                          Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, pet.getNome());
            stmt.setObject(2, pet.getDataNascimento());
            stmt.setString(3, pet.getGenero().name());
            stmt.setInt(4, pet.getTutor().getCodigo());
            stmt.setInt(5, pet.getEspecie().getCodigo());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                pet.setCodigo(rs.getInt(1));
            }            
            stmt.close();
            conexao.close();
        }
    }

}
