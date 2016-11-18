/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

/**
 *
 * @author rpk19
 */
public class EdificioBean {
    //aqui guardaré los datos del seguro a edificios
    
    private String tipoEdificio;
    private int numHabitaciones;
    private int anioConstruccion;
    private String tipoConstruccion;
    private int precioEstimado;

    public String getTipoEdificio() {
        return tipoEdificio;
    }

    public void setTipoEdificio(String tipoEdificio) {
        this.tipoEdificio = tipoEdificio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(int anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public int getPrecioEstimado() {
        return precioEstimado;
    }

    public void setPrecioEstimado(int precioEstimado) {
        this.precioEstimado = precioEstimado;
    }
    
    
}
