package Budowa.Exceptions;

public class ZaDuzoPracownikowWBrygadzieException extends Exception {

    public ZaDuzoPracownikowWBrygadzieException(){
        super("Za duzo pracowników w brygadzie i nie mozna dodać wiecej");
    }

}
