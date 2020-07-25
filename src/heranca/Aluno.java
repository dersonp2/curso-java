
package heranca;

public class Aluno extends Pessoa {
    int cpd;


    public Aluno(int cpd, String nome, int idade, double altura) {
//        Chamar o construtor da SUPERCLASSE | Palavra reservada super()
        super(nome, idade, altura);
        this.cpd = cpd;
    }
    
    
}
