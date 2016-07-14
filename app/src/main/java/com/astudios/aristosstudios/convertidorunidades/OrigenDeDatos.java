package com.astudios.aristosstudios.convertidorunidades;

/**
 * Created by Aristos Studios on 18/10/2015.
 */
public class OrigenDeDatos {
    private String unidad;
    private double respuesta;
    public  OrigenDeDatos (String unidad, double respuesta){
        this.respuesta=respuesta;
        this.unidad=unidad;
    }
    public void setUnidad(String unidad){
        this.unidad=unidad;
    }

    public void setRespuesta(double respuesta){
        this.respuesta=respuesta;
    }

    public String getUnidad(){
        return unidad;
    }
    public double getRespuesta(){
        return respuesta;
    }

    @Override
    public String toString(){return unidad+","+respuesta;}
}
