/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Anderson
 */
public class ContaPoupanca extends Conta{
    double saldoPoupanca;
    
    @Override
    public void imprimirTipoConta() {
        System.out.println("Conta Pupança");
    }
    
    public void depositar(double valor){
    saldoPoupanca += valor;
    }
    
   
}
