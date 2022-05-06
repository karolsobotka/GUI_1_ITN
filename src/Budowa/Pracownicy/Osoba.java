package Budowa.Pracownicy;


import Budowa.Exceptions.NieunikalnyPeselException;

import java.util.ArrayList;
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

    public String getNazwisko() {
        return nazwisko;
    }

    public int getPesel() {
        return pesel;
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
