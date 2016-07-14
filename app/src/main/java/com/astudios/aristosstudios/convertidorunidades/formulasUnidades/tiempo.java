package com.astudios.aristosstudios.convertidorunidades.formulasUnidades;

import android.app.Activity;

/**
 * Created by Aristos Studios on 6/9/2015.
 */
public class tiempo extends Activity {
    public double microsegundo_milisegundo(double microsegundo){
        double milisegundo=microsegundo/1000;
        return milisegundo;
    }
    public double microsegundo_segundo(double microsegundo){
        double segundo=microsegundo/1000000;
        return segundo;
    }
    public double microsegundo_minuto(double microsegundo){
        double minuto=microsegundo/(1000000*60);
        return minuto;
    }
    public double microsegundo_hora(double microsegundo){
        double hora=microsegundo/(1000000*60*60);
        return hora;
    }
    public double microsegundo_dia(double microsegundo){
        double dia=microsegundo/(1000000*60*60*24);
        return dia;
    }
    public double microsegundo_semana(double microsegundo){
        double semana=microsegundo/(1000000*60*60*24*7);
        return semana;
    }
    public double microsegundo_año(double microsegundo){
        double año=microsegundo/(1000000*60*60*24*365);
        return año;
    }


    public double milisegundo_microsegundo(double milisegundo){
        double microsegundo=milisegundo*1000;
        return microsegundo;
    }
    public double milisegundo_segundo(double milisegundo){
        double segundo=milisegundo/(1000);
        return segundo;
    }
    public double milisegundo_minuto(double milisegundo){
        double minuto=milisegundo/(1000*60);
        return minuto;
    }
    public double milisegundo_hora(double milisegundo){
        double hora=milisegundo/(1000*60*60);
        return hora;
    }
    public double milisegundo_dia(double milisegundo){
        double dia=milisegundo/(1000*60*60*24);
        return dia;
    }
    public double milisegundo_semana(double milisegundo){
        double semana=milisegundo/(1000*60*60*24*7);
        return semana;
    }
    public double milisegundo_año(double milisegundo){
        double año=milisegundo/(1000*60*60*24*365);
        return año;
    }


    public double segundo_microsegundo(double segundo){
        double microsegundo=segundo*1000000;
        return microsegundo;
    }
    public  double segundo_milisegundo(double segundo){
        double milisegundo=segundo*1000;
        return milisegundo;
    }
    public  double segundo_minuto(double segundo){
        double minuto=segundo/60;
        return minuto;
    }
    public  double segundo_hora(double segundo){
        double hora=segundo/(60*60);
        return hora;
    }
    public  double segundo_dia(double segundo){
        double dia=segundo/(60*60*24);
        return dia;
    }
    public  double segundo_semana(double segundo){
        double semana=segundo/(60*60*24*7);
        return semana;
    }
    public  double segundo_año(double segundo){
        double año=segundo/(60*60*24*365);
        return año;
    }


    public double minuto_microsegundo(double minuto){
        double microsegundo=minuto*(1000000*60);
        return microsegundo;
    }
    public double minuto_milisegundo(double minuto){
        double milisegundo=minuto*(1000*60);
        return milisegundo;
    }
    public double minuto_segundo(double minuto){
        double segundo=minuto*60;
        return segundo;
    }
    public double minuto_hora(double minuto){
        double hora=minuto/(60);
        return hora;
    }
    public double minuto_dia(double minuto){
        double dia=minuto/(24*60);
        return dia;
    }
    public double minuto_semana(double minuto){
        double semana=minuto/(24*60*7);
        return semana;
    }
    public double minuto_año(double minuto){
        double año=minuto/(60*24*365);
        return año;
    }


    public double hora_microsegundo(double hora){
        double microsegundo=hora*(1000000*60*60);
        return microsegundo;
    }
    public double hora_milisegundo(double hora){
        double milisegundo=hora*(1000*60*60);
        return milisegundo;
    }
    public double hora_segundo(double hora){
        double segundo=hora*(60*60);
        return segundo;
    }
    public double hora_minuto(double hora){
        double minuto=hora*(60);
        return minuto;
    }
    public double hora_dia(double hora){
        double dia=hora/(24);
        return dia;
    }
    public double hora_semana(double hora){
        double semana=hora/(24*7);
        return semana;
    }
    public double hora_año(double hora){
        double año=hora/(24*365);
        return año;
    }

    public double dia_microsegundo(double dia){
        double microsegundo=dia*(1000000*60*60*24);
        return microsegundo;
    }
    public double dia_milisegundo(double dia){
        double milisegundo=dia*(1000*60*60*24);
        return milisegundo;
    }
    public double dia_segundo(double dia){
        double segundo=dia*(60*60*24);
        return segundo;
    }
    public double dia_minuto(double dia){
        double minuto=dia*(60*24);
        return minuto;
    }
    public double dia_hora(double dia){
        double hora=dia*(24);
        return hora;
    }
    public double dia_semana(double dia){
        double semana=dia/(7);
        return semana;
    }
    public double dia_año(double dia){
        double año=dia/(365);
        return año;
    }


    public double semana_microsegundo(double semana){
        double microsegundo=semana*(1000000*60*60*24*7);
        return microsegundo;
    }
    public double semana_milisegundo(double semana){
        double milisegundo=semana*(1000*60*60*24*7);
        return milisegundo;
    }
    public double semana_segundo(double semana){
        double segundo=semana*(60*60*24*7);
        return segundo;
    }
    public double semana_minuto(double semana){
        double minuto=semana*(60*24*7);
        return minuto;
    }
    public double semana_hora(double semana){
        double hora=semana*(24*7);
        return hora;
    }
    public double semana_dia(double semana){
        double dia=semana*(7);
        return dia;
    }
    public double semana_año(double semana){
        double año=semana/(52.1429);
        return año;
    }


    public double año_microsegundo(double año){
        double microsegundo=año*(1000000*60*60*24*365);
        return microsegundo;
    }
    public double año_milisegundo(double año){
        double milisegundo=año*(1000*60*60*24*365);
        return milisegundo;
    }
    public double año_segundo(double año){
        double segundo=año*(60*60*24*365);
        return segundo;
    }
    public double año_minuto(double año){
        double minuto=año*(60*24*365);
        return minuto;
    }
    public double año_hora(double año){
        double hora=año*(24*365);
        return hora;
    }
    public double año_dia(double año){
        double dia=año*(365);
        return dia;
    }
    public double año_semana(double año){
        double semana=año*(52.1429);
        return semana;
    }
}
