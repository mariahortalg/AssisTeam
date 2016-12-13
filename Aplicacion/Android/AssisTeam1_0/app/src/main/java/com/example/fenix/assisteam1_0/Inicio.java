package com.example.fenix.assisteam1_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inicio extends AppCompatActivity implements View.OnClickListener{

    TextView i_textView0,i_textView1, i_textView2;
    EditText i_editText1, i_editText2;
    Button i_boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        i_textView0 = (TextView) findViewById(R.id.idInicioTextView0);
        i_textView1 = (TextView) findViewById(R.id.idInicioTextView1);
        i_textView2 = (TextView) findViewById(R.id.idInicioTextView2);

        i_editText1 = (EditText) findViewById(R.id.idInicioEditText1);
        i_editText2 = (EditText) findViewById(R.id.idInicioEditText2);

        i_boton = (Button) findViewById(R.id.idInicioButton);
        i_boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.idInicioButton:

                Intent r_intent = new Intent(Inicio.this, Home.class);
                startActivity(r_intent);
                break;
        }

    }
}
