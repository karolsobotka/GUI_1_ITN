package Budowa;

import Budowa.Exceptions.NieunikalnyPeselException;
import Budowa.Pracownicy.*;

public class Main {
    public static void main(String[] args) throws NieunikalnyPeselException {


        Kopacz k = new Kopacz("Adam", "Nowak",12334, 28636262, 88.5 );
        Kopacz k1 = new Kopacz("Jan", "Kwas",116334, 28636262, 88.5 );
        Kopacz k2 = new Kopacz("Franciszek", "Ramen",1321, 28636262, 88.5 );
        Kopacz k3 = new Kopacz("Kacper", "Ciupa",156743, 28636262, 88.5 );

        Architekt a = new Architekt("Ziom", "Ziomalski", 13, 1232123, "specjalnosc", 123.2);

        Brygadzista a2 = new Brygadzista("Ziom", "Ziomalski", 14, 1232123, 123, "123", 12);

        System.out.println("-------------------------------");
        for (Osoba o : Osoba.getListaOsob()) {
            System.out.println(o);
            System.out.println("-------------------------------");

        }
        k.kop();
        k1.kop();
        k2.kop();
        k3.kop();



    }
}
