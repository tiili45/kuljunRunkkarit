package com.example.appi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView kaupunkiLista; // näkymä näyttää listan kaikista kaupungeista, missä palvelu toimii

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kirjautuminen);
    }

    /**
     * @param view kirjaudu napin toiminnot
     */
    public void painaKirjaudu(View view) {
        setContentView(R.layout.paaikkuna);
        kaupunkiLista = findViewById(R.id.kaupunkiLista);
        ArrayAdapter<String> kaupunkiadapteri = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Kaupungit.getKaupungit());
        kaupunkiLista.setAdapter(kaupunkiadapteri);
        kaupunkiLista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String otsikko = parent.getItemAtPosition(position).toString();
        setContentView(R.layout.keikat);
        TextView otsikkokaupunki = (TextView) findViewById(R.id.textView2);
        otsikkokaupunki.setText(otsikko);

    }

    public void painaGPS(View view) {
        setContentView(R.layout.gps);

    }




}