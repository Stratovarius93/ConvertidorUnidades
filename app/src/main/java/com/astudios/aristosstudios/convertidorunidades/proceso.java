package com.astudios.aristosstudios.convertidorunidades;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Bits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Bytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Exbibits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Gibibits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Gibibytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Gigabits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Gigabytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Hexabits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Hexabytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Hexbibytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Kibibits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Kibibytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Kilobits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Kilobytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Mebibits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Mebibytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Megabits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Megabytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Pebibits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Pebibytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Petabits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Petabytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Tebibits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Tebibytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Terabits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Terabytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Yobibits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Yobibytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Yottabit;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Yottabyte;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Zebibits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Zebibytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Zetabits;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.GestionFormulasDatos.Zetabytes;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.angulo;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.area;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.datos;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.energia;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.longitud;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.peso_masa;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.potencia;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.presion;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.temperatura;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.tiempo;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.velocidad;
import com.astudios.aristosstudios.convertidorunidades.formulasUnidades.volumen;

import java.util.List;

import me.grantland.widget.AutofitHelper;
import me.grantland.widget.AutofitTextView;

public class proceso extends AppCompatActivity {
    public Spinner lista;
    public TextView texto;
    public TextView respuesta;
    private Typeface fuente;
    public keyboard key=new keyboard();
    public Spinner lista_unidad1;
    public Spinner lista_unidad2;
    public static String toast_principal=null;
    public int posicion=0;
    public Vibrator vibración;
    public String unidad1=null;
    public String unidad2=null;
    public TextView uni1;
    public TextView uni2;
    public ListView listaUnidades;

    //public static String numero_ing=null;

    public temperatura formulas_temperatura=new temperatura();
    public tiempo formulas_tiempo=new tiempo();
    public volumen formulas_volumen=new volumen();
    public longitud formulas_longitud=new longitud();
    public angulo formulas_angulo=new angulo();
    public presion formulas_presion=new presion();
    public potencia formulas_potencia=new potencia();
    public velocidad formulas_velocidad=new velocidad();
    public energia formulas_energia=new energia();
    public peso_masa formulas_pesoMasa=new peso_masa();
    public area formulas_area=new area();
    public datos formulas_datos=new datos();

    public Bits bits=new Bits();
    public Bytes bytes=new Bytes();
    public Kilobits kilobits=new Kilobits();
    public Kibibits kibibits=new Kibibits();
    public Kilobytes kilobytes=new Kilobytes();
    public Kibibytes kibibytes=new Kibibytes();
    public Megabits megabits=new Megabits();
    public Mebibits mebibits=new Mebibits();
    public Megabytes megabytes=new Megabytes();
    public Mebibytes mebibytes=new Mebibytes();
    public Gigabits gigabits=new Gigabits();
    public Gibibits gibibits=new Gibibits();
    public Gigabytes gigabytes=new Gigabytes();
    public Gibibytes gibibytes=new Gibibytes();
    public Terabits terabits=new Terabits();
    public Tebibits tebibits=new Tebibits();
    public Terabytes terabytes=new Terabytes();
    public Tebibytes tebibytes=new Tebibytes();
    public Petabits petabits=new Petabits();
    public Pebibits pebibits=new Pebibits();
    public Petabytes petabytes=new Petabytes();
    public Pebibytes pebibytes=new Pebibytes();
    public Hexabits hexabits=new Hexabits();
    public Exbibits exbibits=new Exbibits();
    public Hexabytes hexabytes=new Hexabytes();
    public Hexbibytes hexbibytes=new Hexbibytes();
    public Zetabits zetabits=new Zetabits();
    public Zebibits zebibits=new Zebibits();
    public Zetabytes zetabytes=new Zetabytes();
    public Zebibytes zebibytes=new Zebibytes();
    public Yottabit yottabit=new Yottabit();
    public Yobibits yobibits=new Yobibits();
    public Yottabyte yottabyte=new Yottabyte();
    public Yobibytes yobibytes=new Yobibytes();

    public SetDatos setDatos=new SetDatos();
    SharedPreferences sharedPreferences;

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proceso);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if(Build.VERSION.SDK_INT<= Build.VERSION_CODES.KITKAT){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }


        //fuente
        String direccion="fonts/Roboto-Thin.ttf";
        fuente= Typeface.createFromAsset(getAssets(), direccion);

        //UNIDADES
        uni1=(TextView)findViewById(R.id.unidadEntrada);
        uni2=(TextView)findViewById(R.id.unidadSalida);
        //respuesta=(TextView)findViewById(R.id.texto_salida);
        respuesta=(AutofitTextView)findViewById(R.id.texto_salida);


        //LAYOUT
        final AppBarLayout bar;
        bar=(AppBarLayout)findViewById(R.id.AppBar);

        //backgroundLayout(bar);

        //texto ingreso
        texto=(AutofitTextView)findViewById(R.id.texto_ingreso);
        texto.setText(key.numero);
        texto.setTypeface(fuente, Typeface.BOLD);
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setDatos.setNumero(texto.getText().toString());
                boolean intentActivity = false;
                if (intentActivity == false) {
                    startActivity(new Intent(proceso.this, keyboard.class));
                    finish();
                    intentActivity = true;
                } else {
                    intent.setClass(proceso.this, keyboard.class);
                    //intent.setClass(proceso.this, keyboard.class);
                    finish();
                }

            }
        });

        texto.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                final View view=v;
                vibración =(Vibrator)getSystemService(VIBRATOR_SERVICE);
                vibración.vibrate(10);
                final CharSequence[]items=getResources().getStringArray(R.array.lista_pegar);
                final ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                AlertDialog.Builder builder = new AlertDialog.Builder(proceso.this);
                builder.setTitle(R.string.opcion_pegar);
                builder.setNegativeButton(R.string.cancelar, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface builder, int id) {
                        builder.cancel();
                    }
                });
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        switch (item) {
                            case 0: {
                                ClipData abc = clipboard.getPrimaryClip();
                                ClipData.Item items = abc.getItemAt(0);
                                String text = items.getText().toString();
                                if(isNumeric(text)==true || isDouble(text)== true){

                                    texto.setText("");
                                    texto.setText(text);
                                    calcular(view);
                                }else{
                                Toast.makeText(getApplicationContext(), R.string.Tipo_De_Dato_No_valido,
                                        Toast.LENGTH_SHORT).show();
                                }
                                dialog.cancel();

                            }
                            break;
                            case 1: {
                                ClipData clip = ClipData.newPlainText("", texto.getText().toString());
                                clipboard.setPrimaryClip(clip);
                                Toast.makeText(getApplicationContext(), R.string.texto_copiado,
                                        Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                            break;
                    }
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
                return false;
            }
        });
        respuesta.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {
                final String es=getResources().getString(R.string.es);
                final String elemento1=respuesta.getText().toString();
                final String elemento2=respuesta.getText().toString()+" "+unidad2;
                final String elemento3=texto.getText().toString()+" "+unidad1+" = "+respuesta.getText().toString()+" "+unidad2;
                final String elemento4=texto.getText().toString()+" "+unidad1+" "+es+" "+respuesta.getText().toString()+" "+unidad2;
                final CharSequence[] items = {elemento1, elemento2, elemento3, elemento4};

                final ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

                AlertDialog.Builder builder = new AlertDialog.Builder(proceso.this);
                builder.setTitle(R.string.seleccione_una_opcion);

                builder.setNegativeButton(R.string.cancelar, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface builder, int id) {
                        builder.cancel();
                    }
                });

                builder.setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        switch (item) {
                            case 0: {
                                ClipData clip = ClipData.newPlainText("", elemento1);
                                clipboard.setPrimaryClip(clip);
                                Toast.makeText(getApplicationContext(), R.string.texto_copiado,
                                        Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                            break;
                            case 1: {
                                ClipData clip = ClipData.newPlainText("", elemento2);
                                clipboard.setPrimaryClip(clip);
                                Toast.makeText(getApplicationContext(), R.string.texto_copiado,
                                        Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                            break;
                            case 2: {
                                ClipData clip = ClipData.newPlainText("", elemento3);
                                clipboard.setPrimaryClip(clip);
                                Toast.makeText(getApplicationContext(), R.string.texto_copiado,
                                        Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                            break;
                            case 3: {
                                ClipData clip = ClipData.newPlainText("", elemento4);
                                clipboard.setPrimaryClip(clip);
                                Toast.makeText(getApplicationContext(), R.string.texto_copiado,
                                        Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                            break;
                        }
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();

                return true;    // <- set to true
            }
        });

        uni1.setTypeface(fuente, Typeface.BOLD);
        uni2.setTypeface(fuente, Typeface.BOLD);
        unidad1=uni1.getText().toString();
        unidad2=uni2.getText().toString();
        respuesta.setTypeface(fuente, Typeface.BOLD);

        AutofitHelper.create(texto);
        AutofitHelper.create(respuesta);

        //Arreglos
        String []datos=getResources().getStringArray(R.array.magnitudes);

        lista=(Spinner)findViewById(R.id.magnitud);
        lista_unidad1=(Spinner)findViewById(R.id.unidad);
        lista_unidad2=(Spinner)findViewById(R.id.unidad2);

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,datos);

        lista.setAdapter(adaptador);

        //LISTA
        listaUnidades=(ListView)findViewById(R.id.listView);
        //ArrayAdapter arrayAdapter;

        // Unidades de medida
        final String []unidades_volumen=getResources().getStringArray(R.array.unidades_volumen);
        final String []unidades_longitud=getResources().getStringArray(R.array.unidades_longitud);
        final String []unidades_peso=getResources().getStringArray(R.array.unidades_peso);
        final String []unidades_temperatura=getResources().getStringArray(R.array.unidades_temperatura);
        final String []unidades_energia=getResources().getStringArray(R.array.unidades_energia);
        final String []unidades_area=getResources().getStringArray(R.array.unidades_area);
        final String []unidades_velocidad=getResources().getStringArray(R.array.unidades_velocidad);
        final String []unidades_tiempo=getResources().getStringArray(R.array.unidades_tiempo);
        final String []unidades_potencia=getResources().getStringArray(R.array.unidades_potencia);
        final String []unidades_datos=getResources().getStringArray(R.array.unidades_datos);
        final String []unidades_presion=getResources().getStringArray(R.array.unidades_presion);
        final String []unidades_angulo=getResources().getStringArray(R.array.unidades_angulo);


        //opciones unidades
        final ArrayAdapter<String>adapter0=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_volumen);
        final ArrayAdapter<String>adapter1=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_longitud);
        final ArrayAdapter<String>adapter2=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_peso);
        final ArrayAdapter<String>adapter3=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_temperatura);
        final ArrayAdapter<String>adapter4=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_energia);
        final ArrayAdapter<String>adapter5=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_area);
        final ArrayAdapter<String>adapter6=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_velocidad);
        final ArrayAdapter<String>adapter7=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_tiempo);
        final ArrayAdapter<String>adapter8=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_potencia);
        final ArrayAdapter<String>adapter9=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_datos);
        final ArrayAdapter<String>adapter10=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_presion);
        final ArrayAdapter<String>adapter11=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item,unidades_angulo);

        SharedPreferences sharedPreferences = getSharedPreferences("perfil", MODE_PRIVATE);
        int pos=sharedPreferences.getInt("posicion", 0);

        lista.setSelection(pos);
        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] datos = getResources().getStringArray(R.array.magnitudes);

                SharedPreferences settings = getSharedPreferences("perfil", MODE_PRIVATE);
                final SharedPreferences.Editor editor = settings.edit();
                editor.putInt("posicion",position);
                editor.commit();

                SharedPreferences sharedPreferences2 = getSharedPreferences("perfil", MODE_PRIVATE);
                posicion = position;
                toast_principal = datos[position];
                //cargarLista(posicion);
                if(posicion==0){

                    lista_unidad1.setAdapter(adapter0);
                    lista_unidad2.setAdapter(adapter0);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion0", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion0",0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_volumen=getResources().getStringArray(R.array.unidades_volumen);
                            unidad1=unidades_volumen[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion0", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_volumen=getResources().getStringArray(R.array.unidades_volumen);
                            unidad2=unidades_volumen[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion0",position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }

                //case 1:{//longitud
                //case "Longitud":{//longitud
                if(posicion==1){
                    lista_unidad1.setAdapter(adapter1);
                    lista_unidad2.setAdapter(adapter1);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion1", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion1", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_longitud=getResources().getStringArray(R.array.unidades_longitud);
                            unidad1=unidades_longitud[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion1", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_longitud=getResources().getStringArray(R.array.unidades_longitud);
                            unidad2=unidades_longitud[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion1", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });}

                //case 2:{//peso
                //case "Peso y masa":{//peso
                if(posicion==2){
                    lista_unidad1.setAdapter(adapter2);
                    lista_unidad2.setAdapter(adapter2);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion2", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion2", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_peso=getResources().getStringArray(R.array.unidades_peso);
                            unidad1=unidades_peso[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion2", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_peso=getResources().getStringArray(R.array.unidades_peso);
                            unidad2=unidades_peso[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion2", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
                //case 3:{//temperatura
                //case "Temperatura":{//temperatura
                if(posicion==3){

                    lista_unidad1.setAdapter(adapter3);
                    lista_unidad2.setAdapter(adapter3);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion3", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion3", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_temperatura=getResources().getStringArray(R.array.unidades_temperatura);
                            unidad1=unidades_temperatura[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion3", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_temperatura=getResources().getStringArray(R.array.unidades_temperatura);
                            unidad2=unidades_temperatura[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion3", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
                //case 4:{//energía
                //case "Energía":{//energía
                if(posicion==4){

                    lista_unidad1.setAdapter(adapter4);
                    lista_unidad2.setAdapter(adapter4);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion4", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion4", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_energia=getResources().getStringArray(R.array.unidades_energia);
                            unidad1=unidades_energia[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion4", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_energia=getResources().getStringArray(R.array.unidades_energia);
                            unidad2=unidades_energia[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion4", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
                //case 5:{//área
                //case "Área":{//área
                if(posicion==5){

                    lista_unidad1.setAdapter(adapter5);
                    lista_unidad2.setAdapter(adapter5);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion5", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion5", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_area=getResources().getStringArray(R.array.unidades_area);
                            unidad1=unidades_area[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion5", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_area=getResources().getStringArray(R.array.unidades_area);
                            unidad2=unidades_area[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion5", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
                //case 6:{//velocidad
                //case "Velocidad":{//velocidad
                if(posicion==6){

                    lista_unidad1.setAdapter(adapter6);
                    lista_unidad2.setAdapter(adapter6);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion6", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion6", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_velocidad=getResources().getStringArray(R.array.unidades_velocidad);
                            unidad1=unidades_velocidad[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion6", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_velocidad=getResources().getStringArray(R.array.unidades_velocidad);
                            unidad2=unidades_velocidad[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion6", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
                //case 7:{//tiempo
                //case "Tiempo":{//tiempo
                if(posicion==7){

                    lista_unidad1.setAdapter(adapter7);
                    lista_unidad2.setAdapter(adapter7);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion7", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion7", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_tiempo=getResources().getStringArray(R.array.unidades_tiempo);
                            unidad1=unidades_tiempo[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion7", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_tiempo=getResources().getStringArray(R.array.unidades_tiempo);
                            unidad2=unidades_tiempo[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion7", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
                //case 8:{//potencia
                //case "Potencia":{//potencia
                if(posicion==8){

                    lista_unidad1.setAdapter(adapter8);
                    lista_unidad2.setAdapter(adapter8);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion8", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion8", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_potencia=getResources().getStringArray(R.array.unidades_potencia);
                            unidad1=unidades_potencia[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion8", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_potencia=getResources().getStringArray(R.array.unidades_potencia);
                            unidad2=unidades_potencia[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion8", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
                //case 9:{//datos
                //case "Datos":{//datos
                if(posicion==9){

                    lista_unidad1.setAdapter(adapter9);
                    lista_unidad2.setAdapter(adapter9);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion9", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion9", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_datos=getResources().getStringArray(R.array.unidades_datos);
                            unidad1=unidades_datos[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion9", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_datos=getResources().getStringArray(R.array.unidades_datos);
                            unidad2=unidades_datos[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion9", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
                //case 10:{//presión
                //case "Presión":{//presión
                if(posicion==10){

                    lista_unidad1.setAdapter(adapter10);
                    lista_unidad2.setAdapter(adapter10);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion10", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion10", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_presion=getResources().getStringArray(R.array.unidades_presion);
                            unidad1=unidades_presion[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion10", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_presion=getResources().getStringArray(R.array.unidades_presion);
                            unidad2=unidades_presion[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion10", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }
                //case 11:{//ángulo
                //case "Ángulo":{//ángulo
                if(posicion==11){

                    lista_unidad1.setAdapter(adapter11);
                    lista_unidad2.setAdapter(adapter11);
                    lista_unidad1.setSelection(sharedPreferences2.getInt("1posicion11", 0));
                    lista_unidad2.setSelection(sharedPreferences2.getInt("2posicion11", 0));
                    lista_unidad1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_angulo=getResources().getStringArray(R.array.unidades_angulo);
                            unidad1=unidades_angulo[position];
                            uni1.setText(unidad1);
                            editor.putInt("1posicion11", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });

                    lista_unidad2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            String []unidades_angulo=getResources().getStringArray(R.array.unidades_angulo);
                            unidad2=unidades_angulo[position];
                            uni2.setText(unidad2);
                            editor.putInt("2posicion11", position);
                            editor.commit();
                            calcular(view);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                        }
                    });
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final String elemento1=respuesta.getText().toString();
                final String elemento2=respuesta.getText().toString()+" "+unidad2;
                final String elemento3=texto.getText().toString()+" "+unidad1+" = "+respuesta.getText().toString()+" "+unidad2;
                final String elemento4=texto.getText().toString()+" "+unidad1+" es "+respuesta.getText().toString()+" "+unidad2;
                final CharSequence[] items = {elemento1, elemento2, elemento3, elemento4};

                final ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

                AlertDialog.Builder builder = new AlertDialog.Builder(proceso.this);
                builder.setTitle(R.string.seleccione_una_opcion);

                builder.setNegativeButton(R.string.cancelar, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface builder, int id) {
                        builder.cancel();
                    }
                });

                builder.setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        switch (item) {
                            case 0: {
                                ClipData clip = ClipData.newPlainText("", elemento1);
                                clipboard.setPrimaryClip(clip);
                                Toast.makeText(getApplicationContext(), R.string.texto_copiado,
                                        Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                            break;
                            case 1: {
                                ClipData clip = ClipData.newPlainText("", elemento2);
                                clipboard.setPrimaryClip(clip);
                                Toast.makeText(getApplicationContext(), R.string.texto_copiado,
                                        Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                            break;
                            case 2: {
                                ClipData clip = ClipData.newPlainText("", elemento3);
                                clipboard.setPrimaryClip(clip);
                                Toast.makeText(getApplicationContext(), R.string.texto_copiado,
                                        Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                            break;
                            case 3: {
                                ClipData clip = ClipData.newPlainText("", elemento4);
                                clipboard.setPrimaryClip(clip);
                                Toast.makeText(getApplicationContext(), R.string.texto_copiado,
                                        Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                            break;
                        }
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }


    public void calcular(View v) {
        vibración =(Vibrator)getSystemService(VIBRATOR_SERVICE);
        vibración.vibrate(10);
        texto=(TextView)findViewById(R.id.texto_ingreso);

        double num_ingresado=0;
        if(texto.getText().equals("")||texto.getText().length()<1){
            texto.setText("0");
        }else{
            num_ingresado=Double.parseDouble(texto.getText().toString());
            //gestionF.gestion(toast_principal, unidad1,unidad2,num_ingresado);
            //ARRAY MAGNITUDES
            String []datos=getResources().getStringArray(R.array.magnitudes);
            //ARRAY UNIDADES
            String []unidades_volumen=getResources().getStringArray(R.array.unidades_volumen);
            String []unidades_longitud=getResources().getStringArray(R.array.unidades_longitud);
            String []unidades_peso=getResources().getStringArray(R.array.unidades_peso);
            String []unidades_temperatura=getResources().getStringArray(R.array.unidades_temperatura);
            String []unidades_energia=getResources().getStringArray(R.array.unidades_energia);
            String []unidades_area=getResources().getStringArray(R.array.unidades_area);
            String []unidades_velocidad=getResources().getStringArray(R.array.unidades_velocidad);
            String []unidades_tiempo=getResources().getStringArray(R.array.unidades_tiempo);
            String []unidades_potencia=getResources().getStringArray(R.array.unidades_potencia);
            String []unidades_datos=getResources().getStringArray(R.array.unidades_datos);
            String []unidades_presion=getResources().getStringArray(R.array.unidades_presion);
            String []unidades_angulo=getResources().getStringArray(R.array.unidades_angulo);

            //TEMPERATURA
            String celcius = unidades_temperatura[0];
            String fahrenheit = unidades_temperatura[1];
            String kelvin = unidades_temperatura[2];
            //LONGITUD
            String nanometros=unidades_longitud[0];
            String micrometros=unidades_longitud[1];
            String milimetros=unidades_longitud[2];
            String centimetros=unidades_longitud[3];
            String metros=unidades_longitud[4];
            String decimetros=unidades_longitud[5];
            String decametros=unidades_longitud[6];
            String kilometros=unidades_longitud[7];
            String pulgadas=unidades_longitud[8];
            String pies=unidades_longitud[9];
            String yardas=unidades_longitud[10];
            String millas=unidades_longitud[11];
            String millas_nauticas=unidades_longitud[12];
            String años_luz=unidades_longitud[13];
            //TIEMPO
            String microsegundo=unidades_tiempo[0];
            String milisegundo=unidades_tiempo[1];
            String segundo=unidades_tiempo[2];
            String minuto=unidades_tiempo[3];
            String hora=unidades_tiempo[4];
            String dia=unidades_tiempo[5];
            String semana=unidades_tiempo[6];
            String año=unidades_tiempo[7];
            //VOLUMEN
            String mililitro=unidades_volumen[0];
            String centimetroc=unidades_volumen[1];
            String litro=unidades_volumen[2];
            String metroc=unidades_volumen[3];
            String pulgadac=unidades_volumen[4];
            String piec=unidades_volumen[5];
            String yardac=unidades_volumen[6];
            //ANGULO
            String grado=unidades_angulo[0];
            String radian=unidades_angulo[1];
            String grado_centesimal=unidades_angulo[2];
            //PRESION
            String atmosfera=unidades_presion[0];
            String bares=unidades_presion[1];
            String kilopascales=unidades_presion[2];
            String milimetrosDeMercurio=unidades_presion[3];
            String pascales=unidades_presion[4];
            String librasPorPulgadaCuadrada=unidades_presion[5];
            //POTENCIA
            String vatios=unidades_potencia[0];
            String kilovatios=unidades_potencia[1];
            String caballosDeFuerza=unidades_potencia[2];
            String pieLibras=unidades_potencia[3];
            String unidadesTermicasBritanicas=unidades_potencia[4];
            //VELOCIDAD
            String centimetrosSegundo=unidades_velocidad[0];
            String metrosSegundo=unidades_velocidad[1];
            String kilometrosHora=unidades_velocidad[2];
            String piesSegundo=unidades_velocidad[3];
            String millasHora=unidades_velocidad[4];
            String nudos=unidades_velocidad[5];
            String mach=unidades_velocidad[6];
            //ENERGIA
            String electronvoltio=unidades_energia[0];
            String joules=unidades_energia[1];
            String kilojulios=unidades_energia[2];
            String caloriasTermales=unidades_energia[3];
            String caloriasAlimentos=unidades_energia[4];
            String pie_Libras=unidades_energia[5];
            String unidades_Termicas_Britanicas=unidades_energia[6];
            // PESO Y MASA
            String quilates=unidades_peso[0];
            String miligramos=unidades_peso[1];
            String centigramos=unidades_peso[2];
            String decigramos=unidades_peso[3];
            String gramos=unidades_peso[4];
            String decagramos=unidades_peso[5];
            String hectogramos=unidades_peso[6];
            String kilogramos=unidades_peso[7];
            String toneladasMetricas=unidades_peso[8];
            String onzas=unidades_peso[9];
            String libras=unidades_peso[10];
            String piedra=unidades_peso[11];
            String toneladasCortas=unidades_peso[12];
            String toneladasLargas=unidades_peso[13];
            //AREA
            String milimetrosCuadrados=unidades_area[0];
            String centimetrosCuadrados=unidades_area[1];
            String metrosCuadrados=unidades_area[2];
            String hectareas=unidades_area[3];
            String kilometrosCuadrados=unidades_area[4];
            String pulgadasCuadradas=unidades_area[5];
            String piesCuadrados=unidades_area[6];
            String yardasCuadradas=unidades_area[7];
            String acres=unidades_area[8];
            String millasCuadradas=unidades_area[9];
            //DATOS
            String Bits=unidades_datos[0];
            String Bytes=unidades_datos[1];
            String Kilobits=unidades_datos[2];
            String Kibibits=unidades_datos[3];
            String Kilobytes=unidades_datos[4];
            String Kibibytes=unidades_datos[5];
            String Megabits=unidades_datos[6];
            String Mebibits=unidades_datos[7];
            String Megabytes=unidades_datos[8];
            String Mebibytes=unidades_datos[9];
            String Gigabits=unidades_datos[10];
            String Gibibits=unidades_datos[11];
            String Gigabytes=unidades_datos[12];
            String Gibibytes=unidades_datos[13];
            String Terabits=unidades_datos[14];
            String Tebibits=unidades_datos[15];
            String Terabytes=unidades_datos[16];
            String Tebibytes=unidades_datos[17];
            String Petabits=unidades_datos[18];
            String Pebibits=unidades_datos[19];
            String Petabytes=unidades_datos[20];
            String Pebibytes=unidades_datos[21];
            String Hexabits=unidades_datos[22];
            String Exbibits=unidades_datos[23];
            String Hexabytes=unidades_datos[24];
            String Hexbibytes=unidades_datos[25];
            String Zetabits=unidades_datos[26];
            String Zebibits=unidades_datos[27];
            String Zetabytes=unidades_datos[28];
            String Zebibytes=unidades_datos[29];
            String Yottabit=unidades_datos[30];
            String Yobibits=unidades_datos[31];
            String Yottabyte=unidades_datos[32];
            String Yobibytes=unidades_datos[33];

            //VOLUMEN
            if(toast_principal.contains(datos[0])){
                //respuesta.setText(toast_principal);
                if(unidad1.contains(mililitro)&& unidad2.contains(mililitro)){
                    entero(num_ingresado);
                }
                if(unidad1.contains(mililitro)&& unidad2.contains(centimetroc)){
                    entero(formulas_volumen.mililitros_centimetrosCubicos(num_ingresado));
                }
                if(unidad1.contains(mililitro)&& unidad2.contains(litro)){
                    entero(formulas_volumen.mililitros_litros(num_ingresado));
                }
                if(unidad1.contains(mililitro)&& unidad2.contains(piec)){
                    entero(formulas_volumen.mililitros_piesCubicos(num_ingresado));
                }
                if(unidad1.contains(mililitro)&& unidad2.contains(pulgadac)){
                    entero(formulas_volumen.mililitros_pulgadasCubicas(num_ingresado));
                }
                if(unidad1.contains(mililitro)&& unidad2.contains(metroc)){
                    entero(formulas_volumen.mililitros_metrosCubicos(num_ingresado));
                }
                if(unidad1.contains(mililitro)&& unidad2.contains(yardac)){
                    entero(formulas_volumen.mililitros_yardasCubicas(num_ingresado));
                }

                if(unidad1.contains(centimetroc)&& unidad2.contains(mililitro)){
                    entero(formulas_volumen.cantimetrosCubicos_mililitros(num_ingresado));
                }
                if(unidad1.contains(centimetroc)&& unidad2.contains(centimetroc)){
                    entero(num_ingresado);
                }
                if(unidad1.contains(centimetroc)&& unidad2.contains(litro)){
                    entero(formulas_volumen.centimetrosCubicos_litros(num_ingresado));
                }
                if(unidad1.contains(centimetroc)&& unidad2.contains(piec)){
                    entero(formulas_volumen.centimetrosCubicos_piesCubicos(num_ingresado));
                }
                if(unidad1.contains(centimetroc)&& unidad2.contains(pulgadac)){
                    entero(formulas_volumen.centimetrosCubicos_pulgadasCubicas(num_ingresado));
                }
                if(unidad1.contains(centimetroc)&& unidad2.contains(metroc)){
                    entero(formulas_volumen.centimetrosCubicos_metrosCubicos(num_ingresado));
                }
                if(unidad1.contains(centimetroc)&& unidad2.contains(yardac)){
                    entero(formulas_volumen.centimetrosCubicos_yardasCubicas(num_ingresado));
                }

                if(unidad1.contains(litro)&& unidad2.contains(mililitro)){
                    entero(formulas_volumen.litros_mililitros(num_ingresado));
                }
                if(unidad1.contains(litro)&& unidad2.contains(centimetroc)){
                    entero(formulas_volumen.litros_centimetrosCubicos(num_ingresado));
                }
                if(unidad1.contains(litro)&& unidad2.contains(litro)){
                    entero(num_ingresado);
                }
                if(unidad1.contains(litro)&& unidad2.contains(pulgadac)){
                    entero(formulas_volumen.litros_pulgadasCubicas(num_ingresado));
                }
                if(unidad1.contains(litro)&& unidad2.contains(piec)){
                    entero(formulas_volumen.litros_piesCubicos(num_ingresado));
                }
                if(unidad1.contains(litro)&& unidad2.contains(metroc)){
                    entero(formulas_volumen.litros_metrosCubicos(num_ingresado));
                }
                if(unidad1.contains(litro)&& unidad2.contains(yardac)){
                    entero(formulas_volumen.litros_yardasCubicas(num_ingresado));
                }

                if(unidad1.contains(piec)&& unidad2.contains(mililitro)){
                    entero(formulas_volumen.piesCubicos_mililitros(num_ingresado));
                }
                if(unidad1.contains(piec)&& unidad2.contains(centimetroc)){
                    entero(formulas_volumen.piesCubicos_centimetrosCubicos(num_ingresado));
                }
                if(unidad1.contains(piec)&& unidad2.contains(piec)){
                    entero(num_ingresado);
                }
                if(unidad1.contains(piec)&& unidad2.contains(pulgadac)){
                    entero(formulas_volumen.piesCubicos_pulgadasCubicas(num_ingresado));
                }
                if(unidad1.contains(piec)&& unidad2.contains(metroc)){
                    entero(formulas_volumen.piesCubicos_metrosCubicos(num_ingresado));
                }
                if(unidad1.contains(piec)&& unidad2.contains(litro)){
                    entero(formulas_volumen.piesCubicos_litros(num_ingresado));
                }
                if(unidad1.contains(piec)&& unidad2.contains(yardac)){
                    entero(formulas_volumen.piesCubicos_yardasCubicas(num_ingresado));
                }

                if(unidad1.contains(pulgadac)&& unidad2.contains(mililitro)){
                    entero(formulas_volumen.pulgadasCubicas_mililitros(num_ingresado));
                }
                if(unidad1.contains(pulgadac)&& unidad2.contains(centimetroc)){
                    entero(formulas_volumen.pulgadasCubicas_centimetrosCubicos(num_ingresado));
                }
                if(unidad1.contains(pulgadac)&& unidad2.contains(litro)){
                    entero(formulas_volumen.pulgadasCubicas_litros(num_ingresado));
                }
                if(unidad1.contains(pulgadac)&& unidad2.contains(piec)){
                    entero(formulas_volumen.pulgadasCubicas_piesCubicos(num_ingresado));
                }
                if(unidad1.contains(pulgadac)&& unidad2.contains(pulgadac)){
                    entero(num_ingresado);
                }
                if(unidad1.contains(pulgadac)&& unidad2.contains(metroc)){
                    entero(formulas_volumen.pulgadasCubicas_metrosCubicos(num_ingresado));
                }
                if(unidad1.contains(pulgadac)&& unidad2.contains(yardac)){
                    entero(formulas_volumen.pulgadasCubicas_yardasCubicas(num_ingresado));
                }

                if(unidad1.contains(metroc)&& unidad2.contains(mililitro)){
                    entero(formulas_volumen.metrosCubicos_mililitros(num_ingresado));
                }
                if(unidad1.contains(metroc)&& unidad2.contains(centimetroc)){
                    entero(formulas_volumen.metrosCubicos_centimetrosCubicos(num_ingresado));
                }
                if(unidad1.contains(metroc)&& unidad2.contains(litro)){
                    entero(formulas_volumen.metrosCubicos_litros(num_ingresado));
                }
                if(unidad1.contains(metroc)&& unidad2.contains(piec)){
                    entero(formulas_volumen.metrosCubicos_piesCubicos(num_ingresado));
                }
                if(unidad1.contains(metroc)&& unidad2.contains(pulgadac)){
                    entero(formulas_volumen.metrosCubicos_pulgadasCubicas(num_ingresado));
                }
                if(unidad1.contains(metroc)&& unidad2.contains(metroc)){
                    entero(num_ingresado);
                }
                if(unidad1.contains(metroc)&& unidad2.contains(yardac)){
                    entero(formulas_volumen.metrosCubicos_yardasCubicas(num_ingresado));
                }

                if(unidad1.contains(yardac)&& unidad2.contains(mililitro)){
                    entero(formulas_volumen.yardasCubbicas_mililitros(num_ingresado));
                }
                if(unidad1.contains(yardac)&& unidad2.contains(centimetroc)){
                    entero(formulas_volumen.yardasCubbicas_centimetrosCubicos(num_ingresado));
                }
                if(unidad1.contains(yardac)&& unidad2.contains(litro)){
                    entero(formulas_volumen.yardasCubbicas_litros(num_ingresado));
                }
                if(unidad1.contains(yardac)&& unidad2.contains(piec)){
                    entero(formulas_volumen.yardasCubbicas_piesCubicos(num_ingresado));
                }
                if(unidad1.contains(yardac)&& unidad2.contains(pulgadac)){
                    entero(formulas_volumen.yardasCubbicas_pulgadasCubicas(num_ingresado));
                }
                if(unidad1.contains(yardac)&& unidad2.contains(metroc)){
                    entero(formulas_volumen.yardasCubbicas_metrosCubicos(num_ingresado));
                }
                if(unidad1.contains(yardac)&& unidad2.contains(yardac)){
                    entero(num_ingresado);
                }
            }

            //LONGITUD
            if (toast_principal.contains(datos[1])){
                if(unidad1.contains(nanometros)&& unidad2.contains(nanometros)){entero(num_ingresado);}
                if(unidad1.contains(nanometros)&& unidad2.contains(micrometros)){entero(formulas_longitud.nanometros_micrometros(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(milimetros)){entero(formulas_longitud.nanometros_milimetros(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(centimetros)){entero(formulas_longitud.nanometros_centimetros(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(metros)){entero(formulas_longitud.nanometros_metros(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(kilometros)){entero(formulas_longitud.nanometros_kilometros(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(decimetros)){entero(formulas_longitud.nanometros_decimetros(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(decametros)){entero(formulas_longitud.nanometros_decametros(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(pulgadas)){entero(formulas_longitud.nanometros_pulgadas(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(pies)){entero(formulas_longitud.nanometros_pies(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(yardas)){entero(formulas_longitud.nanometros_yardas(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(millas)){entero(formulas_longitud.nanometros_millas(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(millas_nauticas)){entero(formulas_longitud.nanometros_millas_nauticas(num_ingresado));}
                if(unidad1.contains(nanometros)&& unidad2.contains(años_luz)){entero(formulas_longitud.nanometros_años_luz(num_ingresado));}

                if(unidad1.contains(micrometros)&& unidad2.contains(micrometros)){entero(num_ingresado);}
                if(unidad1.contains(micrometros)&& unidad2.contains(nanometros)){entero(formulas_longitud.micrometros_nanometro(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(milimetros)){entero(formulas_longitud.micrometros_milimetros(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(centimetros)){entero(formulas_longitud.micrometros_centimetros(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(decimetros)){entero(formulas_longitud.micrometros_decimetros(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(decametros)){entero(formulas_longitud.micrometros_decamteros(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(metros)){entero(formulas_longitud.micrometros_metros(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(kilometros)){entero(formulas_longitud.micrometros_kilometros(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(pulgadac)){entero(formulas_longitud.micrometros_pulgadas(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(pies)){entero(formulas_longitud.micrometros_pies(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(yardas)){entero(formulas_longitud.micrometros_yardas(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(millas)){entero(formulas_longitud.micrometros_millas(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(millas_nauticas)){entero(formulas_longitud.micrometros_millas_nauticas(num_ingresado));}
                if(unidad1.contains(micrometros)&& unidad2.contains(años_luz)){entero(formulas_longitud.micrometros_años_luz(num_ingresado));}

                if(unidad1.contains(milimetros)&& unidad2.contains(milimetros)){entero(num_ingresado);};
                if(unidad1.contains(milimetros)&& unidad2.contains(nanometros)){entero(formulas_longitud.milimetros_nanometros(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(micrometros)){entero(formulas_longitud.milimetros_micrometros(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(centimetros)){entero(formulas_longitud.milimetros_centimetros(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(decimetros)){entero(formulas_longitud.milimetros_decimetros(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(decametros)){entero(formulas_longitud.milimetros_decametros(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(metros)){entero(formulas_longitud.milimetros_metros(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(kilometros)){entero(formulas_longitud.milimetros_kilometros(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(pulgadas)){entero(formulas_longitud.milimetros_pulgadas(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(pies)){entero(formulas_longitud.milimetros_pies(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(yardas)){entero(formulas_longitud.milimetros_yardas(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(millas)){entero(formulas_longitud.milimetros_millas(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(millas_nauticas)){entero(formulas_longitud.milimetros_millas_nauticas(num_ingresado));}
                if(unidad1.contains(milimetros)&& unidad2.contains(años_luz)){entero(formulas_longitud.milimetros_años_luz(num_ingresado));}

                if(unidad1.contains(centimetros)&& unidad2.contains(centimetros)){entero(num_ingresado);}
                if(unidad1.contains(centimetros)&& unidad2.contains(nanometros)){entero(formulas_longitud.centimetros_nanometros(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(micrometros)){entero(formulas_longitud.centimetros_micrometros(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(milimetros)){entero(formulas_longitud.centimetros_milimetros(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(decimetros)){entero(formulas_longitud.centimetros_decimetros(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(decametros)){entero(formulas_longitud.centimetros_decametros(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(metros)){entero(formulas_longitud.centimetros_metros(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(kilometros)){entero(formulas_longitud.centimetros_kilometros(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(pulgadas)){entero(formulas_longitud.centimetros_pulgadas(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(pies)){entero(formulas_longitud.centimetros_pies(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(yardas)){entero(formulas_longitud.centimetros_yardas(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(millas)){entero(formulas_longitud.centimetros_millas(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(millas_nauticas)){entero(formulas_longitud.centimetros_millas_nauticas(num_ingresado));}
                if(unidad1.contains(centimetros)&& unidad2.contains(años_luz)){entero(formulas_longitud.centimetros_años_luz(num_ingresado));}

                if(unidad1.contains(decimetros)&& unidad2.contains(decimetros)){entero(num_ingresado);}
                if(unidad1.contains(decimetros)&& unidad2.contains(nanometros)){entero(formulas_longitud.decimetros_nanometros(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(micrometros)){entero(formulas_longitud.decimetros_micrometros(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(milimetros)){entero(formulas_longitud.decimetros_milimetros(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(decametros)){entero(formulas_longitud.decimetros_decametros(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(centimetros)){entero(formulas_longitud.decimetros_centimetros(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(metros)){entero(formulas_longitud.decimetros_metros(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(kilometros)){entero(formulas_longitud.decimetros_kilometros(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(pulgadas)){entero(formulas_longitud.decimetros_pulgadas(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(pies)){entero(formulas_longitud.decimetros_pies(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(yardas)){entero(formulas_longitud.decimetros_yardas(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(millas)){entero(formulas_longitud.decimetros_millas(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(millas_nauticas)){entero(formulas_longitud.decimetros_millas_nauticas(num_ingresado));}
                if(unidad1.contains(decimetros)&& unidad2.contains(años_luz)){entero(formulas_longitud.decimetros_años_luz(num_ingresado));}

                if(unidad1.contains(decametros)&& unidad2.contains(decametros)){entero(num_ingresado);}
                if(unidad1.contains(decametros)&& unidad2.contains(nanometros)){entero(formulas_longitud.decametro_nanometro(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(micrometros)){entero(formulas_longitud.decametro_micrometro(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(milimetros)){entero(formulas_longitud.decametro_milimetro(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(centimetros)){entero(formulas_longitud.decametro_centimetro(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(decimetros)){entero(formulas_longitud.decametro_decimetros(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(metros)){entero(formulas_longitud.decametro_metros(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(kilometros)){entero(formulas_longitud.decametro_kilometros(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(pulgadas)){entero(formulas_longitud.decamtero_pulgadas(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(pies)){entero(formulas_longitud.decametro_pies(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(yardas)){entero(formulas_longitud.decametro_yardas(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(millas)){entero(formulas_longitud.decametro_millas(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(millas_nauticas)){entero(formulas_longitud.decametro_millas_nauticas(num_ingresado));}
                if(unidad1.contains(decametros)&& unidad2.contains(años_luz)){entero(formulas_longitud.decametro_años_luz(num_ingresado));}

                if(unidad1.contains(metros)&& unidad2.contains(metros)){entero(num_ingresado);}
                if(unidad1.contains(metros)&& unidad2.contains(nanometros)){entero(formulas_longitud.metros_nanometros(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(micrometros)){entero(formulas_longitud.metros_micrometros(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(milimetros)){entero(formulas_longitud.metros_milimetros(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(centimetros)){entero(formulas_longitud.metros_centimetros(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(decimetros)){entero(formulas_longitud.metros_decimetros(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(decametros)){entero(formulas_longitud.metros_decámetros(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(kilometros)){entero(formulas_longitud.metros_kilometros(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(pulgadas)){entero(formulas_longitud.metros_pulgadas(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(pies)){entero(formulas_longitud.metros_pies(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(yardas)){entero(formulas_longitud.metros_yardas(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(millas)){entero(formulas_longitud.metros_millas(num_ingresado));}
                if(unidad1.contains(metros)&& unidad2.contains(millas_nauticas)){formulas_longitud.metros_millas_nauticas(num_ingresado);}
                if(unidad1.contains(metros)&& unidad2.contains(años_luz)){entero(formulas_longitud.metros_años_luz(num_ingresado));}

                if(unidad1.contains(kilometros)&& unidad2.contains(kilometros)){entero(num_ingresado);}
                if(unidad1.contains(kilometros)&& unidad2.contains(nanometros)){entero(formulas_longitud.kilometros_nanometros(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(micrometros)){entero(formulas_longitud.kilometros_micrometros(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(milimetros)){entero(formulas_longitud.kilometros_milimetros(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(centimetros)){entero(formulas_longitud.kilometros_centimetros(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(decimetros)){entero(formulas_longitud.kilometros_decimetros(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(decametros)){entero(formulas_longitud.kilometros_decametros(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(metros)){entero(formulas_longitud.kilometros_metros(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(pulgadas)){entero(formulas_longitud.kilometros_pulgadas(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(pies)){entero(formulas_longitud.kilometros_pies(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(yardas)){entero(formulas_longitud.kilometros_yardas(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(millas)){entero(formulas_longitud.kilometros_millas(num_ingresado));}
                if(unidad1.contains(kilometros)&& unidad2.contains(millas_nauticas)){formulas_longitud.kilometros_millas_nauticas(num_ingresado);}
                if(unidad1.contains(kilometros)&& unidad2.contains(años_luz)){entero(formulas_longitud.kilometros_años_luz(num_ingresado));}

                if(unidad1.contains(pulgadas)&& unidad2.contains(pulgadas)){entero(num_ingresado);}
                if(unidad1.contains(pulgadas)&& unidad2.contains(nanometros)){entero(formulas_longitud.pulgadas_nanometros(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(micrometros)){entero(formulas_longitud.pulgadas_micrometros(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(milimetros)){entero(formulas_longitud.pulgadas_milimetros(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(centimetros)){entero(formulas_longitud.pulgadas_centimetros(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(decimetros)){entero(formulas_longitud.pulgadas_decimetros(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(decametros)){entero(formulas_longitud.pulgadas_decametros(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(metros)){entero(formulas_longitud.pulgadas_metros(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(kilometros)){entero(formulas_longitud.pulgadas_kilometros(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(pies)){entero(formulas_longitud.pulgadas_pies(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(yardas)){entero(formulas_longitud.pulgadas_yardas(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(millas)){entero(formulas_longitud.pulgadas_millas(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(millas_nauticas)){entero(formulas_longitud.pulgadas_millas_nauticas(num_ingresado));}
                if(unidad1.contains(pulgadas)&& unidad2.contains(años_luz)){entero(formulas_longitud.pulgadas_años_luz(num_ingresado));}

                if(unidad1.contains(pies)&& unidad2.contains(pies)){entero(num_ingresado);}
                if(unidad1.contains(pies)&& unidad2.contains(nanometros)){entero(formulas_longitud.pies_nanometros(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(micrometros)){entero(formulas_longitud.pies_micrometros(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(milimetros)){entero(formulas_longitud.pies_milimetros(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(centimetros)){entero(formulas_longitud.pies_centimetros(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(decimetros)){entero(formulas_longitud.pies_decimetros(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(decametros)){entero(formulas_longitud.pies_decametros(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(metros)){entero(formulas_longitud.pies_metros(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(pulgadas)){entero(formulas_longitud.pies_pulgadas(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(kilometros)){entero(formulas_longitud.pies_kilometros(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(yardas)){entero(formulas_longitud.pies_yardas(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(millas)){entero(formulas_longitud.pies_millas(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(millas_nauticas)){entero(formulas_longitud.pies_millas_nauticas(num_ingresado));}
                if(unidad1.contains(pies)&& unidad2.contains(años_luz)){entero(formulas_longitud.pies_años_luz(num_ingresado));}

                if(unidad1.contains(yardas)&& unidad2.contains(yardas)){entero(num_ingresado);}
                if(unidad1.contains(yardas)&& unidad2.contains(nanometros)){entero(formulas_longitud.yardas_nanometros(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(micrometros)){entero(formulas_longitud.yardas_micrometros(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(milimetros)){entero(formulas_longitud.yardas_milimetros(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(centimetros)){entero(formulas_longitud.yardas_centimetros(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(decimetros)){entero(formulas_longitud.yardas_decimetros(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(decametros)){entero(formulas_longitud.yardas_decametros(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(metros)){entero(formulas_longitud.yardas_metros(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(kilometros)){entero(formulas_longitud.yardas_kilometros(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(pulgadas)){entero(formulas_longitud.yardas_pulgadas(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(pies)){entero(formulas_longitud.yardas_pies(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(millas)){entero(formulas_longitud.yardas_millas(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(millas_nauticas)){entero(formulas_longitud.yardas_millas_nauticas(num_ingresado));}
                if(unidad1.contains(yardas)&& unidad2.contains(años_luz)){entero(formulas_longitud.yardas_años_luz(num_ingresado));}

                if(unidad1.contains(millas)&& unidad2.contains(millas)){entero(num_ingresado);}
                if(unidad1.contains(millas)&& unidad2.contains(nanometros)){entero(formulas_longitud.millas_nanometros(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(micrometros)){entero(formulas_longitud.millas_micrometros(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(milimetros)){entero(formulas_longitud.millas_milimetros(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(centimetros)){entero(formulas_longitud.millas_centimetros(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(decimetros)){entero(formulas_longitud.millas_decimetros(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(decametros)){entero(formulas_longitud.millas_decametros(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(metros)){entero(formulas_longitud.millas_metros(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(kilometros)){entero(formulas_longitud.millas_kilometros(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(pulgadas)){entero(formulas_longitud.millas_pulgadas(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(pies)){entero(formulas_longitud.millas_pies(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(millas_nauticas)){formulas_longitud.millas_millas_nauticas(num_ingresado);}
                if(unidad1.contains(millas)&& unidad2.contains(años_luz)){entero(formulas_longitud.millas_años_luz(num_ingresado));}
                if(unidad1.contains(millas)&& unidad2.contains(yardas)){entero(formulas_longitud.millas_yardas(num_ingresado));}

                if(unidad1.contains(millas_nauticas)&& unidad2.contains(millas_nauticas)){entero(num_ingresado);}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(nanometros)){entero(formulas_longitud.millas_nauticas_nanometros(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(micrometros)){entero(formulas_longitud.millas_nauticas_micrometros(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(milimetros)){entero(formulas_longitud.millas_nauticas_milimetros(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(centimetros)){entero(formulas_longitud.millas_nauticas_centimetros(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(decimetros)){entero(formulas_longitud.millas_nauticas_decimetros(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(decametros)){entero(formulas_longitud.millas_nauticas_decametros(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(metros)){entero(formulas_longitud.millas_nauticas_metros(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(kilometros)){entero(formulas_longitud.millas_nauticas_kilometros(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(pulgadas)){entero(formulas_longitud.millas_nauticas_pulgadas(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(pies)){entero(formulas_longitud.millas_nauticas_pies(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(millas)){entero(formulas_longitud.millas_nauticas_millas(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(yardas)){entero(formulas_longitud.millas_nauticas_yardas(num_ingresado));}
                if(unidad1.contains(millas_nauticas)&& unidad2.contains(años_luz)){entero(formulas_longitud.millas_nauticas_años_luz(num_ingresado));}

                if(unidad1.contains(años_luz)&& unidad2.contains(años_luz)){entero(num_ingresado);}
                if(unidad1.contains(años_luz)&& unidad2.contains(nanometros)){entero(formulas_longitud.años_luz_nanometros(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(micrometros)){entero(formulas_longitud.años_luz_micrometros(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(milimetros)){entero(formulas_longitud.años_luz_milimetros(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(centimetros)){entero(formulas_longitud.años_luz_centimetros(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(decimetros)){entero(formulas_longitud.años_luz_decimetros(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(decametros)){entero(formulas_longitud.años_luz_decametros(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(metros)){entero(formulas_longitud.años_luz_metros(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(kilometros)){entero(formulas_longitud.años_luz_kilometros(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(pulgadas)){entero(formulas_longitud.años_luz_pulgadas(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(pies)){entero(formulas_longitud.años_luz_pies(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(yardas)){entero(formulas_longitud.años_luz_yardas(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(millas)){entero(formulas_longitud.años_luz_millas(num_ingresado));}
                if(unidad1.contains(años_luz)&& unidad2.contains(millas_nauticas)){entero(formulas_longitud.años_luz_millas_nauticas(num_ingresado));}

            }

            //PESO Y MASA
            if(toast_principal.contains(datos[2])){
                respuesta.setText(toast_principal);
                if(unidad1.contains(quilates)&& unidad2.contains(quilates)){entero(num_ingresado);}
                if(unidad1.contains(quilates)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.quilates_miligramos(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.quilates_centigramos(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.quilates_decigramos(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.quilates_gramos(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.quilates_decagramos(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.quilates_hectogramos(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.quilates_kilogramos(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.quilates_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.quilates_onzas(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(libras)){entero(formulas_pesoMasa.quilates_libras(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.quilates_piedra(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.quilates_toneladasCortas(num_ingresado));}
                if(unidad1.contains(quilates)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.quilates_toneladasLargas(num_ingresado));}

                if(unidad1.contains(miligramos)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.miligramos_quilates(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(miligramos)){entero(num_ingresado);}
                if(unidad1.contains(miligramos)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.miligramos_centigramos(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.miligramos_decigramos(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.miligramos_gramos(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.miligramos_decagramos(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.miligramos_hectogramos(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.miligramos_kilogramos(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.miligramos_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.miligramos_onzas(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(libras)){entero(formulas_pesoMasa.miligramos_libras(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.miligramos_piedra(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.miligramos_toneladasCortas(num_ingresado));}
                if(unidad1.contains(miligramos)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.miligramos_toneladasLargas(num_ingresado));}

                if(unidad1.contains(centigramos)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.centigramos_quilates(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.centigramos_miligramos(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(centigramos)){entero(num_ingresado);}
                if(unidad1.contains(centigramos)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.centigramos_decigramos(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.centigramos_gramos(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.centigramos_decagramos(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.centigramos_hectogramos(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.centigramos_kilogramos(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.centigramos_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.centigramos_onzas(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(libras)){entero(formulas_pesoMasa.centigramos_libras(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.centigramos_piedra(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.centigramos_toneladasCortas(num_ingresado));}
                if(unidad1.contains(centigramos)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.centigramos_toneladasLargas(num_ingresado));}

                if(unidad1.contains(decigramos)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.decigramos_quilates(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.decigramos_miligramos(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.decigramos_centigramos(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(decigramos)){entero(num_ingresado);}
                if(unidad1.contains(decigramos)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.decigramos_gramos(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.decigramos_decagramos(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.decigramos_hectogramos(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.decigramos_kilogramos(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.decigramos_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.decigramos_onzas(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(libras)){entero(formulas_pesoMasa.decigramos_libras(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.decigramos_piedra(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.decigramos_toneladasCortas(num_ingresado));}
                if(unidad1.contains(decigramos)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.decigramos_toneladasLargas(num_ingresado));}

                if(unidad1.contains(gramos)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.gramos_quilates(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.gramos_miligramos(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.gramos_centigramos(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.gramos_decigramos(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(gramos)){entero(num_ingresado);}
                if(unidad1.contains(gramos)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.gramos_decagramos(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.gramos_hectogramos(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.gramos_kilogramos(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.gramos_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.gramos_onzas(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(libras)){entero(formulas_pesoMasa.gramos_libras(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.gramos_piedra(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.gramos_toneladasCortas(num_ingresado));}
                if(unidad1.contains(gramos)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.gramos_toneladasLargas(num_ingresado));}

                if(unidad1.contains(decagramos)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.decagramos_quilates(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.decagramos_miligramos(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.decagramos_centigramos(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.decagramos_decigramos(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.decagramos_gramos(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(decagramos)){entero(num_ingresado);}
                if(unidad1.contains(decagramos)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.decagramos_hectogramos(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.decagramos_kilogramos(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.decagramos_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.decagramos_onzas(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(libras)){entero(formulas_pesoMasa.decagramos_libras(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.decagramos_piedra(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.decagramos_toneladasCortas(num_ingresado));}
                if(unidad1.contains(decagramos)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.decagramos_toneladasLargas(num_ingresado));}

                if(unidad1.contains(hectogramos)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.hectogramos_quilates(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.hectogramos_miligramos(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.hectogramos_centigramos(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.hectogramos_decigramos(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.hectogramos_gramos(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.hectogramos_decagramos(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(hectogramos)){entero(num_ingresado);}
                if(unidad1.contains(hectogramos)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.hectogramos_kilogramos(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.hectogramos_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.hectogramos_onzas(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(libras)){entero(formulas_pesoMasa.hectogramos_libras(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.hectogramos_piedra(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.hectogramos_toneladasCortas(num_ingresado));}
                if(unidad1.contains(hectogramos)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.hectogramos_toneladasLargas(num_ingresado));}

                if(unidad1.contains(kilogramos)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.kilogramos_quilates(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.kilogramos_miligramos(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.kilogramos_centigramos(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.kilogramos_decigramos(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.kilogramos_gramos(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.kilogramos_decagramos(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.kilogramos_hectogramos(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(kilogramos)){entero(num_ingresado);}
                if(unidad1.contains(kilogramos)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.kilogramos_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.kilogramos_onzas(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(libras)){entero(formulas_pesoMasa.kilogramos_libras(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.kilogramos_piedra(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.kilogramos_toneladasCortas(num_ingresado));}
                if(unidad1.contains(kilogramos)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.kilogramos_toneladasLargas(num_ingresado));}

                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.toneladasMetricas_quilates(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.toneladasMetricas_miligramos(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.toneladasMetricas_centigramos(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.toneladasMetricas_decigramos(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.toneladasMetricas_gramos(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.toneladasMetricas_decagramos(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.toneladasMetricas_hectogramos(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.toneladasMetricas_kilogramos(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(toneladasMetricas)){entero(num_ingresado);}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.toneladasMetricas_onzas(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(libras)){entero(formulas_pesoMasa.toneladasMetricas_libras(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.toneladasMetricas_piedra(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.toneladasMetricas_toneladasCortas(num_ingresado));}
                if(unidad1.contains(toneladasMetricas)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.toneladasMetricas_toneladasLargas(num_ingresado));}

                if(unidad1.contains(onzas)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.onzas_quilates(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.onzas_miligramos(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.onzas_centigramos(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.onzas_decigramos(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.onzas_gramos(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.onzas_decagramos(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.onzas_hectogramos(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.onzas_kilogramos(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.onzas_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(onzas)){entero(num_ingresado);}
                if(unidad1.contains(onzas)&& unidad2.contains(libras)){entero(formulas_pesoMasa.onzas_libras(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.onzas_piedra(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.onzas_toneladasCortas(num_ingresado));}
                if(unidad1.contains(onzas)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.onzas_toneladasLargas(num_ingresado));}

                if(unidad1.contains(libras)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.libras_quilates(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.libras_miligramos(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.libras_centigramos(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.libras_decigramos(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.libras_gramos(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.libras_decagramos(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.libras_hectogramos(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.libras_kilogramos(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.libras_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.libras_onzas(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(libras)){entero(num_ingresado);}
                if(unidad1.contains(libras)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.libras_piedra(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.libras_toneladasCortas(num_ingresado));}
                if(unidad1.contains(libras)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.libras_toneladasLargas(num_ingresado));}

                if(unidad1.contains(piedra)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.piedra_quilates(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.piedra_miligramos(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.piedra_centigramos(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.piedra_decigramos(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.piedra_gramos(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.piedra_decagramos(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.piedra_hectogramos(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.piedra_kilogramos(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.piedra_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.piedra_onzas(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(libras)){entero(formulas_pesoMasa.piedra_libras(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(piedra)){entero(num_ingresado);}
                if(unidad1.contains(piedra)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.piedra_toneladasCortas(num_ingresado));}
                if(unidad1.contains(piedra)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.piedra_toneladasLargas(num_ingresado));}

                if(unidad1.contains(toneladasCortas)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.toneladasCortas_quilates(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.toneladasCortas_miligramos(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.toneladasCortas_centigramos(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.toneladasCortas_decigramos(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.toneladasCortas_gramos(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.toneladasCortas_decagramos(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.toneladasCortas_hectogramos(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.toneladasCortas_kilogramos(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.toneladasCortas_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.toneladasCortas_onzas(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(libras)){entero(formulas_pesoMasa.toneladasCortas_libras(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.toneladasCortas_piedra(num_ingresado));}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(toneladasCortas)){entero(num_ingresado);}
                if(unidad1.contains(toneladasCortas)&& unidad2.contains(toneladasLargas)){entero(formulas_pesoMasa.toneladasCortas_toneladasLargas(num_ingresado));}

                if(unidad1.contains(toneladasLargas)&& unidad2.contains(quilates)){entero(formulas_pesoMasa.toneladasLargas_quilates(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(miligramos)){entero(formulas_pesoMasa.toneladasLargas_miligramos(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(centigramos)){entero(formulas_pesoMasa.toneladasLargas_centigramos(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(decigramos)){entero(formulas_pesoMasa.toneladasLargas_decigramos(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(gramos)){entero(formulas_pesoMasa.toneladasLargas_gramos(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(decagramos)){entero(formulas_pesoMasa.toneladasLargas_decagramos(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(hectogramos)){entero(formulas_pesoMasa.toneladasLargas_hectogramos(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(kilogramos)){entero(formulas_pesoMasa.toneladasLargas_kilogramos(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(toneladasMetricas)){entero(formulas_pesoMasa.toneladasLargas_toneladasMetricas(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(onzas)){entero(formulas_pesoMasa.toneladasLargas_onzas(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(libras)){entero(formulas_pesoMasa.toneladasLargas_libras(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(piedra)){entero(formulas_pesoMasa.toneladasLargas_piedra(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(toneladasCortas)){entero(formulas_pesoMasa.toneladasLargas_toneladasCortas(num_ingresado));}
                if(unidad1.contains(toneladasLargas)&& unidad2.contains(toneladasLargas)){entero(num_ingresado);}
            }

            //TEMPERATURA
            if(toast_principal.contains(datos[3])){
                if (unidad1.contains(celcius) && unidad2.contains(fahrenheit)) {
                    enteroTemperatura(formulas_temperatura.celcius_fahrenheit(num_ingresado));
                }
                if (unidad1.contains(celcius) && unidad2.contains(kelvin)) {
                    enteroTemperatura(formulas_temperatura.celsius_kelvin(num_ingresado));
                }
                if (unidad1.contains(celcius) && unidad2.contains(celcius)) {
                    enteroTemperatura(num_ingresado);
                }
                if (unidad1.contains(kelvin) && unidad2.contains(fahrenheit)) {
                    enteroTemperatura(formulas_temperatura.kelvin_fahrenheit(num_ingresado));
                }
                if (unidad1.contains(kelvin) && unidad2.contains(celcius)) {
                    enteroTemperatura(formulas_temperatura.kelvin_celsius(num_ingresado));
                }
                if (unidad1.contains(kelvin) && unidad2.contains(kelvin)) {
                    enteroTemperatura(num_ingresado);
                }
                if (unidad1.contains(fahrenheit) && unidad2.contains(celcius)) {
                    enteroTemperatura(formulas_temperatura.fahrenheit_celcius(num_ingresado));
                }
                if (unidad1.contains(fahrenheit) && unidad2.contains(kelvin)) {
                    enteroTemperatura(formulas_temperatura.fahrenheit_kelvin(num_ingresado));
                }
                if (unidad1.contains(fahrenheit) && unidad2.contains(fahrenheit)) {
                    enteroTemperatura(num_ingresado);
                }}

            //ENERGÍA
            if(toast_principal.contains(datos[4])){
                respuesta.setText(toast_principal);
                if(unidad1.contains(electronvoltio)&& unidad2.contains(electronvoltio)){entero(num_ingresado);}
                if(unidad1.contains(electronvoltio)&& unidad2.contains(joules)){entero(formulas_energia.electronvoltio_joules(num_ingresado));}
                if(unidad1.contains(electronvoltio)&& unidad2.contains(kilojulios)){entero(formulas_energia.electronvoltio_kilojoulios(num_ingresado));}
                if(unidad1.contains(electronvoltio)&& unidad2.contains(caloriasTermales)){entero(formulas_energia.electronvoltio_caloriasTermales(num_ingresado));}
                if(unidad1.contains(electronvoltio)&& unidad2.contains(caloriasAlimentos)){entero(formulas_energia.electronvoltio_caloriasAlimentos(num_ingresado));}
                if(unidad1.contains(electronvoltio)&& unidad2.contains(pie_Libras)){entero(formulas_energia.electronvoltio_pieLibras(num_ingresado));}
                if(unidad1.contains(electronvoltio)&& unidad2.contains(unidades_Termicas_Britanicas)){entero(formulas_energia.electronvoltio_unidadesTermicasBritanicas(num_ingresado));}

                if(unidad1.contains(joules)&& unidad2.contains(electronvoltio)){entero(formulas_energia.joules_electronvoltio(num_ingresado));}
                if(unidad1.contains(joules)&& unidad2.contains(joules)){entero(num_ingresado);}
                if(unidad1.contains(joules)&& unidad2.contains(kilojulios)){entero(formulas_energia.joules_kilojoulios(num_ingresado));}
                if(unidad1.contains(joules)&& unidad2.contains(caloriasTermales)){entero(formulas_energia.joules_caloriasTermales(num_ingresado));}
                if(unidad1.contains(joules)&& unidad2.contains(caloriasAlimentos)){entero(formulas_energia.joules_caloriasAlimentos(num_ingresado));}
                if(unidad1.contains(joules)&& unidad2.contains(pie_Libras)){entero(formulas_energia.joules_pieLibras(num_ingresado));}
                if(unidad1.contains(joules)&& unidad2.contains(unidades_Termicas_Britanicas)){entero(formulas_energia.joules_unidadesTermicasBritanicas(num_ingresado));}

                if(unidad1.contains(kilojulios)&& unidad2.contains(electronvoltio)){entero(formulas_energia.kilojoulios_electronvoltio(num_ingresado));}
                if(unidad1.contains(kilojulios)&& unidad2.contains(joules)){entero(formulas_energia.kilojoulios_joules(num_ingresado));}
                if(unidad1.contains(kilojulios)&& unidad2.contains(kilojulios)){entero(num_ingresado);}
                if(unidad1.contains(kilojulios)&& unidad2.contains(caloriasTermales)){entero(formulas_energia.kilojoulios_caloriasTermales(num_ingresado));}
                if(unidad1.contains(kilojulios)&& unidad2.contains(caloriasAlimentos)){entero(formulas_energia.kilojoulios_caloriasAlimentos(num_ingresado));}
                if(unidad1.contains(kilojulios)&& unidad2.contains(pie_Libras)){entero(formulas_energia.kilojoulios_pieLibras(num_ingresado));}
                if(unidad1.contains(kilojulios)&& unidad2.contains(unidades_Termicas_Britanicas)){entero(formulas_energia.kilojoulios_unidadesTermicasBritanicas(num_ingresado));}

                if(unidad1.contains(caloriasTermales)&& unidad2.contains(electronvoltio)){entero(formulas_energia.caloriasTermales_electronvoltio(num_ingresado));}
                if(unidad1.contains(caloriasTermales)&& unidad2.contains(joules)){entero(formulas_energia.caloriasTermales_joules(num_ingresado));}
                if(unidad1.contains(caloriasTermales)&& unidad2.contains(kilojulios)){entero(formulas_energia.caloriasTermales_kilojoulios(num_ingresado));}
                if(unidad1.contains(caloriasTermales)&& unidad2.contains(caloriasTermales)){entero(num_ingresado);}
                if(unidad1.contains(caloriasTermales)&& unidad2.contains(caloriasAlimentos)){entero(formulas_energia.caloriasTermales_caloriasAlimentos(num_ingresado));}
                if(unidad1.contains(caloriasTermales)&& unidad2.contains(pie_Libras)){entero(formulas_energia.caloriasTermales_pieLibras(num_ingresado));}
                if(unidad1.contains(caloriasTermales)&& unidad2.contains(unidades_Termicas_Britanicas)){entero(formulas_energia.caloriasTermales_unidadesTermicasBritanicas(num_ingresado));}

                if(unidad1.contains(caloriasAlimentos)&& unidad2.contains(electronvoltio)){entero(formulas_energia.caloriasAlimentos_electronvoltio(num_ingresado));}
                if(unidad1.contains(caloriasAlimentos)&& unidad2.contains(joules)){entero(formulas_energia.caloriasAlimentos_joules(num_ingresado));}
                if(unidad1.contains(caloriasAlimentos)&& unidad2.contains(kilojulios)){entero(formulas_energia.caloriasAlimentos_kilojoulios(num_ingresado));}
                if(unidad1.contains(caloriasAlimentos)&& unidad2.contains(caloriasTermales)){entero(formulas_energia.caloriasAlimentos_caloriasTermales(num_ingresado));}
                if(unidad1.contains(caloriasAlimentos)&& unidad2.contains(caloriasAlimentos)){entero(num_ingresado);}
                if(unidad1.contains(caloriasAlimentos)&& unidad2.contains(pie_Libras)){entero(formulas_energia.caloriasAlimentos_pieLibras(num_ingresado));}
                if(unidad1.contains(caloriasAlimentos)&& unidad2.contains(unidades_Termicas_Britanicas)){entero(formulas_energia.caloriasAlimentos_unidadesTermicasBritanicas(num_ingresado));}

                if(unidad1.contains(pie_Libras)&& unidad2.contains(electronvoltio)){entero(formulas_energia.pieLibras_electronvoltio(num_ingresado));}
                if(unidad1.contains(pie_Libras)&& unidad2.contains(joules)){entero(formulas_energia.pieLibras_joules(num_ingresado));}
                if(unidad1.contains(pie_Libras)&& unidad2.contains(kilojulios)){entero(formulas_energia.pieLibras_kilojoulios(num_ingresado));}
                if(unidad1.contains(pie_Libras)&& unidad2.contains(caloriasTermales)){entero(formulas_energia.pieLibras_caloriasTermales(num_ingresado));}
                if(unidad1.contains(pie_Libras)&& unidad2.contains(caloriasAlimentos)){entero(formulas_energia.pieLibras_caloriasAlimentos(num_ingresado));}
                if(unidad1.contains(pie_Libras)&& unidad2.contains(pie_Libras)){entero(num_ingresado);}
                if(unidad1.contains(pie_Libras)&& unidad2.contains(unidades_Termicas_Britanicas)){entero(formulas_energia.pieLibras_unidadesTermicasBritanicas(num_ingresado));}

                if(unidad1.contains(unidades_Termicas_Britanicas)&& unidad2.contains(electronvoltio)){entero(formulas_energia.unidadesTermicasBritanicas_electronvoltio(num_ingresado));}
                if(unidad1.contains(unidades_Termicas_Britanicas)&& unidad2.contains(joules)){entero(formulas_energia.unidadesTermicasBritanicas_joules(num_ingresado));}
                if(unidad1.contains(unidades_Termicas_Britanicas)&& unidad2.contains(kilojulios)){entero(formulas_energia.unidadesTermicasBritanicas_kilojoulios(num_ingresado));}
                if(unidad1.contains(unidades_Termicas_Britanicas)&& unidad2.contains(caloriasTermales)){entero(formulas_energia.unidadesTermicasBritanicas_caloriasTermales(num_ingresado));}
                if(unidad1.contains(unidades_Termicas_Britanicas)&& unidad2.contains(caloriasAlimentos)){entero(formulas_energia.unidadesTermicasBritanicas_caloriasAlimentos(num_ingresado));}
                if(unidad1.contains(unidades_Termicas_Britanicas)&& unidad2.contains(pie_Libras)){entero(formulas_energia.unidadesTermicasBritanicas_pieLibras(num_ingresado));}
                if(unidad1.contains(unidades_Termicas_Britanicas)&& unidad2.contains(unidades_Termicas_Britanicas)){entero(num_ingresado);}
            }

            //AREA
            if(toast_principal.contains(datos[5])){
                if(unidad1.contains(milimetrosCuadrados)&& unidad2.contains(milimetrosCuadrados)){entero(num_ingresado);}
                if(unidad1.contains(milimetrosCuadrados)&& unidad2.contains(centimetrosCuadrados)){entero(formulas_area.milimetrosCuadrados_centimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(milimetrosCuadrados)&& unidad2.contains(metrosCuadrados)){entero(formulas_area.milimetrosCuadrados_metrosCuadrados(num_ingresado));}
                if(unidad1.contains(milimetrosCuadrados)&& unidad2.contains(hectareas)){entero(formulas_area.milimetrosCuadrados_hectareas(num_ingresado));}
                if(unidad1.contains(milimetrosCuadrados)&& unidad2.contains(kilometrosCuadrados)){entero(formulas_area.milimetrosCuadrados_kilometrosCuadrados(num_ingresado));}
                if(unidad1.contains(milimetrosCuadrados)&& unidad2.contains(pulgadasCuadradas)){entero(formulas_area.milimetrosCuadrados_pulgadasCuadradas(num_ingresado));}
                if(unidad1.contains(milimetrosCuadrados)&& unidad2.contains(piesCuadrados)){entero(formulas_area.milimetrosCuadrados_piesCuadrados(num_ingresado));}
                if(unidad1.contains(milimetrosCuadrados)&& unidad2.contains(yardasCuadradas)){entero(formulas_area.milimetrosCuadrados_yardasCuadradas(num_ingresado));}
                if(unidad1.contains(milimetrosCuadrados)&& unidad2.contains(acres)){entero(formulas_area.milimetrosCuadrados_acres(num_ingresado));}
                if(unidad1.contains(milimetrosCuadrados)&& unidad2.contains(millasCuadradas)){entero(formulas_area.milimetrosCuadrados_millasCuadradas(num_ingresado));}

                if(unidad1.contains(centimetrosCuadrados)&& unidad2.contains(milimetrosCuadrados)){entero(formulas_area.centimetrosCuadrados_milimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(centimetrosCuadrados)&& unidad2.contains(centimetrosCuadrados)){entero(num_ingresado);}
                if(unidad1.contains(centimetrosCuadrados)&& unidad2.contains(metrosCuadrados)){entero(formulas_area.centimetrosCuadrados_metrosCuadrados(num_ingresado));}
                if(unidad1.contains(centimetrosCuadrados)&& unidad2.contains(hectareas)){entero(formulas_area.centimetrosCuadrados_hectareas(num_ingresado));}
                if(unidad1.contains(centimetrosCuadrados)&& unidad2.contains(kilometrosCuadrados)){entero(formulas_area.centimetrosCuadrados_kilometrosCuadrados(num_ingresado));}
                if(unidad1.contains(centimetrosCuadrados)&& unidad2.contains(pulgadasCuadradas)){entero(formulas_area.centimetrosCuadrados_pulgadasCuadradas(num_ingresado));}
                if(unidad1.contains(centimetrosCuadrados)&& unidad2.contains(piesCuadrados)){entero(formulas_area.centimetrosCuadrados_piesCuadrados(num_ingresado));}
                if(unidad1.contains(centimetrosCuadrados)&& unidad2.contains(yardasCuadradas)){entero(formulas_area.centimetrosCuadrados_yardasCuadradas(num_ingresado));}
                if(unidad1.contains(centimetrosCuadrados)&& unidad2.contains(acres)){entero(formulas_area.centimetrosCuadrados_acres(num_ingresado));}
                if(unidad1.contains(centimetrosCuadrados)&& unidad2.contains(millasCuadradas)){entero(formulas_area.centimetrosCuadrados_millasCuadradas(num_ingresado));}

                if(unidad1.contains(metrosCuadrados)&& unidad2.contains(milimetrosCuadrados)){entero(formulas_area.metrosCuadrados_milimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(metrosCuadrados)&& unidad2.contains(centimetrosCuadrados)){entero(formulas_area.metrosCuadrados_centimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(metrosCuadrados)&& unidad2.contains(metrosCuadrados)){entero(num_ingresado);}
                if(unidad1.contains(metrosCuadrados)&& unidad2.contains(hectareas)){entero(formulas_area.metrosCuadrados_hectareas(num_ingresado));}
                if(unidad1.contains(metrosCuadrados)&& unidad2.contains(kilometrosCuadrados)){entero(formulas_area.metrosCuadrados_kilometrosCuadrados(num_ingresado));}
                if(unidad1.contains(metrosCuadrados)&& unidad2.contains(pulgadasCuadradas)){entero(formulas_area.metrosCuadrados_pulgadasCuadradas(num_ingresado));}
                if(unidad1.contains(metrosCuadrados)&& unidad2.contains(piesCuadrados)){entero(formulas_area.metrosCuadrados_piesCuadrados(num_ingresado));}
                if(unidad1.contains(metrosCuadrados)&& unidad2.contains(yardasCuadradas)){entero(formulas_area.metrosCuadrados_yardasCuadradas(num_ingresado));}
                if(unidad1.contains(metrosCuadrados)&& unidad2.contains(acres)){entero(formulas_area.metrosCuadrados_acres(num_ingresado));}
                if(unidad1.contains(metrosCuadrados)&& unidad2.contains(millasCuadradas)){entero(formulas_area.metrosCuadrados_millasCuadradas(num_ingresado));}

                if(unidad1.contains(hectareas)&& unidad2.contains(milimetrosCuadrados)){entero(formulas_area.hectareas_milimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(hectareas)&& unidad2.contains(centimetrosCuadrados)){entero(formulas_area.hectareas_centimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(hectareas)&& unidad2.contains(metrosCuadrados)){entero(formulas_area.hectareas_metrosCuadrados(num_ingresado));}
                if(unidad1.contains(hectareas)&& unidad2.contains(hectareas)){entero(num_ingresado);}
                if(unidad1.contains(hectareas)&& unidad2.contains(kilometrosCuadrados)){entero(formulas_area.hectareas_kilometrosCuadrados(num_ingresado));}
                if(unidad1.contains(hectareas)&& unidad2.contains(pulgadasCuadradas)){entero(formulas_area.hectareas_pulgadasCuadradas(num_ingresado));}
                if(unidad1.contains(hectareas)&& unidad2.contains(piesCuadrados)){entero(formulas_area.hectareas_piesCuadrados(num_ingresado));}
                if(unidad1.contains(hectareas)&& unidad2.contains(yardasCuadradas)){entero(formulas_area.hectareas_yardasCuadradas(num_ingresado));}
                if(unidad1.contains(hectareas)&& unidad2.contains(acres)){entero(formulas_area.hectareas_acres(num_ingresado));}
                if(unidad1.contains(hectareas)&& unidad2.contains(millasCuadradas)){entero(formulas_area.hectareas_millasCuadradas(num_ingresado));}

                if(unidad1.contains(kilometrosCuadrados)&& unidad2.contains(milimetrosCuadrados)){entero(formulas_area.kilometrosCuadrados_milimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(kilometrosCuadrados)&& unidad2.contains(centimetrosCuadrados)){entero(formulas_area.kilometrosCuadrados_centimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(kilometrosCuadrados)&& unidad2.contains(metrosCuadrados)){entero(formulas_area.kilometrosCuadrados_metrosCuadrados(num_ingresado));}
                if(unidad1.contains(kilometrosCuadrados)&& unidad2.contains(hectareas)){entero(formulas_area.kilometrosCuadrados_hectareas(num_ingresado));}
                if(unidad1.contains(kilometrosCuadrados)&& unidad2.contains(kilometrosCuadrados)){entero(num_ingresado);}
                if(unidad1.contains(kilometrosCuadrados)&& unidad2.contains(pulgadasCuadradas)){entero(formulas_area.kilometrosCuadrados_pulgadasCuadradas(num_ingresado));}
                if(unidad1.contains(kilometrosCuadrados)&& unidad2.contains(piesCuadrados)){entero(formulas_area.kilometrosCuadrados_piesCuadrados(num_ingresado));}
                if(unidad1.contains(kilometrosCuadrados)&& unidad2.contains(yardasCuadradas)){entero(formulas_area.kilometrosCuadrados_yardasCuadradas(num_ingresado));}
                if(unidad1.contains(kilometrosCuadrados)&& unidad2.contains(acres)){entero(formulas_area.kilometrosCuadrados_acres(num_ingresado));}
                if(unidad1.contains(kilometrosCuadrados)&& unidad2.contains(millasCuadradas)){entero(formulas_area.kilometrosCuadrados_millasCuadradas(num_ingresado));}

                if(unidad1.contains(pulgadasCuadradas)&& unidad2.contains(milimetrosCuadrados)){entero(formulas_area.pulgadasCuadradas_milimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(pulgadasCuadradas)&& unidad2.contains(centimetrosCuadrados)){entero(formulas_area.pulgadasCuadradas_centimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(pulgadasCuadradas)&& unidad2.contains(metrosCuadrados)){entero(formulas_area.pulgadasCuadradas_metrosCuadrados(num_ingresado));}
                if(unidad1.contains(pulgadasCuadradas)&& unidad2.contains(hectareas)){entero(formulas_area.pulgadasCuadradas_hectareas(num_ingresado));}
                if(unidad1.contains(pulgadasCuadradas)&& unidad2.contains(kilometrosCuadrados)){entero(formulas_area.pulgadasCuadradas_kilometrosCuadrados(num_ingresado));}
                if(unidad1.contains(pulgadasCuadradas)&& unidad2.contains(pulgadasCuadradas)){entero(num_ingresado);}
                if(unidad1.contains(pulgadasCuadradas)&& unidad2.contains(piesCuadrados)){entero(formulas_area.pulgadasCuadradas_piesCuadrados(num_ingresado));}
                if(unidad1.contains(pulgadasCuadradas)&& unidad2.contains(yardasCuadradas)){entero(formulas_area.pulgadasCuadradas_yardasCuadradas(num_ingresado));}
                if(unidad1.contains(pulgadasCuadradas)&& unidad2.contains(acres)){entero(formulas_area.pulgadasCuadradas_acres(num_ingresado));}
                if(unidad1.contains(pulgadasCuadradas)&& unidad2.contains(millasCuadradas)){entero(formulas_area.pulgadasCuadradas_millasCuadradas(num_ingresado));}

                if(unidad1.contains(piesCuadrados)&& unidad2.contains(milimetrosCuadrados)){entero(formulas_area.piesCuadrados_milimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(piesCuadrados)&& unidad2.contains(centimetrosCuadrados)){entero(formulas_area.piesCuadrados_centimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(piesCuadrados)&& unidad2.contains(metrosCuadrados)){entero(formulas_area.piesCuadrados_metrosCuadrados(num_ingresado));}
                if(unidad1.contains(piesCuadrados)&& unidad2.contains(hectareas)){entero(formulas_area.piesCuadrados_hectareas(num_ingresado));}
                if(unidad1.contains(piesCuadrados)&& unidad2.contains(kilometrosCuadrados)){entero(formulas_area.piesCuadrados_kilometrosCuadrados(num_ingresado));}
                if(unidad1.contains(piesCuadrados)&& unidad2.contains(pulgadasCuadradas)){entero(formulas_area.piesCuadrados_pulgadasCuadradas(num_ingresado));}
                if(unidad1.contains(piesCuadrados)&& unidad2.contains(piesCuadrados)){entero(num_ingresado);}
                if(unidad1.contains(piesCuadrados)&& unidad2.contains(yardasCuadradas)){entero(formulas_area.piesCuadrados_yardasCuadradas(num_ingresado));}
                if(unidad1.contains(piesCuadrados)&& unidad2.contains(acres)){entero(formulas_area.piesCuadrados_acres(num_ingresado));}
                if(unidad1.contains(piesCuadrados)&& unidad2.contains(millasCuadradas)){entero(formulas_area.piesCuadrados_millasCuadradas(num_ingresado));}

                if(unidad1.contains(yardasCuadradas)&& unidad2.contains(milimetrosCuadrados)){entero(formulas_area.yardasCuadradas_milimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(yardasCuadradas)&& unidad2.contains(centimetrosCuadrados)){entero(formulas_area.yardasCuadradas_centimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(yardasCuadradas)&& unidad2.contains(metrosCuadrados)){entero(formulas_area.yardasCuadradas_metrosCuadrados(num_ingresado));}
                if(unidad1.contains(yardasCuadradas)&& unidad2.contains(hectareas)){entero(formulas_area.yardasCuadradas_hectareas(num_ingresado));}
                if(unidad1.contains(yardasCuadradas)&& unidad2.contains(kilometrosCuadrados)){entero(formulas_area.yardasCuadradas_kilometrosCuadrados(num_ingresado));}
                if(unidad1.contains(yardasCuadradas)&& unidad2.contains(pulgadasCuadradas)){entero(formulas_area.yardasCuadradas_pulgadasCuadradas(num_ingresado));}
                if(unidad1.contains(yardasCuadradas)&& unidad2.contains(piesCuadrados)){entero(formulas_area.yardasCuadradas_piesCuadrados(num_ingresado));}
                if(unidad1.contains(yardasCuadradas)&& unidad2.contains(yardasCuadradas)){entero(num_ingresado);}
                if(unidad1.contains(yardasCuadradas)&& unidad2.contains(acres)){entero(formulas_area.yardasCuadradas_acres(num_ingresado));}
                if(unidad1.contains(yardasCuadradas)&& unidad2.contains(millasCuadradas)){entero(formulas_area.yardasCuadradas_millasCuadradas(num_ingresado));}

                if(unidad1.contains(acres)&& unidad2.contains(milimetrosCuadrados)){entero(formulas_area.acres_milimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(acres)&& unidad2.contains(centimetrosCuadrados)){entero(formulas_area.acres_centimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(acres)&& unidad2.contains(metrosCuadrados)){entero(formulas_area.acres_metrosCuadrados(num_ingresado));}
                if(unidad1.contains(acres)&& unidad2.contains(hectareas)){entero(formulas_area.acres_hectareas(num_ingresado));}
                if(unidad1.contains(acres)&& unidad2.contains(kilometrosCuadrados)){entero(formulas_area.acres_kilometrosCuadrados(num_ingresado));}
                if(unidad1.contains(acres)&& unidad2.contains(pulgadasCuadradas)){entero(formulas_area.acres_pulgadasCuadradas(num_ingresado));}
                if(unidad1.contains(acres)&& unidad2.contains(piesCuadrados)){entero(formulas_area.acres_piesCuadrados(num_ingresado));}
                if(unidad1.contains(acres)&& unidad2.contains(yardasCuadradas)){entero(formulas_area.acres_yardasCuadradas(num_ingresado));}
                if(unidad1.contains(acres)&& unidad2.contains(acres)){entero(num_ingresado);}
                if(unidad1.contains(acres)&& unidad2.contains(millasCuadradas)){entero(formulas_area.acres_millasCuadradas(num_ingresado));}

                if(unidad1.contains(millasCuadradas)&& unidad2.contains(milimetrosCuadrados)){entero(formulas_area.millasCuadradas_milimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(millasCuadradas)&& unidad2.contains(centimetrosCuadrados)){entero(formulas_area.millasCuadradas_centimetrosCuadrados(num_ingresado));}
                if(unidad1.contains(millasCuadradas)&& unidad2.contains(metrosCuadrados)){entero(formulas_area.millasCuadradas_metrosCuadrados(num_ingresado));}
                if(unidad1.contains(millasCuadradas)&& unidad2.contains(hectareas)){entero(formulas_area.millasCuadradas_hectareas(num_ingresado));}
                if(unidad1.contains(millasCuadradas)&& unidad2.contains(kilometrosCuadrados)){entero(formulas_area.millasCuadradas_kilometrosCuadrados(num_ingresado));}
                if(unidad1.contains(millasCuadradas)&& unidad2.contains(pulgadasCuadradas)){entero(formulas_area.millasCuadradas_pulgadasCuadradas(num_ingresado));}
                if(unidad1.contains(millasCuadradas)&& unidad2.contains(piesCuadrados)){entero(formulas_area.millasCuadradas_piesCuadrados(num_ingresado));}
                if(unidad1.contains(millasCuadradas)&& unidad2.contains(yardasCuadradas)){entero(formulas_area.millasCuadradas_yardasCuadradas(num_ingresado));}
                if(unidad1.contains(millasCuadradas)&& unidad2.contains(acres)){entero(formulas_area.millasCuadradas_acres(num_ingresado));}
                if(unidad1.contains(millasCuadradas)&& unidad2.contains(millasCuadradas)){entero(num_ingresado);}
            }

            //VELOCIDAD
            if(toast_principal.contains(datos[6])){
                if(unidad1.contains(centimetrosSegundo)&& unidad2.contains(centimetrosSegundo)){entero(num_ingresado);}
                if(unidad1.contains(centimetrosSegundo)&& unidad2.contains(metrosSegundo)){entero(formulas_velocidad.centimetrosPSegundo_metrosSegundo(num_ingresado));}
                if(unidad1.contains(centimetrosSegundo)&& unidad2.contains(kilometrosHora)){entero(formulas_velocidad.centimetrosPSegundo_kilometrosHora(num_ingresado));}
                if(unidad1.contains(centimetrosSegundo)&& unidad2.contains(piesSegundo)){entero(formulas_velocidad.centimetrosPSegundo_piesSegundo(num_ingresado));}
                if(unidad1.contains(centimetrosSegundo)&& unidad2.contains(millasHora)){entero(formulas_velocidad.centimetrosPSegundo_millasHora(num_ingresado));}
                if(unidad1.contains(centimetrosSegundo)&& unidad2.contains(nudos)){entero(formulas_velocidad.centimetrosPSegundo_nudos(num_ingresado));}
                if(unidad1.contains(centimetrosSegundo)&& unidad2.contains(mach)){entero(formulas_velocidad.centimetrosPSegundo_mach(num_ingresado));}

                if(unidad1.contains(metrosSegundo)&& unidad2.contains(metrosSegundo)){entero(num_ingresado);}
                if(unidad1.contains(metrosSegundo)&& unidad2.contains(centimetrosSegundo)){entero(formulas_velocidad.metrosSegundo_centimetrosSegundo(num_ingresado));}
                if(unidad1.contains(metrosSegundo)&& unidad2.contains(kilometrosHora)){entero(formulas_velocidad.metrosSegundo_kilometrosHora(num_ingresado));}
                if(unidad1.contains(metrosSegundo)&& unidad2.contains(piesSegundo)){entero(formulas_velocidad.metrosSegundo_piesSegundo(num_ingresado));}
                if(unidad1.contains(metrosSegundo)&& unidad2.contains(millasHora)){entero(formulas_velocidad.metrosSegundo_millasHora(num_ingresado));}
                if(unidad1.contains(metrosSegundo)&& unidad2.contains(nudos)){entero(formulas_velocidad.metrisSegundo_nudos(num_ingresado));}
                if(unidad1.contains(metrosSegundo)&& unidad2.contains(mach)){entero(formulas_velocidad.metrosSegundo_mach(num_ingresado));}

                if(unidad1.contains(kilometrosHora)&& unidad2.contains(kilometrosHora)){entero(num_ingresado);}
                if(unidad1.contains(kilometrosHora)&& unidad2.contains(centimetrosSegundo)){entero(formulas_velocidad.kilometrosHora_centimetrosSegundo(num_ingresado));}
                if(unidad1.contains(kilometrosHora)&& unidad2.contains(metrosSegundo)){entero(formulas_velocidad.kilometrosHora_metrosSegundo(num_ingresado));}
                if(unidad1.contains(kilometrosHora)&& unidad2.contains(piesSegundo)){entero(formulas_velocidad.kilometrosHora_piesSegundo(num_ingresado));}
                if(unidad1.contains(kilometrosHora)&& unidad2.contains(millasHora)){entero(formulas_velocidad.kilometrosHora_millasHora(num_ingresado));}
                if(unidad1.contains(kilometrosHora)&& unidad2.contains(nudos)){entero(formulas_velocidad.kilometrosHora_nudos(num_ingresado));}
                if(unidad1.contains(kilometrosHora)&& unidad2.contains(mach)){entero(formulas_velocidad.kilometrosHora_mach(num_ingresado));}

                if(unidad1.contains(piesSegundo)&& unidad2.contains(piesSegundo)){entero(num_ingresado);}
                if(unidad1.contains(piesSegundo)&& unidad2.contains(centimetrosSegundo)){entero(formulas_velocidad.piesSegundo_centometrosSegundo(num_ingresado));}
                if(unidad1.contains(piesSegundo)&& unidad2.contains(metrosSegundo)){entero(formulas_velocidad.piesSegundo_metrosSegundo(num_ingresado));}
                if(unidad1.contains(piesSegundo)&& unidad2.contains(kilometrosHora)){entero(formulas_velocidad.piesSegundo_kilometrosHora(num_ingresado));}
                if(unidad1.contains(piesSegundo)&& unidad2.contains(millasHora)){entero(formulas_velocidad.piesSegundo_millasHora(num_ingresado));}
                if(unidad1.contains(piesSegundo)&& unidad2.contains(nudos)){entero(formulas_velocidad.piesSegundo_nudos(num_ingresado));}
                if(unidad1.contains(piesSegundo)&& unidad2.contains(mach)){entero(formulas_velocidad.piesSegundo_mach(num_ingresado));}

                if(unidad1.contains(millasHora)&& unidad2.contains(millasHora)){entero(num_ingresado);}
                if(unidad1.contains(millasHora)&& unidad2.contains(centimetrosSegundo)){entero(formulas_velocidad.millasHora_centimetrosSegundo(num_ingresado));}
                if(unidad1.contains(millasHora)&& unidad2.contains(metrosSegundo)){entero(formulas_velocidad.millasHora_metrosSegundo(num_ingresado));}
                if(unidad1.contains(millasHora)&& unidad2.contains(kilometrosHora)){entero(formulas_velocidad.millasHora_kilometrosHora(num_ingresado));}
                if(unidad1.contains(millasHora)&& unidad2.contains(piesSegundo)){entero(formulas_velocidad.millasHora_piesSegundo(num_ingresado));}
                if(unidad1.contains(millasHora)&& unidad2.contains(nudos)){entero(formulas_velocidad.millasHora_nudos(num_ingresado));}
                if(unidad1.contains(millasHora)&& unidad2.contains(mach)){entero(formulas_velocidad.millasHora_mach(num_ingresado));}

                if(unidad1.contains(nudos)&& unidad2.contains(nudos)){entero(num_ingresado);}
                if(unidad1.contains(nudos)&& unidad1.contains(centimetrosSegundo)){entero(formulas_velocidad.nudos_centimetrosSegundo(num_ingresado));}
                if(unidad1.contains(nudos)&& unidad1.contains(metrosSegundo)){entero(formulas_velocidad.nudos_metrosSegundo(num_ingresado));}
                if(unidad1.contains(nudos)&& unidad1.contains(kilometrosHora)){entero(formulas_velocidad.nudos_kilometrosHora(num_ingresado));}
                if(unidad1.contains(nudos)&& unidad1.contains(piesSegundo)){entero(formulas_velocidad.nudos_piesSegundo(num_ingresado));}
                if(unidad1.contains(nudos)&& unidad1.contains(millasHora)){entero(formulas_velocidad.nudos_millasHora(num_ingresado));}
                if(unidad1.contains(nudos)&& unidad1.contains(mach)){entero(formulas_velocidad.nudos_mach(num_ingresado));}

                if(unidad1.contains(mach)&& unidad2.contains(mach)){entero(num_ingresado);}
                if(unidad1.contains(mach)&& unidad2.contains(centimetrosSegundo)){entero(formulas_velocidad.mach_centimetrosSegundo(num_ingresado));}
                if(unidad1.contains(mach)&& unidad2.contains(metrosSegundo)){entero(formulas_velocidad.mach_metrosSegundo(num_ingresado));}
                if(unidad1.contains(mach)&& unidad2.contains(kilometrosHora)){entero(formulas_velocidad.mach_kilometroHora(num_ingresado));}
                if(unidad1.contains(mach)&& unidad2.contains(piesSegundo)){entero(formulas_velocidad.mach_piesSegundo(num_ingresado));}
                if(unidad1.contains(mach)&& unidad2.contains(millasHora)){entero(formulas_velocidad.mach_millasHora(num_ingresado));}
                if(unidad1.contains(mach)&& unidad2.contains(nudos)){entero(formulas_velocidad.mach_nudos(num_ingresado));}

            }

            //TIEMPO
            if(toast_principal.contains(datos[7])){
                if (unidad1.contains(microsegundo) && unidad2.contains(microsegundo)) {
                    entero(num_ingresado);
                }
                if (unidad1.contains(microsegundo) && unidad2.contains(milisegundo)) {
                    double res=formulas_tiempo.microsegundo_milisegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(microsegundo) && unidad2.contains(segundo)) {
                    double res=formulas_tiempo.microsegundo_segundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(microsegundo) && unidad2.contains(minuto)) {
                    double res=formulas_tiempo.microsegundo_minuto(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(microsegundo) && unidad2.contains(hora)) {
                    double res=formulas_tiempo.microsegundo_hora(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(microsegundo) && unidad2.contains(dia)) {
                    double res=formulas_tiempo.microsegundo_dia(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(microsegundo) && unidad2.contains(semana)) {
                    double res=formulas_tiempo.microsegundo_semana(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(microsegundo) && unidad2.contains(año)) {
                    double res=formulas_tiempo.microsegundo_año(num_ingresado);
                    entero(res);
                }



                if (unidad1.contains(milisegundo) && unidad2.contains(microsegundo)) {
                    double res=formulas_tiempo.milisegundo_microsegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(milisegundo) && unidad2.contains(milisegundo)) {
                    entero(num_ingresado);
                }
                if (unidad1.contains(milisegundo) && unidad2.contains(segundo)) {
                    double res=formulas_tiempo.milisegundo_segundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(milisegundo) && unidad2.contains(minuto)) {
                    double res=formulas_tiempo.milisegundo_minuto(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(milisegundo) && unidad2.contains(hora)) {
                    double res=formulas_tiempo.milisegundo_hora(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(milisegundo) && unidad2.contains(dia)) {
                    double res=formulas_tiempo.milisegundo_dia(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(milisegundo) && unidad2.contains(semana)) {
                    double res=formulas_tiempo.milisegundo_semana(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(milisegundo) && unidad2.contains(año)) {
                    double res=formulas_tiempo.milisegundo_año(num_ingresado);
                    entero(res);
                }


                if (unidad1.contains(segundo) && unidad2.contains(microsegundo)) {
                    double res=formulas_tiempo.segundo_microsegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(segundo) && unidad2.contains(milisegundo)) {
                    double res=formulas_tiempo.segundo_milisegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(segundo) && unidad2.contains(segundo)) {
                    entero(num_ingresado);
                }
                if (unidad1.contains(segundo) && unidad2.contains(minuto)) {
                    double res=formulas_tiempo.segundo_minuto(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(segundo) && unidad2.contains(hora)) {
                    double res=formulas_tiempo.segundo_hora(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(segundo) && unidad2.contains(dia)) {
                    double res=formulas_tiempo.segundo_dia(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(segundo) && unidad2.contains(semana)) {
                    double res=formulas_tiempo.segundo_semana(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(segundo) && unidad2.contains(año)) {
                    double res=formulas_tiempo.segundo_año(num_ingresado);
                    entero(res);
                }


                if (unidad1.contains(minuto) && unidad2.contains(microsegundo)) {
                    double res=formulas_tiempo.minuto_microsegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(minuto) && unidad2.contains(milisegundo)) {
                    double res=formulas_tiempo.minuto_milisegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(minuto) && unidad2.contains(segundo)) {
                    double res=formulas_tiempo.minuto_segundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(minuto) && unidad2.contains(minuto)) {
                    entero(num_ingresado);
                }
                if (unidad1.contains(minuto) && unidad2.contains(hora)) {
                    double res=formulas_tiempo.minuto_hora(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(minuto) && unidad2.contains(dia)) {
                    double res=formulas_tiempo.minuto_dia(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(minuto) && unidad2.contains(semana)) {
                    double res=formulas_tiempo.minuto_semana(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(minuto) && unidad2.contains(año)) {
                    double res=formulas_tiempo.minuto_año(num_ingresado);
                    entero(res);
                }


                if (unidad1.contains(hora) && unidad2.contains(microsegundo)) {
                    double res=formulas_tiempo.hora_microsegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(hora) && unidad2.contains(milisegundo)) {
                    double res=formulas_tiempo.hora_milisegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(hora) && unidad2.contains(segundo)) {
                    double res=formulas_tiempo.hora_segundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(hora) && unidad2.contains(minuto)) {
                    double res=formulas_tiempo.hora_minuto(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(hora) && unidad2.contains(hora)) {
                    entero(num_ingresado);
                }
                if (unidad1.contains(hora) && unidad2.contains(dia)) {
                    double res=formulas_tiempo.hora_dia(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(hora) && unidad2.contains(semana)) {
                    double res=formulas_tiempo.hora_semana(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(hora) && unidad2.contains(año)) {
                    double res=formulas_tiempo.hora_año(num_ingresado);
                    entero(res);
                }


                if (unidad1.contains(dia) && unidad2.contains(microsegundo)) {
                    double res=formulas_tiempo.dia_microsegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(dia) && unidad2.contains(milisegundo)) {
                    double res=formulas_tiempo.dia_milisegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(dia) && unidad2.contains(segundo)) {
                    double res=formulas_tiempo.dia_segundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(dia) && unidad2.contains(minuto)) {
                    double res=formulas_tiempo.dia_minuto(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(dia) && unidad2.contains(hora)) {
                    double res=formulas_tiempo.dia_hora(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(dia) && unidad2.contains(dia)) {
                    entero(num_ingresado);
                }
                if (unidad1.contains(dia) && unidad2.contains(semana)) {
                    double res=formulas_tiempo.dia_semana(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(dia) && unidad2.contains(año)) {
                    double res=formulas_tiempo.dia_año(num_ingresado);
                    entero(res);
                }


                if (unidad1.contains(semana) && unidad2.contains(microsegundo)) {
                    double res=formulas_tiempo.semana_microsegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(semana) && unidad2.contains(milisegundo)) {
                    double res=formulas_tiempo.semana_milisegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(semana) && unidad2.contains(segundo)) {
                    double res=formulas_tiempo.semana_segundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(semana) && unidad2.contains(minuto)) {
                    double res=formulas_tiempo.semana_minuto(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(semana) && unidad2.contains(hora)) {
                    double res=formulas_tiempo.semana_hora(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(semana) && unidad2.contains(dia)) {
                    double res=formulas_tiempo.semana_dia(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(semana) && unidad2.contains(semana)) {
                    entero(num_ingresado);
                }
                if (unidad1.contains(semana) && unidad2.contains(año)) {
                    double res=formulas_tiempo.semana_año(num_ingresado);
                    entero(res);
                }


                if (unidad1.contains(año) && unidad2.contains(microsegundo)) {
                    double res=formulas_tiempo.año_microsegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(año) && unidad2.contains(milisegundo)) {
                    double res=formulas_tiempo.año_milisegundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(año) && unidad2.contains(segundo)) {
                    double res=formulas_tiempo.año_segundo(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(año) && unidad2.contains(minuto)) {
                    double res=formulas_tiempo.año_minuto(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(año) && unidad2.contains(hora)) {
                    double res=formulas_tiempo.año_hora(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(año) && unidad2.contains(dia)) {
                    double res=formulas_tiempo.año_dia(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(año) && unidad2.contains(semana)) {
                    double res=formulas_tiempo.año_semana(num_ingresado);
                    entero(res);
                }
                if (unidad1.contains(año) && unidad2.contains(año)) {
                    entero(num_ingresado);
                }
            }

            //POTENCIA
            if(toast_principal.contains(datos[8])){
                if(unidad1.contains(vatios)&& unidad2.contains(vatios)){entero(num_ingresado);}
                if(unidad1.contains(vatios)&& unidad2.contains(kilovatios)){entero(formulas_potencia.vatios_kilovatios(num_ingresado));}
                if(unidad1.contains(vatios)&& unidad2.contains(caballosDeFuerza)){entero(formulas_potencia.vatios_caballosDeFuerza(num_ingresado));}
                if(unidad1.contains(vatios)&& unidad2.contains(pieLibras)){entero(formulas_potencia.vatios_pieLibras(num_ingresado));}
                if(unidad1.contains(vatios)&& unidad2.contains(unidadesTermicasBritanicas)){entero(formulas_potencia.vatios_unidadesTermicasBritanicas(num_ingresado));}

                if(unidad1.contains(kilovatios)&& unidad2.contains(kilovatios)){entero(num_ingresado);}
                if(unidad1.contains(kilovatios)&& unidad2.contains(vatios)){entero(formulas_potencia.kilovatios_vatios(num_ingresado));}
                if(unidad1.contains(kilovatios)&& unidad2.contains(caballosDeFuerza)){entero(formulas_potencia.kilovatios_caballosDeFuerza(num_ingresado));}
                if(unidad1.contains(kilovatios)&& unidad2.contains(pieLibras)){entero(formulas_potencia.kilovatios_pieLibras(num_ingresado));}
                if(unidad1.contains(kilovatios)&& unidad2.contains(unidadesTermicasBritanicas)){entero(formulas_potencia.kilovatios_unidadesTermicasBritanicas(num_ingresado));}

                if(unidad1.contains(caballosDeFuerza)&& unidad2.contains(caballosDeFuerza)){entero(num_ingresado);}
                if(unidad1.contains(caballosDeFuerza)&& unidad2.contains(vatios)){entero(formulas_potencia.caballosFuerza_vatios(num_ingresado));}
                if(unidad1.contains(caballosDeFuerza)&& unidad2.contains(kilovatios)){entero(formulas_potencia.caballosFuerza_kilovatios(num_ingresado));}
                if(unidad1.contains(caballosDeFuerza)&& unidad2.contains(pieLibras)){entero(formulas_potencia.caballosFuerza_pieLibras(num_ingresado));}
                if(unidad1.contains(caballosDeFuerza)&& unidad2.contains(unidadesTermicasBritanicas)){entero(formulas_potencia.caballosFuerza_unidadesTermicasBritanicas(num_ingresado));}

                if(unidad1.contains(pieLibras)&& unidad2.contains(pieLibras)){entero(num_ingresado);}
                if(unidad1.contains(pieLibras)&& unidad2.contains(vatios)){entero(formulas_potencia.pieLibras_vatios(num_ingresado));}
                if(unidad1.contains(pieLibras)&& unidad2.contains(kilovatios)){entero(formulas_potencia.pieLibras_kilovatios(num_ingresado));}
                if(unidad1.contains(pieLibras)&& unidad2.contains(caballosDeFuerza)){entero(formulas_potencia.pieLibras_caballosDeFuerza(num_ingresado));}
                if(unidad1.contains(pieLibras)&& unidad2.contains(unidadesTermicasBritanicas)){entero(formulas_potencia.pieLibras_unidadesTermicasBritanicas(num_ingresado));}

                if(unidad1.contains(unidadesTermicasBritanicas)&& unidad2.contains(unidadesTermicasBritanicas)){entero(num_ingresado);}
                if(unidad1.contains(unidadesTermicasBritanicas)&& unidad2.contains(vatios)){entero(formulas_potencia.unidadesTermicasBritanicas_vatios(num_ingresado));}
                if(unidad1.contains(unidadesTermicasBritanicas)&& unidad2.contains(kilovatios)){entero(formulas_potencia.unidadesTermicasBritanicas_kilovatios(num_ingresado));}
                if (unidad1.contains(unidadesTermicasBritanicas)&& unidad2.contains(pieLibras)){entero(formulas_potencia.unidadesTermicasBritanicas_pieLibras(num_ingresado));
                }
                if (unidad1.contains(unidadesTermicasBritanicas)&& unidad2.contains(caballosDeFuerza)){entero(formulas_potencia.unidadesTermicasBritanicas_caballosDeFuerza(num_ingresado));
                }
            }

            //DATOS
            if(toast_principal.contains(datos[9])){
                if(unidad1.contains(Bits)) {
                    entero(bits.bits(unidad1, unidad2, num_ingresado, unidades_datos));}
                if(unidad1.contains(Bytes)){
                    entero(bytes.bytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Kilobits)){
                    entero(kilobits.kilobits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Kibibits)){
                    entero(kibibits.kibibits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Kilobytes)){
                    entero(kilobytes.kilobytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Kibibytes)){
                    entero(kibibytes.kibibytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Megabits)){
                    entero(megabits.megabits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Mebibits)){
                    entero(mebibits.mebibits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Megabytes)){
                    entero(megabytes.megabytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Mebibytes)){
                    entero(mebibytes.mebibytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Gigabits)){
                    entero(gigabits.gigabits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Gibibits)){
                    entero(gibibits.gibibits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Gigabytes)){
                    entero(gigabytes.gigabytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Gibibytes)){
                    entero(gibibytes.gibibytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Terabits)){
                    entero(terabits.terabits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Tebibits)){
                    entero(tebibits.tebibits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Terabytes)){
                    entero(terabytes.terabytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Tebibytes)){
                    entero(tebibytes.tebibytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Petabits)){
                    entero(petabits.petabits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Pebibits)){
                    entero(pebibits.pebibits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Petabytes)){
                    entero(petabytes.petabytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Pebibytes)){
                    entero(pebibytes.pebibytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Hexabits)){
                    entero(hexabits.hexabits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Exbibits)){
                    entero(exbibits.exbibits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Hexabytes)){
                    entero(hexabytes.hexabytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Hexbibytes)){
                    entero(hexbibytes.hexbibytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Zebibits)){
                    entero(zebibits.zebibits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Zetabits)){
                    entero(zetabits.zetabits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Zetabytes)){
                    entero(zetabytes.zetabytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Zebibytes)){
                    entero(zebibytes.zebibytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Yottabit)){
                    entero(yottabit.yottabit(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Yobibits)){
                    entero(yobibits.yobibits(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Yottabyte)){
                    entero(yottabyte.yottabyte(unidad1, unidad2, num_ingresado, unidades_datos));
                }
                if(unidad1.contains(Yobibytes)){
                    entero(yobibytes.yobibytes(unidad1, unidad2, num_ingresado, unidades_datos));
                }

            }

            //PRESION
            if(toast_principal.contains(datos[10])){
                if(unidad1.contains(atmosfera)&& unidad2.contains(atmosfera)){entero(num_ingresado);}
                if(unidad1.contains(atmosfera)&& unidad2.contains(bares)){entero(formulas_presion.atmosferas_bares(num_ingresado));}
                if(unidad1.contains(atmosfera)&& unidad2.contains(kilopascales)){entero(formulas_presion.atmosferas_kilopascales(num_ingresado));}
                if(unidad1.contains(atmosfera)&& unidad2.contains(milimetrosDeMercurio)){entero(formulas_presion.atmosferas_milimetrosDeMercurio(num_ingresado));}
                if(unidad1.contains(atmosfera)&& unidad2.contains(pascales)){entero(formulas_presion.atmosferas_pascales(num_ingresado));}
                if(unidad1.contains(atmosfera)&& unidad2.contains(librasPorPulgadaCuadrada)){entero(formulas_presion.atmosferas_librasPorPulgada(num_ingresado));}

                if(unidad1.contains(bares)&& unidad2.contains(bares)){entero(num_ingresado);}
                if(unidad1.contains(bares)&& unidad2.contains(atmosfera)){entero(formulas_presion.bares_atmosferas(num_ingresado));}
                if(unidad1.contains(bares)&& unidad2.contains(kilopascales)){entero(formulas_presion.bares_kilopascales(num_ingresado));}
                if(unidad1.contains(bares)&& unidad2.contains(pascales)){entero(formulas_presion.bares_pascales(num_ingresado));}
                if(unidad1.contains(bares)&& unidad2.contains(milimetrosDeMercurio)){entero(formulas_presion.bares_milimetrosDeMercurio(num_ingresado));}
                if(unidad1.contains(bares)&& unidad2.contains(librasPorPulgadaCuadrada)){entero(formulas_presion.bares_librasPorPulgadaCuadrada(num_ingresado));}

                if(unidad1.contains(milimetrosDeMercurio)&& unidad2.contains(milimetrosDeMercurio)){entero(num_ingresado);}
                if(unidad1.contains(milimetrosDeMercurio)&& unidad2.contains(atmosfera)){entero(formulas_presion.milimetrosDeMercurio_atmosferas(num_ingresado));}
                if(unidad1.contains(milimetrosDeMercurio)&& unidad2.contains(bares)){entero(formulas_presion.milimetrosDeMercurio_bares(num_ingresado));}
                if(unidad1.contains(milimetrosDeMercurio)&& unidad2.contains(kilopascales)){entero(formulas_presion.milimetrosDeMercurio_kilopascales(num_ingresado));}
                if(unidad1.contains(milimetrosDeMercurio)&& unidad2.contains(pascales)){entero(formulas_presion.milimetrosDeMercurio_pascales(num_ingresado));}
                if(unidad1.contains(milimetrosDeMercurio)&& unidad2.contains(librasPorPulgadaCuadrada)){entero(formulas_presion.milimetrosDeMercurio_librasPorPulgadaCuadrada(num_ingresado));}

                if(unidad1.contains(pascales)&& unidad2.contains(pascales)){entero(num_ingresado);}
                if(unidad1.contains(pascales)&& unidad2.contains(atmosfera)){entero(formulas_presion.pascales_atmosferas(num_ingresado));}
                if(unidad1.contains(pascales)&& unidad2.contains(bares)){entero(formulas_presion.pascales_bares(num_ingresado));}
                if(unidad1.contains(pascales)&& unidad2.contains(kilopascales)){entero(formulas_presion.pascales_kilopascales(num_ingresado));}
                if(unidad1.contains(pascales)&& unidad2.contains(librasPorPulgadaCuadrada)){entero(formulas_presion.pascales_librasPorPulgadaCuadrada(num_ingresado));}
                if(unidad1.contains(pascales)&& unidad2.contains(milimetrosDeMercurio)){entero(formulas_presion.pascales_milimetrosDeMercurio(num_ingresado));}

                if(unidad1.contains(kilopascales)&& unidad2.contains(kilopascales)){entero(num_ingresado);}
                if(unidad1.contains(kilopascales)&& unidad2.contains(atmosfera)){entero(formulas_presion.kilopascales_atmosferas(num_ingresado));}
                if(unidad1.contains(kilopascales)&& unidad2.contains(bares)){entero(formulas_presion.kilopascales_bares(num_ingresado));}
                if(unidad1.contains(kilopascales)&& unidad2.contains(pascales)){entero(formulas_presion.kilopascales_pascales(num_ingresado));}
                if(unidad1.contains(kilopascales)&& unidad2.contains(milimetrosDeMercurio)){entero(formulas_presion.kilopascales_milimetrosDeMercurio(num_ingresado));}
                if(unidad1.contains(kilopascales)&& unidad2.contains(librasPorPulgadaCuadrada)){entero(formulas_presion.kilopascales_librasPorPulgada(num_ingresado));}

                if(unidad1.contains(librasPorPulgadaCuadrada)&& unidad2.contains(librasPorPulgadaCuadrada)){entero(num_ingresado);}
                if(unidad1.contains(librasPorPulgadaCuadrada)&& unidad2.contains(atmosfera)){entero(formulas_presion.librasPorPulgadaCuadrada_atmosferas(num_ingresado));}
                if(unidad1.contains(librasPorPulgadaCuadrada)&& unidad2.contains(bares)){entero(formulas_presion.librasPorPulgadaCuadrada_bares(num_ingresado));}
                if(unidad1.contains(librasPorPulgadaCuadrada)&& unidad2.contains(pascales)){entero(formulas_presion.librasPorPulgadaCuadrada_pascales(num_ingresado));}
                if(unidad1.contains(librasPorPulgadaCuadrada)&& unidad2.contains(kilopascales)){entero(formulas_presion.librasPorPulgadaCuadrada_kilopascales(num_ingresado));}
                if(unidad1.contains(librasPorPulgadaCuadrada)&& unidad2.contains(milimetrosDeMercurio)){entero(formulas_presion.librasPorPulgadaCuadrada_milimetrosDeMercurio2(num_ingresado));}
            }

            //ANGULO
            if(toast_principal.contains(datos[11])){
                if(unidad1.contains(grado)&& unidad2.contains(grado)){entero(num_ingresado);}
                if(unidad1.contains(grado)&& unidad2.contains(radian)) {
                    entero(formulas_angulo.grados_radianes(num_ingresado));}
                if(unidad1.contains(grado)&& unidad2.contains(grado_centesimal)) {
                    entero(formulas_angulo.grados_gradosCentesimales(num_ingresado));}
                if(unidad1.contains(radian)&& unidad2.contains(radian)){entero(num_ingresado);}
                if(unidad1.contains(radian)&& unidad2.contains(grado)) {
                    entero(formulas_angulo.radianes_grados(num_ingresado));}
                if(unidad1.contains(radian)&& unidad2.contains(grado_centesimal)) {
                    entero(formulas_angulo.radianes_gradoCentesimal(num_ingresado));}
                if(unidad1.contains(grado_centesimal) && unidad2.contains(grado_centesimal)){entero(num_ingresado);}
                if(unidad1.contains(grado_centesimal)&& unidad2.contains(grado)){entero(formulas_angulo.gradoCentesimal_grado(num_ingresado));}
                if(unidad1.contains(grado_centesimal)&& unidad2.contains(radian)){entero(formulas_angulo.gradoCentesimal_radian(num_ingresado));}
            }
        }

    }

    public void backgroundLayout(AppBarLayout layout){
        layout.setBackgroundColor(Color.parseColor("#D32F2F"));
    }

    public void ocultarOpcioes(final View opciones,final View lista){
        //final View opciones=findViewById(R.id.opciones);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
        if(opciones.getVisibility()==View.VISIBLE && lista.getVisibility()==View.INVISIBLE){
            int cx=((opciones.getLeft()+opciones.getRight())/2);
            int cy=((opciones.getTop()+opciones.getBottom())/2);

            int cx1=((lista.getLeft()+lista.getRight())/2);
            int cy1=((lista.getTop()+lista.getBottom())/2);

            int radioInicial2=lista.getWidth();
            int radioInicial=opciones.getWidth();

            Animator animator= ViewAnimationUtils.createCircularReveal(opciones, cx, cy, radioInicial, 0);
            Animator animator2 = ViewAnimationUtils.createCircularReveal(lista, cx1, cy1, 0, radioInicial2);

            animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    opciones.setVisibility(View.INVISIBLE);
                    lista.setVisibility(View.VISIBLE);
                }
            });
            animator.start();
            animator2.start();
        }else {
            int cx = ((opciones.getLeft() + opciones.getRight()) / 2);
            int cy = ((opciones.getTop() + opciones.getBottom()) / 2);

            int cx2 = ((lista.getLeft() + lista.getRight()) / 2);
            int cy2 = ((lista.getTop() + lista.getBottom()) / 2);

            int radioInicial = opciones.getWidth();
            int radioInicial2 = opciones.getWidth();

            Animator animator = ViewAnimationUtils.createCircularReveal(opciones, cx, cy, 0, radioInicial);
            Animator animator2= ViewAnimationUtils.createCircularReveal(lista, cx2, cy2, radioInicial2, 0);
                opciones.setVisibility(View.VISIBLE);
                lista.setVisibility(View.INVISIBLE);
                animator.start();
                animator2.start();
            }
        }
    }


    public void arrayAdaper(List lista){
        ArrayAdapter arrayAdapter;
        //Adaptador
        arrayAdapter = new DatosArrayAdapter<OrigenDeDatos>(this, lista);
        //RELACIÓN DEL ADAPTADOR CON LA LISTA
        listaUnidades.setAdapter(arrayAdapter);
    }
    public void entero (double res){
        respuesta=(AutofitTextView)findViewById(R.id.texto_salida);
        if(res%1==0){
            if(res>=9223372036854775807L){
                respuesta.setText(String.valueOf(res)+"");
            }else{
                respuesta.setText((long) res + "");
            }
        }else
            respuesta.setText(String.valueOf(res)+"");
    }

    public void enteroTemperatura (double res){
        respuesta=(AutofitTextView)findViewById(R.id.texto_salida);
        if(res%1==0){
            respuesta.setText((int) res + "°");
        }else
            respuesta.setText(String.valueOf(res)+"°");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == event.KEYCODE_BACK) {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_keyboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
            //startActivity(new Intent(this,SettingsActivity.class));
            //return true;
        //}

        switch (id){
            case R.id.action_settings:{
                Intent intent=new Intent(this,about.class);
                startActivity(intent);
                //finish();
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }

    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
            } catch (NumberFormatException nfe){
            return false;
        }
    }
    private static boolean isDouble(String cadena){
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
}
