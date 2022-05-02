package Budowa.Pracownicy;



public class Brygadzista extends Kopacz implements Comparable {

    private String pseudonim;
    private int dlugoscZmiany;
    private Brygada brygada;

    public Brygadzista(String imie, String nazwisko, int pesel, int nrTelefonu, String pseudonim, int dlugoscZmiany, Brygada brygada) {
        super(imie, nazwisko, pesel, nrTelefonu);
        this.dlugoscZmiany = dlugoscZmiany;
        this.pseudonim = pseudonim;
        this.brygada = brygada;
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
    public int compareTo(Object o) {
        if(this.getPesel() == o.getPesel())

        return 0;
    }
}
