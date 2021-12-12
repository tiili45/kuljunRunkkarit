package com.example.appi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView kaupunkiLista; // näkymä näyttää listan kaikista kaupungeista, missä palvelu toimii
    ListView keikkaLista; //näkymä ilmoitetuista keikoista
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText keikannimi, lahtokaupunki, kohdekaupunki, hinta;
    private Button tallenna, peruuta;

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
        ArrayList<String> kaupungit = new ArrayList<>(); // lista paikoista, jossa toimitukset pyörii
        kaupungit.add("Jyväskylä");
        kaupungit.add("Tampere");
        kaupungit.add("Helsinki");
        kaupungit.add("Varkaus");
        kaupungit.add("Leppävirta");
        kaupungit.add("Hyvinkää");
        kaupungit.add("Seinäjoki");
        kaupungit.add("Pieksämäki");
        kaupungit.add("Kanamäki");
        ArrayAdapter<String> kaupunkiadapteri = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kaupungit);
        kaupunkiLista.setAdapter(kaupunkiadapteri);
        kaupunkiLista.setOnItemClickListener(this);

    }

    public void painaGPS(View view) {
        setContentView(R.layout.gps);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String otsikko = parent.getItemAtPosition(position).toString();
        setContentView(R.layout.keikat);
        TextView otsikkokaupunki = (TextView) findViewById(R.id.textView2);
        otsikkokaupunki.setText(otsikko);
        keikkaLista = findViewById(R.id.keikkaLista);
        ArrayList<String> keikat = new ArrayList<>(); // lista paikoista, jossa toimitukset pyörii
        keikat.add("Homma ois");
        ArrayAdapter<String> keikkaadapteri = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, keikat);
        keikkaLista.setAdapter(keikkaadapteri);

        }

    public void onBackPressed(){

        setContentView(R.layout.kirjautuminen);
    }

    public void luoKeikka(View view) {
        dialogBuilder = new AlertDialog.Builder(this);
        final View luoKeikkaNakyma = getLayoutInflater().inflate(R.layout.luokeikka, null);

        keikannimi = (EditText) luoKeikkaNakyma.findViewById(R.id.keikanNimi);
        lahtokaupunki = (EditText) luoKeikkaNakyma.findViewById(R.id.lahtoKaupunki);
        kohdekaupunki = (EditText) luoKeikkaNakyma.findViewById(R.id.kohdeKaupunki);
        hinta = (EditText) luoKeikkaNakyma.findViewById(R.id.hinta);

        tallenna = (Button) luoKeikkaNakyma.findViewById(R.id.button3);
        peruuta = (Button) luoKeikkaNakyma.findViewById(R.id.button4);

        dialogBuilder.setView(luoKeikkaNakyma);
        dialog = dialogBuilder.create();
        dialog.show();

    }

    }



