package Budowa.Pracownicy;

import java.util.ArrayList;

public abstract class Osoba {
    private String imie;
    private String nazwisko;
    private int pesel;
    private int nrTelefonu;

    private static ArrayList<Osoba> listaOsob = new ArrayList<>();

    public Osoba(String imie, String nazwisko, int pesel, int nrTelefonu){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTelefonu = nrTelefonu;

       // dorobic walidacje peselu
        this.pesel = pesel;

        listaOsob.add(this);

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

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel=" + pesel +
                ", nrTelefonu=" + nrTelefonu +
                '}';
    }
}
