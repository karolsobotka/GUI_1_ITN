package Budowa.Pracownicy;

import java.util.ArrayList;

public class Brygada {
    private static Brygadzista brygadzista;
    private static ArrayList<Osoba> pracownicy;
    private static int maksymalnaIloscPracownikow;
    public static int iloscMachniecLopataBrygady;


    public Brygada(Brygadzista brygadzista, ArrayList<Osoba> pracownicy, int maksymalnaIloscPracownikow) {
        this.brygadzista = brygadzista;
        this.pracownicy = pracownicy;
        this.maksymalnaIloscPracownikow = maksymalnaIloscPracownikow;
    }

    public int ileArchitektow(){
        int i= 0;
        for (Osoba o : pracownicy) {
            if(o instanceof Architekt){
                i++;
            }
        }
        return i;

    }

    public boolean czyPelnaBrygada(){
        if(this.maksymalnaIloscPracownikow == this.pracownicy.size())
            return true;
        else
            return false;
    }
    public void dodajPracownika(Osoba o){
        if(czyPelnaBrygada()){
            System.out.println("Za duzo pracownikow, nie mozna dodac");
        }
        else
            pracownicy.add(o);
    }

    public void dodajPracownikow(ArrayList<Osoba> listaPracownikow){
        if(czyPelnaBrygada()){
            System.out.println("Za duzo pracownikow, nie mozna dodac");
        }
        else if(( this.pracownicy.size()+ listaPracownikow.size()) <= maksymalnaIloscPracownikow){
            for (Osoba o : listaPracownikow){
                this.pracownicy.add(o);
            }
        }
    }

    public void setBrygadzista(Brygadzista brygadzista) {
        this.brygadzista = brygadzista;
    }

    public Brygadzista getBrygadzista() {
        return brygadzista;
    }

    public static ArrayList<Osoba> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(ArrayList<Osoba> pracownicy) {
        this.pracownicy = pracownicy;
    }

    public static int getMaksymalnaIloscPracownikow() {
        return maksymalnaIloscPracownikow;
    }

    public void setMaksymalnaIloscPracownikow(int maksymalnaIloscPracownikow) {
        this.maksymalnaIloscPracownikow = maksymalnaIloscPracownikow;
    }

    public static int getIloscMachniecLopataBrygady() {
        return iloscMachniecLopataBrygady;
    }

    public void setIloscMachniecLopataBrygady(int iloscMachniecLopataBrygady) {
        this.iloscMachniecLopataBrygady = iloscMachniecLopataBrygady;
    }

    @Override
    public String toString() {
        return "Brygada{" +
                "brygadzista=" + brygadzista +
                ", pracownicy=" + pracownicy +
                ", maksymalnaIloscPracownikow=" + maksymalnaIloscPracownikow +
                ", iloscMachniecLopataBrygady=" + iloscMachniecLopataBrygady +
                '}';
    }
}
