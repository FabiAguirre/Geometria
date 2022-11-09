package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Circulo extends AppCompatActivity {

    EditText radio, pi;
    TextView resultadoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        radio = (EditText) findViewById(R.id.numRadioCirc);
        pi = (EditText) findViewById(R.id.numPiCirc);
        resultadoC = (TextView) findViewById(R.id.resultCirculo);

    }

    public void onClick(View view)
    {
        double num1, num2, r;
        num1=Double.parseDouble(radio.getText().toString());
        num2=Double.parseDouble(pi.getText().toString());

        r=(num1*num1)*num2;

        resultadoC.setText(r+" cm2");
    }
}
