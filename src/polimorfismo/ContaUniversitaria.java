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
public class ContaUniversitaria extends Conta{
    double saldoUniversitario;
    
    @Override
    public void imprimirTipoConta() {
        System.out.println("Conta Universitária");
    }
}
