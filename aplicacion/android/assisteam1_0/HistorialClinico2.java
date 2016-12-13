package com.example.fenix.assisteam1_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistorialClinico2 extends AppCompatActivity implements View.OnClickListener{

    Button h2_boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_clinico2);

        h2_boton = (Button) findViewById(R.id.idHistorial2Button);
        h2_boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.idHistorial2Button:

                Intent h_intent = new Intent(HistorialClinico2.this, HistorialClinico3.class);
                startActivity(h_intent);
                break;
        }
    }
}
