package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button triangulo, circulo, rectangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        triangulo = (Button) findViewById(R.id.botonTriangulo);
        circulo = (Button) findViewById(R.id.botonCirculo);
        rectangulo = (Button) findViewById(R.id.botonCirculo);
    }

    public void goTriangulo(View view)
    {
        Intent goTriangulo = new Intent(this, Triangulo.class);
        startActivity(goTriangulo);
    }

    public void goCirculo(View view)
    {
        Intent goCirculo = new Intent(this, Circulo.class);
        startActivity(goCirculo);
    }

    public void goRectangulo(View view)
    {
        Intent goRectangulo = new Intent(this, Rectangulo.class);
        startActivity(goRectangulo);
    }
}