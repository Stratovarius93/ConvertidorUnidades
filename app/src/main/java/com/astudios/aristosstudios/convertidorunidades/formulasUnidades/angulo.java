package com.astudios.aristosstudios.convertidorunidades.formulasUnidades;

/**
 * Created by Aristos Studios on 7/1/2016.
 */
public class angulo {
    public double grados_radianes(double grados){double radianes=grados*0.0174533; return radianes;}
    public double grados_gradosCentesimales(double grados){double gradosCentesimales=grados*1.11111; return gradosCentesimales;}
    public double radianes_grados(double radianes){double grados=radianes*57.2958; return grados;}
    public double radianes_gradoCentesimal(double radianes){double gradoCentesimal=radianes*63.662; return gradoCentesimal;}
    public double gradoCentesimal_radian(double gradoCentesimal){double radian=gradoCentesimal*0.015708; return radian;}
    public double gradoCentesimal_grado(double gradoCentesimal){double grado=gradoCentesimal*0.9; return grado;}
}
