package com.astudios.aristosstudios.convertidorunidades;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import me.grantland.widget.AutofitHelper;
import me.grantland.widget.AutofitTextView;

public class keyboard extends AppCompatActivity {
    private Typeface fuente;
    private Vibrator vibración;
    public TextView pantalla;

    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;
    private Button boton5;
    private Button boton6;
    private Button boton7;
    private Button boton8;
    private Button boton9;
    private Button boton0;
    private Button botonpunto;
    private Button negativo;
    private ImageButton del;
    public boolean inicio=true;
    public Vibrator vibrator;
    public static String numero=null;
    public SetDatos setDatos=new SetDatos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
        //getSystemService(CLIPBOARD_SERVICE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //final ClipboardManager clipBoard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
        if(Build.VERSION.SDK_INT<= Build.VERSION_CODES.KITKAT){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }

        //pantalla=(TextView)findViewById(R.id.pantalla);
        pantalla=(AutofitTextView)findViewById(R.id.pantalla);
        String direccion="fonts/Roboto-Thin.ttf";
        fuente=Typeface.createFromAsset(getAssets(),direccion);
        pantalla.setTypeface(fuente, Typeface.BOLD);
        AutofitHelper.create(pantalla);

        if(setDatos.numero=="0" || setDatos.getNumero()=="0"||setDatos.numero.contains("0")||pantalla.getText()=="0"){
            //pantalla.setText(setDatos.numero);
            inicio=true;
        }else{
        pantalla.setText(setDatos.numero);
        inicio=false;}

        //definicion botones
        boton0=(Button)findViewById(R.id.numero0);
        boton1=(Button)findViewById(R.id.numero1);
        boton2=(Button)findViewById(R.id.numero2);
        boton3=(Button)findViewById(R.id.numero3);
        boton4=(Button)findViewById(R.id.numero4);
        boton5=(Button)findViewById(R.id.numero5);
        boton6=(Button)findViewById(R.id.numero6);
        boton7=(Button)findViewById(R.id.numero7);
        boton8=(Button)findViewById(R.id.numero8);
        boton9=(Button)findViewById(R.id.numero9);
        botonpunto=(Button)findViewById(R.id.punto);
        negativo=(Button)findViewById(R.id.negativo);
        del=(ImageButton)findViewById(R.id.eliminar);

        //cargando fuente
        boton0.setTypeface(fuente, Typeface.NORMAL);
        boton1.setTypeface(fuente, Typeface.NORMAL);
        boton2.setTypeface(fuente, Typeface.NORMAL);
        boton3.setTypeface(fuente, Typeface.NORMAL);
        boton4.setTypeface(fuente, Typeface.NORMAL);
        boton5.setTypeface(fuente, Typeface.NORMAL);
        boton6.setTypeface(fuente, Typeface.NORMAL);
        boton7.setTypeface(fuente, Typeface.NORMAL);
        boton8.setTypeface(fuente, Typeface.NORMAL);
        boton9.setTypeface(fuente, Typeface.NORMAL);
        botonpunto.setTypeface(fuente, Typeface.NORMAL);
        negativo.setTypeface(fuente, Typeface.NORMAL);

        //boton 0
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inicio == true) {
                    pantalla.setText("");
                    pantalla.setText("0");
                    inicio = false;
                } else {
                    pantalla.setText(pantalla.getText() + "0");
                }
            }
        });

        //boton 1
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio==true)
                {
                    pantalla.setText("");
                    pantalla.setText("1");;
                    inicio=false;
                }else
                {
                    pantalla.setText(pantalla.getText()+"1");
                }
            }
        });

        //boton 2
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio==true)
                {
                    pantalla.setText("");
                    pantalla.setText("2");;
                    inicio=false;
                }else
                {
                    pantalla.setText(pantalla.getText()+"2");
                }
            }
        });

        //boton 3
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio==true)
                {
                    pantalla.setText("");
                    pantalla.setText("3");;
                    inicio=false;
                }else
                {
                    pantalla.setText(pantalla.getText()+"3");
                }
            }
        });

        //boton 4
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio==true)
                {
                    pantalla.setText("");
                    pantalla.setText("4");;
                    inicio=false;
                }else
                {
                    pantalla.setText(pantalla.getText()+"4");
                }
            }
        });

        //boton 5
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio==true)
                {
                    pantalla.setText("");
                    pantalla.setText("5");;
                    inicio=false;
                }else
                {
                    pantalla.setText(pantalla.getText()+"5");
                }
            }
        });

        //boton 6
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio==true)
                {
                    pantalla.setText("");
                    pantalla.setText("6");;
                    inicio=false;
                }else
                {
                    pantalla.setText(pantalla.getText()+"6");
                }
            }
        });

        //boton 7
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio==true)
                {
                    pantalla.setText("");
                    pantalla.setText("7");;
                    inicio=false;
                }else
                {
                    pantalla.setText(pantalla.getText()+"7");
                }
            }
        });

        //boton 8
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio==true)
                {
                    pantalla.setText("");
                    pantalla.setText("8");;
                    inicio=false;
                }else
                {
                    pantalla.setText(pantalla.getText()+"8");
                }
            }
        });

        //boton 9
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inicio==true)
                {
                    pantalla.setText("");
                    pantalla.setText("9");;
                    inicio=false;
                }else
                {
                    pantalla.setText(pantalla.getText()+"9");
                }
            }
        });

        //boton punto

        botonpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pantalla.getText().toString().contains("."))
                {

                }else
                {
                    pantalla.setText(pantalla.getText()+".");
                    inicio=false;
                }
            }
        });
        //boton signo
        negativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sign=Double.parseDouble(pantalla.getText().toString());
                if(sign%1==0)
                {
                    int signInt=(int)sign;
                    pantalla.setText((signInt*(-1))+"");
                }else
                    pantalla.setText((sign*(-1))+"");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pantalla.getText().length() > 1) {
                    CharSequence cadenadel = pantalla.getText();
                    String cadenadel2 = cadenadel.toString();
                    String newcadenadel = cadenadel2.substring(0, (cadenadel2.length() - 1));
                    pantalla.setText(newcadenadel + "");
                } else {
                    pantalla.setText(0 + "");
                    inicio = true;
                }
            }
        });

        del.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                vibración =(Vibrator)getSystemService(VIBRATOR_SERVICE);
                vibración.vibrate(10);
                pantalla.setText("" + 0);
                inicio = true;
                return false;
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pantalla.getText().toString().trim().length() == 0){
                    pantalla.setText(""+0);
                    //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            //.setAction("Action", null).show();
                    //Toast.makeText(getApplicationContext(), "Textview: " + pantalla.getText().toString(),
                      //      Toast.LENGTH_SHORT).show();
                    inicio=false;
                    numero=pantalla.getText().toString();
                    Intent intent = new Intent();
                    //intent.setClass(keyboard.this, proceso.class);
                    startActivity(new Intent(keyboard.this, proceso.class));
                    //startActivity(new Intent(keyboard.this,proceso.class));
                    finish();
                }else {

                    numero=pantalla.getText().toString();
                    startActivity(new Intent(keyboard.this,proceso.class));
                    finish();
                    //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                           // .setAction("Action", null).show();
                    //Toast.makeText(getApplicationContext(), "Textview: " + pantalla.getText().toString(),
                      //      Toast.LENGTH_SHORT).show();
                }
            }
        });
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
        if (id == R.id.action_settings) {
            //startActivity(new Intent(this,SettingsActivity.class));
            Intent intent=new Intent(this,about.class);
            startActivity(intent);
            //finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == event.KEYCODE_BACK) {
            startActivity(new Intent(keyboard.this,proceso.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}
