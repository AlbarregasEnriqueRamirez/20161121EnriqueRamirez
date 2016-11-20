/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.models;

import es.albarregas.beans.ContenidoBean;
import es.albarregas.beans.EdificioBean;

/**
 *
 * @author rpk19
 */
public class calcularCuota {
    
    public float getCuotaEdificio(EdificioBean e){
    float prima = 0;
    prima+= e.getPrecioEstimado()*0.05;
    prima*=e.getNumHabitaciones()/100;
    prima*=e.getAnioConstruccion();
    if(e.getTipoConstruccion().equals("Madera")){
        prima*=0.1;
    }
    return prima;
    }
    
    public float getCuotaContenido(ContenidoBean c){
        float prima = 0;
        prima+=c.getCantidadAsegurada()*0.08;
        prima*=c.getFranquicia();
        if(c.isDaniosAccidentales()){
           prima*=1.25;
        }
        return prima;
    }
}
