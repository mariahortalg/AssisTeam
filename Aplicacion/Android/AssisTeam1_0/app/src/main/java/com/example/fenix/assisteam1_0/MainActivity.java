package com.example.fenix.assisteam1_0;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView ma_image;
    Button ma_boton, ma_boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ma_image = (ImageView) findViewById(R.id.idMainActivityImageView);

        ma_boton = (Button) findViewById(R.id.idMainActivityButton);
        ma_boton1 = (Button) findViewById(R.id.idMainActivityButton1);

        ma_boton.setOnClickListener(this);
        ma_boton1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.idMainActivityButton:

                Intent ma_intent = new Intent(MainActivity.this, Registro.class);
                startActivity(ma_intent);
                break;

            case R.id.idMainActivityButton1:

                Intent ma_intent1 = new Intent(MainActivity.this, Inicio.class);
                startActivity(ma_intent1);
                break;
        }
    }
}
