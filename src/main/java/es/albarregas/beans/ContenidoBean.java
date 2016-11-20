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
public class ContenidoBean {
    
    //este bean controlará los datos del segundo seguro
    
    private boolean daniosAccidentales;
    private float cantidadAsegurada;
    private float franquicia;

    public boolean isDaniosAccidentales() {
        return daniosAccidentales;
    }

    public void setDaniosAccidentales(boolean daniosAccidentales) {
        this.daniosAccidentales = daniosAccidentales;
    }

    public float getCantidadAsegurada() {
        return cantidadAsegurada;
    }

    public void setCantidadAsegurada(float cantidadAsegurada) {
        this.cantidadAsegurada = cantidadAsegurada;
    }

    public float getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(float franquicia) {
        this.franquicia = franquicia;
    }
    
    
}
