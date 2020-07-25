
package polimorfismo;


public class Conta {
    protected String nome;
    protected double saldo;
    
    
    public Conta(){
    }
    
    public Conta(String nome){
        this.nome = nome;
    }
    
    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
    
    protected void sacar(){
    
    }
    
    
    
    
    
    
    
    
    
    public void imprimirTipoConta(){
        System.out.println("Conta tradicional");
    }
    
    public void imprimirTipoConta(String nome){
        System.out.println("Conta tradiconal - nome:"+nome);
    }
}
