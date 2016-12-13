package com.example.fenix.assisteam1_0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity implements View.OnClickListener{

    TextView r_textView1, r_textView2, r_textView3;
    EditText r_editText1, r_editText2, r_editText3;
    Button r_boton, r_boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        r_textView1 = (TextView) findViewById(R.id.idRegistroTextView1);
        r_textView2 = (TextView) findViewById(R.id.idRegistroEditText2);
        r_textView3 = (TextView) findViewById(R.id.idRegistroTextView3);

        r_editText1 = (EditText) findViewById(R.id.idRegistroEditText1);
        r_editText2 = (EditText) findViewById(R.id.idRegistroEditText2);
        r_editText3 = (EditText) findViewById(R.id.idRegistroEditText3);

        r_boton = (Button) findViewById(R.id.idRegistroButton);
        r_boton1 = (Button) findViewById(R.id.idRegistroButton1);

        r_boton.setOnClickListener(this);
        r_boton1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.idRegistroButton:

                Intent r_intent = new Intent(Registro.this, Inicio.class);
                startActivity(r_intent);
                break;

            case R.id.idRegistroButton1:

                Intent r_intent1 = new Intent(Registro.this, HistorialClinico.class);
                startActivity(r_intent1);
                break;
        }
    }
}
