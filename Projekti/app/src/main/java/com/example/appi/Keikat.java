package com.example.appi;

import java.util.ArrayList;
import java.util.Collection;

public class Keikat extends Keikka {

    ArrayList<Keikka> keikat = new ArrayList<Keikka>();

    public Keikat() {

    }

    public void lisaaKeikka(Keikka uusikeikka) {
        keikat.add(uusikeikka);
    }
}
