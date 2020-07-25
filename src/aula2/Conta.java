package aula2;

public class Conta {

    int numero;
    private String nome;
    private double saldo;
    private int idade;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0){
        this.saldo = saldo;
        } else {
            System.out.println("Deixa de ser fulero");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 17) {
            this.idade = idade;
        }
    }

//    Construtores
    public Conta(int numero, String nome, double saldo, int idade) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.idade = idade;
    }

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

}
