package Budowa.Pracownicy;

import Budowa.IPracownik;

public class Architekt extends Osoba implements IPracownik {

    private String specjalizacja;
    public Architekt(String imie, String nazwisko, int pesel, int nrTelefonu, String specjalizacja) {
        super(imie, nazwisko, pesel, nrTelefonu);
        this.specjalizacja = specjalizacja;

    }

    @Override
    public int pobierzPensje() {
        return 0;
    }

    @Override
    public void powiedzIleRazyKopales() {

    }

    @Override
    public void powiedzCoRobisz() {

    }

    @Override
    public void zakonczDzialanie() {

    }

    @Override
    public void dodajSieDoBrygady() {

    }
}
