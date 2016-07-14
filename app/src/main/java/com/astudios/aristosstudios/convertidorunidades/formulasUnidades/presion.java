package com.astudios.aristosstudios.convertidorunidades.formulasUnidades;

/**
 * Created by Aristos Studios on 7/1/2016.
 */
public class presion {
    //atmosferas
    //bares
    //kilopascales
    //milimetros de mercurio
    //pascales
    //libras por pulgada cuadrada
    public double atmosferas_bares(double atmosferas){double bares=atmosferas*1.01325; return bares;}
    public double atmosferas_kilopascales(double atmosferas){double kilopascales=atmosferas*101.325; return kilopascales;}
    public double atmosferas_milimetrosDeMercurio(double atmosfera){double milimetrosDeMercurio=atmosfera*759.9998199852; return milimetrosDeMercurio;}
    public double atmosferas_pascales(double atmosfera){double pascales=atmosfera*101325; return pascales;}
    public double atmosferas_librasPorPulgada(double atmosfera){double librasPorPulgada=atmosfera*14.6959; return librasPorPulgada;}

    public double bares_atmosferas(double bares){double atmosferas=bares*0.986923; return atmosferas;}
    public double bares_kilopascales(double bares){double kilopascales=bares*100; return kilopascales;}
    public double bares_milimetrosDeMercurio(double bares){double milimetrosDeMercurio=bares*750.0615050434; return milimetrosDeMercurio;}
    public double bares_pascales(double bares){double pascales=bares*100000; return pascales;}
    public double bares_librasPorPulgadaCuadrada(double bares){double librasPorPulgada=bares*14.5038; return librasPorPulgada;}

    public double kilopascales_atmosferas(double kilopascales){double atmosferas=kilopascales*0.0098692327; return atmosferas;}
    public double kilopascales_bares(double kilopascales){double bares=kilopascales*0.01; return bares;}
    public double kilopascales_milimetrosDeMercurio(double kilopascales){double milimetrosDeMercurio=kilopascales*7.5006150504; return milimetrosDeMercurio;}
    public double kilopascales_pascales(double kilopascales){double pascales=kilopascales*1000; return pascales;}
    public double kilopascales_librasPorPulgada(double kilopascales){double librasPorPulgada=kilopascales*0.145038; return librasPorPulgada;}

    public double milimetrosDeMercurio_atmosferas(double milimetrosDeMercurio){double atmosferas=milimetrosDeMercurio*0.0013157898; return atmosferas;}
    public double milimetrosDeMercurio_bares(double milimetrosDeMercurio){double bares=milimetrosDeMercurio*0.001333224; return bares;}
    public double milimetrosDeMercurio_kilopascales(double milimetrosDeMercurio){double kilopascales=milimetrosDeMercurio*0.1333224; return kilopascales;}
    public double milimetrosDeMercurio_pascales(double milimetrosDeMercurio){double pascales=milimetrosDeMercurio*133.3224; return pascales;}
    public double milimetrosDeMercurio_librasPorPulgadaCuadrada(double milimetrosDeMercurio){double librasPorPulgadaCuadrada=milimetrosDeMercurio*0.01934; return librasPorPulgadaCuadrada;}

    public double pascales_atmosferas(double pascales){double atmoseferas=pascales*9.8692326671601e-6; return atmoseferas;}
    public double pascales_bares(double pascales){double bares=pascales*1.0e-5; return bares;}
    public double pascales_kilopascales(double pascales){double kilopascales=pascales*0.001; return kilopascales;}
    public double pascales_milimetrosDeMercurio(double pascales){double milimetrosDeMercurio=pascales*0.0075006151; return milimetrosDeMercurio;}
    public double pascales_librasPorPulgadaCuadrada(double pascales){double librasPorPulgadaCuadrada=pascales*6894.76; return librasPorPulgadaCuadrada;}

    public double librasPorPulgadaCuadrada_atmosferas(double librasPorPulgadaCuadrada){double atmosfera=librasPorPulgadaCuadrada*0.068046;return atmosfera;}
    public double librasPorPulgadaCuadrada_bares(double librasPorPulgadaCuadrada){double bares=librasPorPulgadaCuadrada*0.0689476; return bares;}
    public double librasPorPulgadaCuadrada_kilopascales(double librasPorPulgadaCuadrada){double kilopascales=librasPorPulgadaCuadrada*6.895; return kilopascales;}
    public double librasPorPulgadaCuadrada_pascales(double librasPorPulgadaCuadrada){double pascales=librasPorPulgadaCuadrada*6894.76; return pascales;}
    public double librasPorPulgadaCuadrada_milimetrosDeMercurio2(double librasPorPulgadaCuadrada){double milimetrosDeMercurio=librasPorPulgadaCuadrada*51.72361; return milimetrosDeMercurio;}

}
