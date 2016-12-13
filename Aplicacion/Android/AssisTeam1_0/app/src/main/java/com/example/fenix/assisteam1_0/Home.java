package com.example.fenix.assisteam1_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener{

    Button ho_boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ho_boton = (Button) findViewById(R.id.idHomeButton);
        ho_boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.idHomeButton:

                Intent ma_intent = new Intent(Home.this, Servicios.class);
                startActivity(ma_intent);
                break;

        }
    }
}
