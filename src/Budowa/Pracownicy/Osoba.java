package Budowa.Pracownicy;


import Budowa.Exceptions.NieunikalnyPeselException;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Osoba implements Comparable<Osoba>{
    private String imie;
    private String nazwisko;
    private int pesel;
    private int nrTelefonu;
    private double waga;

    private static ArrayList<Osoba> listaOsob = new ArrayList<>();

    public Osoba(String imie, String nazwisko, int pesel, int nrTelefonu, double waga) throws NieunikalnyPeselException {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTelefonu = nrTelefonu;
        this.waga = waga;
        this.pesel = pesel;
        listaOsob.add(this);

        for (Osoba o: listaOsob) {

           if(this == o){
               System.out.println("sprawdzilem ta sama osobe");
           }
           else if(this.compareTo(o) ==1 ){
             throw new NieunikalnyPeselException();
            }
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(int nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public static ArrayList<Osoba> getListaOsob() {
        return listaOsob;
    }

    public static void setListaOsob(ArrayList<Osoba> listaOsob) {
        Osoba.listaOsob = listaOsob;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel=" + pesel +
                ", nrTelefonu=" + nrTelefonu +
                " zawod: ";
    }

    // COMPRARABLE -> COMPARETO
    @Override
    public int compareTo(Osoba o) {
        if(this.getPesel() == o.getPesel()){
            return 1;
        }
        else
            return 0;
    }
}
