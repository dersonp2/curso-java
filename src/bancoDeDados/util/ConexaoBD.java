package bancoDeDados.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBD {
//    Para me conectar com banco de dados, o que preciso??
/*
    caminho e porta do servidor do banco de dados >
    nome da base de dados >
    usuário e senha do banco de dados >  
    Url de conexao
    Classe para fazer a conexão
     */
    String servidor = "localhost:3306";
    String baseDeDados = "alunos";
    String usuario = "root";
    String senha = "";
    String url = "jdbc:mysql://" + servidor + "/" + baseDeDados+"?useTimezone=true&serverTimezone=UTC ";

    public Connection conexao;

    public void conectarBD() {
        try {
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso");
        } catch (SQLException ex) {
            System.out.println("erro ao conectar com o BD: " + ex);
        }
    }
    
    public void desconectarBD(){
        try {
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao desconectar do banco: " + ex);        }
    }

}
