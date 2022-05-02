package Budowa.Pracownicy;


import Budowa.Exceptions.BrygadaNiezdolnaDoPracyException;
import Budowa.Exceptions.NieunikalnyPeselException;

import java.util.ArrayList;

public class Brygadzista extends Kopacz {

    private String pseudonim;
    private int dlugoscZmiany;
    private Brygada brygada;
    private Thread sprawdzenieThread;


    public Brygadzista(String imie, String nazwisko, int pesel, int nrTelefonu, double waga, String pseudonim) throws NieunikalnyPeselException {
        super(imie, nazwisko, pesel, nrTelefonu, waga);
        this.pseudonim = pseudonim;

    }
    Runnable runnable = () -> {

        ArrayList<Kopacz> kopaczList = new ArrayList<>();

        for (Osoba o : Brygada.getPracownicy()) {
            if (o instanceof Kopacz) {
                kopaczList.add((Kopacz) o);
            }
        }

//        while (true) {
//            for (Kopacz k : kopaczList) {
//                if (k.isCzyZdolnyDoPracy()) {
//                    System.out.println("pracuja :D");
//                }
//                else {
//                    try {
//                        throw new BrygadaNiezdolnaDoPracyException();
//                    } catch (BrygadaNiezdolnaDoPracyException e) {
//                        System.out.println(e.getMessage());
//                    }
//                }
//            }
//        }
    };

    public void sprawdzCzyBrygadaNiezdolnaDoPracy(){
        sprawdzenieThread = new Thread(runnable);
        sprawdzenieThread.start();

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
