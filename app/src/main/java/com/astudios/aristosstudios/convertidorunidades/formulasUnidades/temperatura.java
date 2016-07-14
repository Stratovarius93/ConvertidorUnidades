package com.astudios.aristosstudios.convertidorunidades.formulasUnidades;

import android.app.Activity;

/**
 * Created by Aristos Studios on 6/9/2015.
 */
public class temperatura extends Activity {
    public double celcius_fahrenheit(double celcius){
        double fahrenheit=celcius*(9/5)+32;
        return fahrenheit;
    }

    public double fahrenheit_celcius(double fahrenheit){
        double celcius=(fahrenheit-32)/(1.8);
        return celcius;
    }

    public double celsius_kelvin(double celsius){
        double kelvin=celsius+273.15;
        return kelvin;
    }

    public double kelvin_celsius(double kelvin){
        double celsius=kelvin-273.15;
        return celsius;
    }

    public double kelvin_fahrenheit(double kelvin){
        double fahrenheit=((9*(kelvin-273.15))/5)+32;
        return fahrenheit;
    }

    public double fahrenheit_kelvin(double fahrenheit){
        double kelvin=((5*fahrenheit-32)/9)+273.15;
        return kelvin;
    }
}
