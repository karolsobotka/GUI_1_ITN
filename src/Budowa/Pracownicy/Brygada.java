package Budowa.Pracownicy;

import Budowa.Exceptions.ZaDuzoPracownikowWBrygadzieException;

import java.util.ArrayList;

public class Brygada {
    private  Brygadzista brygadzista;
    private  ArrayList<Osoba> pracownicy;
    private  int maksymalnaIloscPracownikow;
    public  int iloscMachniecLopataBrygady;

    private static ArrayList<Brygada> listaBrygad = new ArrayList<>();

    public Brygada(Brygadzista brygadzista, ArrayList<Osoba> pracownicy, int maksymalnaIloscPracownikow) {
        this.brygadzista = brygadzista;
        this.pracownicy = pracownicy;
        this.maksymalnaIloscPracownikow = maksymalnaIloscPracownikow;
        listaBrygad.add(this);
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
    public void dodajPracownika(Osoba o) throws ZaDuzoPracownikowWBrygadzieException {
        if(czyPelnaBrygada()){
            throw new ZaDuzoPracownikowWBrygadzieException();
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
    public void setBrygadzista(Brygadzista brygadzista)  {
        this.brygadzista = brygadzista;

    }
    public Brygadzista getBrygadzista() {
        return brygadzista;
    }

    public  ArrayList<Osoba> getPracownicy() {
        return pracownicy;
    }

    public static ArrayList<Brygada> getListaBrygad() {
        return listaBrygad;
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
