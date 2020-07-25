
package bancoDeDados.model;

// Responsável por ter os atributos, métodos de acesso e os contrutores
public class Aluno {
   private String nome;
   private int cpd;

    public Aluno(String nome, int cpd) {
        this.nome = nome;
        this.cpd = cpd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpd() {
        return cpd;
    }

    public void setCpd(int cpd) {
        this.cpd = cpd;
    }
   
   
}
