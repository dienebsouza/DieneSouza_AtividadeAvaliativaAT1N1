/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author laboratorio
 */
public class Hotel {
    private String cliente;
    private double dias;
    private double diaria;
    double maior;
    double total;
    int count;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
        
        //CALCULO VALOR TOTAL DIAS X DIÁRIA
        total = this.diaria*this.dias;
        
        //VERIFICAÇÃO + DE 3 DIAS
        if(this.dias >= 3){
            count++;
        }
        
        //MAIOR VALOR DE DIÁRIA
        if(this.total > maior){
            maior = this.total;
        }
        
    }
    
    public double resp_ValorTotal(){
        return total;
    }
    
    public double resp_Mais3Dias(){
        return count;
    }
    
    public double resp_MaisCaro(){
        return maior;
    }
}
