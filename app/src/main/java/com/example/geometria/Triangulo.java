package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangulo extends AppCompatActivity {

    EditText baseT, alturaT;
    TextView resultadoT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        baseT = (EditText) findViewById(R.id.numBaseTri);
        alturaT = (EditText) findViewById(R.id.numAltTri);
        resultadoT = (TextView) findViewById(R.id.resultTriangulo);
    }

    public void onClick(View view)
    {
        double num1, num2, r;
        num1=Double.parseDouble(baseT.getText().toString());
        num2=Double.parseDouble(alturaT.getText().toString());

        r=(num1*num2)/2;

        resultadoT.setText(r+" cm2");
    }

}