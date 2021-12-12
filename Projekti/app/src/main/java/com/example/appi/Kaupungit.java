package com.example.appi;

import java.util.ArrayList;

public class Kaupungit {

    ArrayList<String> kaupungit = new ArrayList<>(); /* lista paikoista, jossa toimitukset pyörii */

    public Kaupungit() {
        kaupungit.add("Jyväskylä");
        kaupungit.add("Tampere");
        kaupungit.add("Helsinki");
        kaupungit.add("Varkaus");
        kaupungit.add("Leppävirta");
        kaupungit.add("Hyvinkää");
        kaupungit.add("Seinäjoki");
        kaupungit.add("Pieksämäki");
        kaupungit.add("Kanamäki");
    }

    public void setKaupungit(ArrayList<String> kaupungit) {
        this.kaupungit = kaupungit;
    }

    public ArrayList<String> getKaupungit() {
        return kaupungit;
    }
}
