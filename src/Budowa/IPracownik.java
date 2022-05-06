package Budowa;

import Budowa.Exceptions.ZaDuzoPracownikowWBrygadzieException;
import Budowa.Pracownicy.Brygada;
import jdk.jshell.spi.ExecutionControl;

public interface IPracownik {
    int pobierzPensje();
    void powiedzIleRazyKopales();
    void powiedzCoRobisz();
    void zakonczDzialanie() throws ExecutionControl.NotImplementedException; //konczy dzialanie watku
    void dodajSieDoBrygady(Brygada brygada) throws ZaDuzoPracownikowWBrygadzieException;
}
