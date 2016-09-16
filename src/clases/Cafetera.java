/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Cafetera {

    private int capM;
    private int cantA;

    public Cafetera() {
        this.capM = 1000;
        this.cantA = 0;
    }

    public int getCapM() {
        return capM;
    }

    public void setCapM(int capM) {
        this.capM = capM;
    }

    public int getCantA() {
        return cantA;
    }

    public void setCantA(int cantA) {
        this.cantA = cantA;
    }

    public Cafetera(int capM, int cantA) {
       this.capM = capM;
        if (cantA > capM) {
            this.cantA = capM;
        } else {
            this.cantA = cantA;
        }
    }

    public void LlenarCafetera() {
        this.cantA = this.capM;
    }
    
     
       public void Vaciar_Cafetera() {
        this.setCantA(0);
    }

       
       
    public void Servir_Tazas(int n_tazas, int cc) {
        int aux;
        aux = cc * n_tazas;
        this.cantA = this.getCantA() - aux;
        if (this.cantA < 0) {
            this.cantA = 0;
        }

    }

    
    
    public void AgregarCafe(int cantidad) {
        this.setCantA(this.getCantA() + cantidad);
    }
 
}