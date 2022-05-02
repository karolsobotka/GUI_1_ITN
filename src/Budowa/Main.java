package Budowa;

import Budowa.Exceptions.NieunikalnyPeselException;
import Budowa.Pracownicy.*;

public class Main {
    public static void main(String[] args) throws NieunikalnyPeselException {
        Kopacz k = new Kopacz("Adam", "Nowak",1, 28636262, 88.5 );
        for (Osoba o : Osoba.getListaOsob()) {
            System.out.println(o);
        }
        Architekt a = new Architekt("Ziom", "Ziomalski", 13, 1232123, "specjalnosc", 123.2);
        for (Osoba o : Osoba.getListaOsob()) {
            System.out.println(o);
        }
        Brygadzista a2 = new Brygadzista("Ziom", "Ziomalski", 14, 1232123, 123, "123", 12);

        for (Osoba o : Osoba.getListaOsob()) {
            System.out.println(o);
        }
        System.out.println("-------------------------------");
        for (Osoba o : Osoba.getListaOsob()) {
            System.out.println(o);
        }

    }
}
