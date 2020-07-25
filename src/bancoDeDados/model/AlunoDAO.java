package bancoDeDados.model;

// Responsável por ter métodos de acesso ao Banco de dados 
import bancoDeDados.util.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlunoDAO {

    public void cadastrarAluno(Aluno a) {
        System.out.println("Conectar com banco de dados");
        ConexaoBD conn = new ConexaoBD();
        conn.conectarBD();
        System.out.println("Inserir o aluno no banco de dados: " + a.getNome());

        String sql = "INSERT INTO aluno (cpd, nome) values (?, ?);";
        PreparedStatement ps;
        try {
            ps = conn.conexao.prepareStatement(sql);
            ps.setInt(1, a.getCpd());
            ps.setString(2, a.getNome());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao prepara o Statement com o Sql");
        }

        conn.desconectarBD();
    }

    public Aluno buscarAluno(int cpd) {
        /**
         * Conectar com o banco de dados Criar a string sql PreparedStatement
         * para executar a consulta Substitui os pontos de interrogação Executar
         * a consutar
         */
        ConexaoBD conn = new ConexaoBD();
        conn.conectarBD();

        String sql = "select * from aluno where cpd = " + cpd;
        PreparedStatement ps;
//        Para receber dados que vem do BD, é preciso utilizar a classe ResultSet
//        Dentro da objeto resultset é que vai estar o valor retornado da consulta

        ResultSet rs;
        try {
            ps = conn.conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                rs.first();
                System.out.println(rs.getInt("cpd"));
                System.out.println(rs.getString("nome"));

                Aluno a = new Aluno(rs.getString("nome"), rs.getInt("cpd"));
                return a;
            } else {
                System.out.println("Erro ao encontrar o aluno");
                return null; 
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao transformar para sql " + ex);
            return null;
        }

    }

    public boolean atualizarAluno(Aluno a) {
        // Conectar com o banco
//    Criar a string Sql 
//    Criar o preparedStatement
//    Executar a atualizacao
        ConexaoBD conn = new ConexaoBD();
        conn.conectarBD();

        String sql = "update aluno set nome = ? where cpd = ?";

        PreparedStatement ps;

        try {
            ps = conn.conexao.prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setInt(2, a.getCpd());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao transformar para sql " + ex);
            return false;
        }

    }

    public List<Aluno> listarAlunos() {
        /**
         * Conectar com o banco Criar a string sql ||Criar uma lista de alunos
         * vazia || Executar a consulta || Insere o resultado na lista de alunos
         * || Retornar essa lista preenchida
         */

        ConexaoBD conn = new ConexaoBD();
        conn.conectarBD();

        String sql = "select * from aluno";
        List<Aluno> alunos = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = conn.conexao.prepareStatement(sql);
            rs = ps.executeQuery();
//            Percorrer todo o resulta que esta no "rs" -> criar um aluno e 
//            Adcionar ele na lista de alunos
            while (rs.next()) {
                Aluno a = new Aluno(rs.getString("nome"), rs.getInt("cpd"));

                alunos.add(a);
            }
            return alunos;
        } catch (SQLException ex) {
            System.out.println("Erro ao transformar para sql " + ex);
            return null;
        }

    }

    public void deletarAluno(Aluno a) {

    }
//    Atualizar, buscar, listar todos.....

}
