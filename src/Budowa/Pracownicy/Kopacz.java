package Budowa.Pracownicy;

import Budowa.Exceptions.NieunikalnyPeselException;
import Budowa.IPracownik;
public class Kopacz extends Osoba implements IPracownik {

    private int iloscMachniecLopata;
    private boolean czyZdolnyDoPracy = true;
    public Kopacz(String imie, String nazwisko, int pesel, int nrTelefonu, double waga) throws NieunikalnyPeselException {
        super(imie, nazwisko, pesel, nrTelefonu, waga);
    }

    public void kop(){

    }
    public void przestanKopac(){
        this.czyZdolnyDoPracy =false;
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

    public int getIloscMachniecLopata() {
        return iloscMachniecLopata;
    }

    public void setIloscMachniecLopata(int iloscMachniecLopata) {
        this.iloscMachniecLopata = iloscMachniecLopata;
    }

    public boolean isCzyZdolnyDoPracy() {
        return czyZdolnyDoPracy;
    }

    public void setCzyZdolnyDoPracy(boolean czyZdolnyDoPracy) {
        this.czyZdolnyDoPracy = czyZdolnyDoPracy;
    }


}
