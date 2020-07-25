
package heranca;

public class Pessoa {
    protected String nome;
    protected int idade;  
    protected double altura;
    
//    Criar um construtor para a classe pessoa 
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public void dizerOi(){
        System.out.println("Arô garera, sou " + nome);
    }
   
    public void altura(){
        if (this.altura > 1.50){
            System.out.println("Sou alto");
        }else {
            System.out.println("Sou baixo");
        }
    }
}
