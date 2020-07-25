package bancoDeDados.model;

import bancoDeDados.util.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anderson
 */
public class UsuarioDAO {

    public boolean fazerLogin(Usuario usuario) {
//    Conectar com banco <>
//    Fazer a consulta se o usario esta no banco
//    Retornar um resultado para a tela
        ConexaoBD conn = new ConexaoBD();
        conn.conectarBD();

        String sql = "select * from usuario where nome = ? and senha = ?";

//       Classe para transformar em um instrução sql e executar essa consulta no banco
        PreparedStatement ps;
//       Classe para receber a resposta do banco de dados
        ResultSet rs;
        try {
            ps = conn.conexao.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());

            rs = ps.executeQuery();

            // Se o result tiver valores dentro é pq existe no banco,
            // se nao é pq o usario ou senha pode estar incorreto
            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }

    }

    public void cadastrarUsuario() {
    }

    public void excluirUsuario() {
    }

    public void editarUsario() {
    }
}
