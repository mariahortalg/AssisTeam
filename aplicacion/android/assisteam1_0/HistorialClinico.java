package com.example.fenix.assisteam1_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistorialClinico extends AppCompatActivity implements View.OnClickListener{

    Button h_boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_clinico);

        h_boton = (Button) findViewById(R.id.idHistorialButton);
        h_boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.idHistorialButton:

                Intent h_intent = new Intent(HistorialClinico.this, HistorialClinico2.class);
                startActivity(h_intent);
                break;
        }
    }
}
