package com.example.fenix.assisteam1_0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Servicios extends AppCompatActivity {

    ListView s_listView;

    String[] valores = new String[] {"Compra", "Aseo", "Monitorización", "Trámites", "Seguimiento",
                                     "Limpieza", "Recordatorio", "Aseo", "Información"};
    String[] v2 = new String[] {};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        s_listView = (ListView) findViewById(R.id.idServicioslistView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);
        s_listView.setAdapter(adapter);

    }
}
