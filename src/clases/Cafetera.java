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
        this.cantA = cantA;
        if (this.cantA > this.capM) {
            this.cantA = this.capM;
            JOptionPane.showMessageDialog(null, "La capacidad de la cafetera se a igualado a la capacidad maxima", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void LlenarCafetera() {
        this.cantA = this.capM;
    }
    
    
    
       public void Vaciar_Cafetera() {
        this.cantA = 0;
        this.capM = this.getCapM();
    }

       
       
    public void Servir_Tazas(int n_tazas, int cc) {
        int aux;
        aux = cc * n_tazas;
        this.cantA = this.getCantA() - aux;
        if (this.cantA < 0) {
            this.cantA = 0;
        }

    }

    
    
    public void AgregarCafeC(int cantidad) {
        int aux;
        if (cantidad > getCapM()) {
            this.cantA = this.capM;
        } else {
            aux = getCantA() + cantidad;
            if (aux > getCapM()) {
                JOptionPane.showMessageDialog(null, "No se puede agregar más cafe a la cafetera", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                this.cantA = aux;
            }
        }
    }


}
