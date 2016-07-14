package com.astudios.aristosstudios.convertidorunidades;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class about extends AppCompatActivity {
    private Typeface fuente;
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        texto=(TextView)findViewById(R.id.textView4);
        String direccion="fonts/Roboto-Thin.ttf";
        fuente= Typeface.createFromAsset(getAssets(), direccion);
        texto.setTypeface(fuente, Typeface.BOLD);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Llamamos al método enviarEmail
                enviarEmail();
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                  //      .setAction("Action", null).show();
            }
        });
    }

    private void enviarEmail(){
        //Instanciamos un Intent del tipo ACTION_SEND
        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        //Definimos la tipologia de datos del contenido dle Email en este caso text/html
        emailIntent.setType("text/html");
        // Indicamos con un Array de tipo String las direcciones de correo a las cuales
        //queremos enviar el texto
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"www.warcry@gmail.com"});//correo destino
        // Definimos un titulo para el Email
        emailIntent.putExtra(android.content.Intent.EXTRA_TITLE, R.string.app_name);//titulo
        // Definimos un Asunto para el Email
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, R.string.asunto);//asunto
        // Obtenemos la referencia al texto y lo pasamos al Email Intent
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, getString(R.string.my_text));
        try {
            //Enviamos el Correo iniciando una nueva Activity con el emailIntent.
            startActivity(Intent.createChooser(emailIntent, getResources().getString(R.string.enviar)));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(about.this, R.string.error, Toast.LENGTH_SHORT).show();
        }
    }
}
