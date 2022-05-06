package Budowa;

import Budowa.Exceptions.NieunikalnyPeselException;
import Budowa.Exceptions.ZaDuzoPracownikowWBrygadzieException;
import Budowa.Pracownicy.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NieunikalnyPeselException, ZaDuzoPracownikowWBrygadzieException {


        Kopacz k = new Kopacz("Adam", "Nowak",12334, 28636262, 88.5 );
        Kopacz k1 = new Kopacz("Jan", "Kwas",116334, 28636262, 88.5 );
        Kopacz k2 = new Kopacz("Franciszek", "Ramen",1321, 28636262, 88.5 );
        Kopacz k3 = new Kopacz("Kacper", "Ciupa",156743, 28636262, 88.5 );

        Architekt architekt1 = new Architekt("Ziom", "Ziomalski", 13, 1232123, "specjalnosc", 123.2);

        Brygadzista brygadzista1 = new Brygadzista("Ziom", "Ziomalski", 14, 1232123, 123, "123", 10);

        ArrayList<Osoba> pracownicy = new ArrayList<>();
        pracownicy.add(k1);
        pracownicy.add(k2);


        Brygada brygada = new Brygada(null, pracownicy,10);


        brygada.dodajPracownika(architekt1);

        k.dodajSieDoBrygady(brygada);
        ArrayList<Osoba> pracownicy2 = new ArrayList<>();
        pracownicy2.add(k3);
        pracownicy2.add(brygadzista1);

        brygada.setBrygadzista(brygadzista1);

        System.out.println(brygada.getBrygadzista());
        brygada.dodajPracownikow(pracownicy2);

        System.out.println("Jest "+brygada.ileArchitektow()+" architektow.");
        System.out.println("BRYGADA PEŁNA? :"+brygada.czyPelnaBrygada());


        k.kop();
        k1.kop();
        k2.kop();
        k3.kop();


        k.powiedzIleRazyKopales();
        System.out.println("KOPACZ 1 zarabia: " +k.pobierzPensje());
        k.powiedzCoRobisz();

        brygadzista1.powiedzIleRazyKopales();
        System.out.println("Brygadzista zarabia: "+brygadzista1.pobierzPensje());
        brygadzista1.powiedzCoRobisz();

        k.zakonczDzialanie();



    }
}
