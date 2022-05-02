package Budowa.Exceptions;

public class ZlamanaLopataException extends Exception {
    public ZlamanaLopataException(String message){
        System.err.println(message);
    }

}
