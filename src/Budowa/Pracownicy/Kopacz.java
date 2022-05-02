package Budowa.Pracownicy;

import Budowa.IPracownik;

public class Kopacz extends Osoba implements IPracownik {

    private int iloscMachniecLopata;
    private boolean czyZdolnyDoPracy = true;

    public Kopacz(String imie, String nazwisko, int pesel, int nrTelefonu) {
        super(imie, nazwisko, pesel, nrTelefonu);
    }

    public void kop(){

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Kopacz: "+this+" machnął łopata");
            }
        }).start();
    }
    public void przestanKopac(){
        //to implement
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
