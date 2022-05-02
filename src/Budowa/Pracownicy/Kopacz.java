package Budowa.Pracownicy;

import Budowa.Exceptions.NieunikalnyPeselException;
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
                        System.out.println("Kopacz "+this.getImie()+" "+this.getNazwisko()+" machnal lopata "+iloscMachniecLopata+" razy");
                        Brygada.iloscMachniecLopataBrygady++;
                        System.out.println("Brygada kopala juz tyle razy: "+Brygada.iloscMachniecLopataBrygady);
                        try {
                            kopanieThread.sleep( (int) (Math.random() * 1000) );
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

    public void przestanKopac(){
        czyZdolnyDoPracy = false;
    }

    @Override
    public int pobierzPensje() {
        return 4500;
    }

    @Override
    public void powiedzIleRazyKopales() {
        System.out.println("Czesc, kopalem "+iloscMachniecLopata+ " razy.");
    }

    @Override
    public void powiedzCoRobisz() {
        System.out.println("A kopie dolki i pale szlugi");
    }

    @Override
    public void zakonczDzialanie() {

    }

    @Override
    public void dodajSieDoBrygady(Brygada brygada) {
        brygada.dodajPracownika(this);
    }

    public int getIloscMachniecLopata() {
        return iloscMachniecLopata;
    }

    public void setIloscMachniecLopata(int iloscMachniecLopata) {
        this.iloscMachniecLopata = iloscMachniecLopata;
    }

    public boolean isCzyZdolnyDoPracy() {
        return czyZdolnyDoPracy;
    }

    public void setCzyZdolnyDoPracy(boolean czyZdolnyDoPracy) {
        this.czyZdolnyDoPracy = czyZdolnyDoPracy;
    }


    @Override
    public String toString() {
        return super.toString()+"Kopacz{" +
                "iloscMachniecLopata=" + iloscMachniecLopata +
                ", czyZdolnyDoPracy=" + czyZdolnyDoPracy +
                '}';
    }
}
