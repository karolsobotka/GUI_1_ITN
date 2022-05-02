package Budowa;

import Budowa.Pracownicy.Brygada;

public interface IPracownik {
    int pobierzPensje();
    void powiedzIleRazyKopales();
    void powiedzCoRobisz();
    void zakonczDzialanie(); //konczy dzialanie watku
    void dodajSieDoBrygady(Brygada brygada);
}
