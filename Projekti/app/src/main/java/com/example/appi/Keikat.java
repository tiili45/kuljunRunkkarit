package com.example.appi;

import java.util.ArrayList;
import java.util.Collection;

public class Keikat {

    Keikat keikat = new Keikat();
    static ArrayList<Keikka> keikkalista = new ArrayList<Keikka>();

    public Keikat() {
    }


    public static void lisaaKeikka(Keikka uusikeikka) {
        keikkalista.add(uusikeikka);
    }

}
