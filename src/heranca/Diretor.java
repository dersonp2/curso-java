
package heranca;


public class Diretor extends Professor{
    String curso;

    public Diretor(String curso, double salario, String nome, int idade, double altura) {
        super(salario, nome, idade, altura);
        this.curso = curso;
    }
    
   
}
