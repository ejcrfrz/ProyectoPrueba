/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

/**
 *
 * @author EDUARDO
 */
public class Celular {

    /**
     * @return the camara
     */
    public String getCamara() {
        return camara;
    }

    /**
     * @param camara the camara to set
     */
    public void setCamara(String camara) {
        this.camara = camara;
    }

    /**
     * @return the pantalla
     */
    public String getPantalla() {
        return pantalla;
    }

    /**
     * @param pantalla the pantalla to set
     */
    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }
    
    private String camara;
    private String pantalla;
    
}
