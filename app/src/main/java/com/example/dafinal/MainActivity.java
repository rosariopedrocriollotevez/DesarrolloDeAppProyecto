package com.example.dafinal;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button botonRegistrarce;
    EditText textNombre,textApellido,textEdad,textUniversidad,textCorreo;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonRegistrarce=(Button)findViewById(R.id.btn_registrarse);
        textNombre=(EditText)findViewById(R.id.txt_nombre);
        textApellido=(EditText)findViewById(R.id.txt_apellido);
        textEdad=(EditText)findViewById(R.id.txt_edad);
        textUniversidad=(EditText)findViewById(R.id.txt_universidad);
        textCorreo=(EditText)findViewById(R.id.txt_correo);
        final  BD_Helper helper= new BD_Helper(this);
        botonRegistrarce.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=helper.getWritableDatabase();
                ContentValues values=new ContentValues();
                values.put(Estructura_BD.NOMBRE_COLUMNA1,textNombre.getText().toString());
                values.put(Estructura_BD.NOMBRE_COLUMNA2,textApellido.getText().toString());
                values.put(Estructura_BD.NOMBRE_COLUMNA3,textEdad.getText().toString());
                values.put(Estructura_BD.NOMBRE_COLUMNA4,textUniversidad.getText().toString());
                values.put(Estructura_BD.NOMBRE_COLUMNA5,textCorreo.getText().toString());


                Toast.makeText(getApplicationContext(),"Se guardo correctamente",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void guardar(View view){
            Intent i=new Intent(this,registro.class);
            startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menudeopciones, menu);
        return true;
    }
}