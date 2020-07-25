package aula2;

public class Main {

    public static void main(String[] args) {
        Conta c = new Conta("Anderson", 0);
        c.setNome("Jose");
        c.setSaldo(10);
        c.setIdade(10);
               
        System.out.println("Ver saldo do " + c.getNome() + " - " + c.getSaldo());
    }

}
