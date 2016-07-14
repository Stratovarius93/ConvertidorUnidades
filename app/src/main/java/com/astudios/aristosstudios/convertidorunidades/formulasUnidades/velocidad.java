package com.astudios.aristosstudios.convertidorunidades.formulasUnidades;

/**
 * Created by Aristos Studios on 14/1/2016.
 */
public class velocidad {
    //centimetros por segundo
    //metros por segundo
    //kilometros por hora
    //pies por segundo
    //millas por hora
    //nudos
    //mach
    public double centimetrosPSegundo_metrosSegundo(double centimetrosSegundo){double metrosSegundo=centimetrosSegundo*0.01; return metrosSegundo;}
    public double centimetrosPSegundo_kilometrosHora(double centimetrosSegundo){double kilometroHora=centimetrosSegundo*0.036; return kilometroHora;}
    public double centimetrosPSegundo_piesSegundo(double centimetrosSegundo){double piesSegundo=centimetrosSegundo*0.032808; return piesSegundo;}
    public double centimetrosPSegundo_millasHora(double centimetrosSegundo){double millasHora=centimetrosSegundo*0.022371; return millasHora;}
    public double centimetrosPSegundo_nudos(double centimetrosSegundo){double nudos=centimetrosSegundo*0.01944; return nudos;}
    public double centimetrosPSegundo_mach(double centimetrosSegundo){double mach=centimetrosSegundo*0.000029; return mach;}

    public double metrosSegundo_centimetrosSegundo(double metrosSegundo){double centimetrosSegundo=metrosSegundo*100; return centimetrosSegundo;}
    public double metrosSegundo_kilometrosHora(double metrosSegundo){double kilometrosHora=metrosSegundo*3.6; return kilometrosHora;}
    public double metrosSegundo_piesSegundo(double metrosSegundo){double piesSegundo=metrosSegundo*3.28084; return piesSegundo;}
    public double metrosSegundo_millasHora(double metrosSegundo){double millasHora=metrosSegundo*2.237136; return millasHora;}
    public double metrisSegundo_nudos(double metrosSegundo){double nudos=metrosSegundo*1.944012; return nudos;}
    public double metrosSegundo_mach(double metrosSegundo){double mach=metrosSegundo*0.002939; return mach;}

    public double kilometrosHora_centimetrosSegundo(double kilometrosHora){double centimetrosHora=kilometrosHora*27.77778; return centimetrosHora;}
    public double kilometrosHora_metrosSegundo(double kilometrosHora){double metrosSegundo=kilometrosHora*0.277778; return metrosSegundo;}
    public double kilometrosHora_piesSegundo(double kilometrosHora){double piesSegundo=kilometrosHora*0.911344; return piesSegundo;}
    public double kilometrosHora_millasHora(double kilometrosHora){double millasHora=kilometrosHora*0.621427; return millasHora;}
    public double kilometrosHora_nudos(double kilometrosHora){double nudos=kilometrosHora*0.540003; return nudos;}
    public double kilometrosHora_mach(double kilometrosHora){double mach=kilometrosHora*0.000816; return mach;}

    public double piesSegundo_centometrosSegundo(double piesSegundo){double centimetrosSegundo=piesSegundo*30.48; return centimetrosSegundo;}
    public double piesSegundo_metrosSegundo(double piesSegundo){double metrosSegundo=piesSegundo*0.3048; return metrosSegundo;}
    public double piesSegundo_kilometrosHora(double piesSegundo){double kilometrosHora=piesSegundo*1.09728; return kilometrosHora;}
    public double piesSegundo_millasHora(double piesSegundo){double millasHora=piesSegundo*0.681879; return millasHora;}
    public double piesSegundo_nudos(double piesSegundo){double nudos=piesSegundo*0.592535; return nudos;}
    public double piesSegundo_mach(double piesSegundo){double mach=piesSegundo*0.000896; return mach;}

    public double millasHora_centimetrosSegundo(double millasHora){double centimetrosSegundo=millasHora*44.7; return centimetrosSegundo; }
    public double millasHora_metrosSegundo(double millasHora){double metrosSegundo=millasHora*0.447; return metrosSegundo;}
    public double millasHora_kilometrosHora(double millasHora){double kilometrosHora=millasHora*1.6092; return kilometrosHora;}
    public double millasHora_piesSegundo(double millasHora){double piesSegundo=millasHora*1.466535; return piesSegundo;}
    public double millasHora_nudos(double millasHora){double nudo=millasHora*0.868974; return nudo;}
    public double millasHora_mach(double millasHora){double mach=millasHora*0.001314; return mach;}

    public double nudos_centimetrosSegundo(double nudos){double centimetrosSegundo=nudos*51.44; return centimetrosSegundo;}
    public double nudos_metrosSegundo(double nudos){double metrosSegundo=nudos*0.5144; return metrosSegundo;}
    public double nudos_kilometrosHora(double nudos){double kilometrosHora=nudos*1.85184; return kilometrosHora;}
    public double nudos_piesSegundo(double nudos){double piesSegundo=nudos*1.687664; return piesSegundo;}
    public double nudos_millasHora(double nudos){double millasHora=nudos*1.150783; return millasHora;}
    public double nudos_mach(double nudos){double mach=nudos*0.001512; return mach;}

    public double mach_centimetrosSegundo(double mach){double centimetrosSegundo=mach*34030; return centimetrosSegundo;}
    public double mach_metrosSegundo(double mach){double metrsoSegundo=mach*340.3; return metrsoSegundo;}
    public double mach_kilometroHora(double mach){double kilometroHpra=mach*1225.08; return kilometroHpra;}
    public double mach_piesSegundo(double mach){double piesSegundo=mach*1116.47;return piesSegundo;}
    public double mach_millasHora(double mach){double millasHora=mach*761.2975; return millasHora;}
    public double mach_nudos(double mach){double nudos=mach*661.5474; return nudos;}
}
