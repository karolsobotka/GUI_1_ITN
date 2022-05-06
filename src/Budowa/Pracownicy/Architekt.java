package Budowa.Pracownicy;

import Budowa.Exceptions.NieunikalnyPeselException;
import Budowa.Exceptions.ZaDuzoPracownikowWBrygadzieException;
import Budowa.IPracownik;
import jdk.jshell.spi.ExecutionControl;


public class Architekt extends Osoba implements IPracownik {

    private String specjalizacja;
    public Architekt(String imie, String nazwisko, int pesel, int nrTelefonu, String specjalizacja, double waga) throws NieunikalnyPeselException {
        super(imie, nazwisko, pesel, nrTelefonu, waga);
        this.specjalizacja = specjalizacja;


    }

    @Override
    public int pobierzPensje() {
        return 6000;
    }

    @Override
    public void powiedzIleRazyKopales() {
        System.out.println("jestem ARCHITEKTEM.... ONI NIE KOPIA");
    }

    @Override
    public void powiedzCoRobisz() {
        System.out.println("Rysuje rysunki i plany budowy.");
    }

    @Override
    public void zakonczDzialanie() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }

    @Override
    public void dodajSieDoBrygady(Brygada brygada) throws ZaDuzoPracownikowWBrygadzieException {
        brygada.dodajPracownika(this);
    }

    @Override
    public String toString() {
        return super.toString()+" Architekt{" +
                "specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}
