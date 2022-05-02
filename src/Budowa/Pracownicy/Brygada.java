package Budowa.Pracownicy;

import java.util.ArrayList;

public class Brygada {
    private Brygadzista brygadzista;
    private static ArrayList<Osoba> pracownicy = new ArrayList<>();
    private int maksymalnaIloscPracownikow;
    private int iloscMachniecLopataBrygady;

    public Brygada(Brygadzista brygadzista, ArrayList<Osoba> pracownicy, int maksymalnaIloscPracownikow, int iloscMachniecLopataBrygady) {
        this.brygadzista = brygadzista;
        this.pracownicy = pracownicy;
        this.maksymalnaIloscPracownikow = maksymalnaIloscPracownikow;
        this.iloscMachniecLopataBrygady = iloscMachniecLopataBrygady;
    }

    public int ileArchitektow(){
        return 0;
    }

    public boolean czyPelnaBrygada(){
        return  true;
    }
    public void dodajPracownika(){

    }
    public void dodajPracownikow(){

    }

    public void setBrygadzista(Brygadzista brygadzista) {
        this.brygadzista = brygadzista;
    }
}
