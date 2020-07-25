
package heranca;

public class Professor  extends Pessoa{
    double salario;
 
    public Professor(double salario, String nome, int idade, double altura) {
        super(nome, idade, altura);
        this.salario = salario;
    }
    
}
