package Budowa.Pracownicy;


import Budowa.Exceptions.NieunikalnyPeselException;

public class Brygadzista extends Kopacz {

    private String pseudonim;
    private int dlugoscZmiany;
    private Brygada brygada;


    public Brygadzista(String imie, String nazwisko, int pesel, int nrTelefonu, double waga, String pseudonim, int dlugoscZmiany) throws NieunikalnyPeselException {
        super(imie, nazwisko, pesel, nrTelefonu, waga);
        this.dlugoscZmiany = dlugoscZmiany;
        this.pseudonim = pseudonim;

    }

    public boolean sprawdzCzyBrygadaNiezdolnaDoPracy(Brygada brygada){
        //while(dlugoscZmiany!=thread.getCurrent.time)
        new Thread(new Runnable() {

            @Override
            public void run() {

            }
        }).start();

        return true;
    }

    @Override
    public int pobierzPensje() {
        return 6500;
    }

    @Override
    public void powiedzIleRazyKopales() {
        super.powiedzIleRazyKopales();
    }

    @Override
    public void powiedzCoRobisz() {
        System.out.println("pilnuje zeby sie nie lenili i kopie dolki");
    }

    @Override
    public void zakonczDzialanie() {
        super.zakonczDzialanie();
    }

    @Override
    public void dodajSieDoBrygady(Brygada brygada) {
        super.dodajSieDoBrygady(brygada);
    }

    @Override
    public String toString() {
        return super.toString()+" Brygadzista{" +
                "pseudonim='" + pseudonim + '\'' +
                ", dlugoscZmiany=" + dlugoscZmiany +
                ", brygada=" + brygada +
                '}';
    }
}
