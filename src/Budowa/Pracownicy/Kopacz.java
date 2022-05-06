package Budowa.Pracownicy;

import Budowa.Exceptions.NieunikalnyPeselException;
import Budowa.Exceptions.ZaDuzoPracownikowWBrygadzieException;
import Budowa.Exceptions.ZlamanaLopataException;
import Budowa.IPracownik;

public class Kopacz extends Osoba implements IPracownik {

    private int iloscMachniecLopata;
    private Thread kopanieThread;
    private boolean czyZdolnyDoPracy = true;

    public Kopacz(String imie, String nazwisko, int pesel, int nrTelefonu, double waga) throws NieunikalnyPeselException {
        super(imie, nazwisko, pesel, nrTelefonu, waga);
    }

    // LAMBDA
    Runnable runnable = () -> {
        Brygada brygadKopacza = findBrygadaKopacza();

        while(czyZdolnyDoPracy){

                for(int i = 0; i<15; i++){
                    if (Math.random() > 0.99) {
                        try {
                            czyZdolnyDoPracy = false;
                            throw new ZlamanaLopataException("Lopata byla wadliwa i zlamala sie niespodziewanie w trakcie uzytkownia");
                        } catch (ZlamanaLopataException e) {
                            System.out.println(e.getMessage());
                        }
                    }else {
                        iloscMachniecLopata = (int) (Math.random() * 10) +5;
                        powiedzIleRazyKopales();
                        brygadKopacza.iloscMachniecLopataBrygady++;
                        System.out.println("Brygada kopala juz tyle razy: "+ brygadKopacza.iloscMachniecLopataBrygady);
                        try {
                            kopanieThread.sleep( (int) (Math.random() * 5000) );
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }

                }
                czyZdolnyDoPracy = false;
            try {
                throw new ZlamanaLopataException("Lopata zuzyla sie i pekla");
            } catch (ZlamanaLopataException e) {
                e.printStackTrace();
            }
        }
    };

    public synchronized void kop(){
        kopanieThread = new Thread(runnable);
        kopanieThread.start();


    }

    private Brygada findBrygadaKopacza(){
        Brygada brygadaKopacza;
        for (Brygada brygada : Brygada.getListaBrygad()) {
             if(brygada.getPracownicy().contains(this)){
                 return brygada;
             }
        }
            return null;
    }

    public void przestanKopac(){
        this.czyZdolnyDoPracy = false;
    }

    @Override
    public int pobierzPensje() {
        return 4500;
    }

    @Override
    public void powiedzIleRazyKopales() {
        System.out.println("Czesc, ja: "+this.getImie()+" "+this.getNazwisko()+" kopalem "+iloscMachniecLopata+ " razy.");
    }

    @Override
    public void powiedzCoRobisz() {
        System.out.println("A kopie dolki i pale szlugi");
    }

    @Override
    public void zakonczDzialanie() {
        kopanieThread.interrupt();
    }

    @Override
    public void dodajSieDoBrygady(Brygada brygada) throws ZaDuzoPracownikowWBrygadzieException {
        brygada.dodajPracownika(this);
    }
    @Override
    public String toString() {
        return super.toString()+"Kopacz{" +
                "iloscMachniecLopata=" + iloscMachniecLopata +
                ", czyZdolnyDoPracy=" + czyZdolnyDoPracy +
                '}';
    }
}
