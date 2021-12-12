package com.example.appi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView kaupunkiLista;

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
        ArrayList<String> kaupungit = new ArrayList<String>();
        kaupungit.add("Jyväskylä");
        kaupungit.add("Tampere");
        kaupungit.add("Helsinki");
        kaupungit.add("Jyväskylä");
        kaupungit.add("Tampere");
        kaupungit.add("Helsinki");
        kaupungit.add("Jyväskylä");
        kaupungit.add("Tampere");
        kaupungit.add("Helsinki");
        ArrayAdapter<String> kaupunkiadapteri = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kaupungit);
        kaupunkiLista.setAdapter(kaupunkiadapteri);
    }
}