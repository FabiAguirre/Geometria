package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rectangulo extends AppCompatActivity {

    EditText baseR, alturaR;
    TextView resultadoR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        baseR = (EditText) findViewById(R.id.numBaseRec);
        alturaR = (EditText) findViewById(R.id.numAltRec);
        resultadoR = (TextView) findViewById(R.id.resultRec);
    }

    // Base de Datos!!!
    public void infoRectangulo(View view)
    {
        conexionBD guardarInfo = new conexionBD(this, "Rectangulo", null, 1);
        SQLiteDatabase conexionBD = guardarInfo.getWritableDatabase();

        String base = baseR.getText().toString();
        String altura = alturaR.getText().toString();
        String resultado = resultadoR.getText().toString();

        ContentValues paquete = new ContentValues();
        paquete.put("base", base);
        paquete.put("altura", altura);
        paquete.put("resultado", resultado);

        conexionBD.insert("saveRectangulo", null, paquete);
        conexionBD.close();

        Toast.makeText(this, "Guardado exitosamente", Toast.LENGTH_LONG).show();
    }

    // Boton para calcular!!!
    public void onClick(View view)
    {
        conexionBD guardarInfo = new conexionBD(this, "Rectangulo", null, 1);
        SQLiteDatabase conexionBD = guardarInfo.getWritableDatabase();

       // if(!baseR...)
       //  {
            // Cursor save = conexionBD.rawQuery("SELECT nombreProyecto, tipoFigura, baseRectangulo," +
            // "alturaRectangulo, areaRectangulo FROM saveRectangulo");
            //if ()
         //   {
         //         baseR.setText(save.getString(0));
         //         alturaR.setText(save.getString(1));
         //         resultadoR.setText(save.getString(2));
         //         conexionBD.close();
         // }
       //}
        //else
        {
            Toast.makeText(this, "Rellene todos los campos", Toast.LENGTH_LONG).show();
        }
        //Aquí está el ejercicio para sacar el área del rectángulo!!!
        double num1, num2, r;
        num1=Double.parseDouble(baseR.getText().toString());
        num2=Double.parseDouble(alturaR.getText().toString());

        r=num2*num1;

        resultadoR.setText(r+" cm2");

        //ASI ESTABA ANTES
        //public void onClick(View view)
        //{
        //    double num1, num2, r;
        //    num1=Double.parseDouble(baseR.getText().toString());
        //    num2=Double.parseDouble(alturaR.getText().toString());

        //    r=num2*num1;

        //    resultadoR.setText(r+" cm2");

    }

    //Boton para ir al Activity a guardar los datos!!!
    public void goGuardar(View view)
    {
        Intent goGuardar = new Intent(this, guardarRectangulo.class);
        startActivity(goGuardar);
    }
}