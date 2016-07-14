package com.astudios.aristosstudios.convertidorunidades.formulasUnidades;

/**
 * Created by Aristos Studios on 14/1/2016.
 */
public class potencia {
    //vatios
    //kilovatios
    //caballos de fuerza
    //pie-libras
    //unidades termicas britanicas
    public double vatios_kilovatios(double vatios){double kilovatios=vatios*0.001; return kilovatios;}
    public double vatios_caballosDeFuerza(double vatios){double caballosDeFuerza=vatios*0.001341; return caballosDeFuerza;}
    public double vatios_pieLibras(double vatios){double pieLibras=vatios*44.25373; return pieLibras;}
    public double vatios_unidadesTermicasBritanicas(double vatios){double unidadesTermicasBritanicas=vatios*0.056859; return unidadesTermicasBritanicas;}

    public double kilovatios_vatios(double kilovatios){double vatios=kilovatios*1000; return vatios;}
    public double kilovatios_caballosDeFuerza(double vatios){double caballosDeFuerza=vatios*1.341022; return caballosDeFuerza;}
    public double kilovatios_pieLibras(double vatio){double pieLibras=vatio*44253.73; return pieLibras;}
    public double kilovatios_unidadesTermicasBritanicas(double vatios){double unidadesTermicasBritanicas=vatios*56.86902; return unidadesTermicasBritanicas;}

    public double caballosFuerza_vatios(double caballosDeFuerza){double vatios=caballosDeFuerza*745.6999; return vatios;}
    public double caballosFuerza_kilovatios(double caballosDeFuerza){double kilovatios=caballosDeFuerza*0.7457; return kilovatios;}
    public double caballosFuerza_pieLibras(double caballosDeFuerza){double pieLibras=caballosDeFuerza*33000; return pieLibras;}
    public double caballosFuerza_unidadesTermicasBritanicas(double caballosDeFuerza){double unidadesTermicasBritanicas=caballosDeFuerza*42.40722; return unidadesTermicasBritanicas;}

    public double pieLibras_vatios(double pieLibras){double vatios=pieLibras*0.022597; return vatios;}
    public double pieLibras_kilovatios(double pieLibras){double kilovatios=pieLibras*0.000023; return kilovatios;}
    public double pieLibras_caballosDeFuerza(double pieLibras){double caballosDeFuerza=pieLibras*0.00003; return caballosDeFuerza;}
    public double pieLibras_unidadesTermicasBritanicas(double pieLibras){double unidadesTermicasBritanicas=pieLibras*0.001285; return unidadesTermicasBritanicas;}

    public double unidadesTermicasBritanicas_vatios(double unidadesTermicasBritanicas){double vatios=unidadesTermicasBritanicas*17.58427; return vatios;}
    public double unidadesTermicasBritanicas_kilovatios(double unidadesTermicasBritanicas){double kilovatios=unidadesTermicasBritanicas*0.017584; return kilovatios;}
    public double unidadesTermicasBritanicas_caballosDeFuerza(double unidadesTermicasBritanicas){double caballosDeFuerza=unidadesTermicasBritanicas*0.023581; return caballosDeFuerza;}
    public double unidadesTermicasBritanicas_pieLibras(double unidadesTermicasBritanicas){double pieLibras=unidadesTermicasBritanicas*778.1694; return pieLibras;}
}
