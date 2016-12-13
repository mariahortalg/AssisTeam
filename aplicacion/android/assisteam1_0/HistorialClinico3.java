package com.example.fenix.assisteam1_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistorialClinico3 extends AppCompatActivity implements View.OnClickListener{

    Button h3_boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_clinico3);

        h3_boton = (Button) findViewById(R.id.idHistorialButton);
        h3_boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.idHistorialButton:

                Intent h_intent = new Intent(HistorialClinico3.this, Home.class);
                startActivity(h_intent);
                break;
        }
    }
}
