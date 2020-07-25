package polimorfismo;

public class Main {
 static ContaPoupanca cp;
    public static void main(String[] args) {
       criarConta();
        depositar();
    }
    
    
    public static void criarConta() {
         cp = new ContaPoupanca();
    }
    
    public static void depositar(){
        cp.depositar(50);
    }

}
