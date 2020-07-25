package aula1;


public class Conta {

    int numero;
    String nome;
    double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }    
// Contrutor é um método para instaciar os objetos
    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta(int n, String nom) {
        numero = n;
        nome = nom;
    }


    public void verSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        verSaldo();
    }

    public boolean sacar(double valor) {
        if (saldo < valor) {
            return false;
        } else {
            saldo = saldo - valor;
            verSaldo();
            return true;
        }
    }

}
