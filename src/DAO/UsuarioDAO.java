package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexaosql.Conexao;
import entity.Usuario;

public class UsuarioDAO {

    public void CadastrarUsuario(Usuario usuario){
        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";

        PreparedStatement ps = null;
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
         
            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Usuario getUserByLogin(String login) {
        String sql = "SELECT * FROM USUARIO WHERE LOGIN =?";

        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, login);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                Usuario user = new Usuario();
                user.setLogin(rs.getString("LOGIN"));
                user.setSenha(rs.getString("SENHA"));
                return user;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs!= null) rs.close();
                if (ps!= null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return null;
    }
}