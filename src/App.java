public class App {
    public static void main(String[] args) {

        // Una variabile in Java si dichiara ed inizializza cosi
        int myInt = 42;
        double myDouble = 42.0;
        Double classeWrapper = 42.0; // classe wrapper, ignora per il momento
        boolean myBoolean = false;

        String myString = "My String";

        System.out.println("Hello, World!");
        System.out.println("Il valore di myInt è:" + myInt);
        System.out.println("Il valore di myInt è:" + myDouble);
        System.out.println("Il valore di myInt è:" + classeWrapper);
        System.out.println("Il valore di myInt è:" + myBoolean);
        System.out.println("Il valore di myInt è:" + myString);

        for (int i = 0; i < 10; i++) {
            System.out.println("Stampa i: " + (i + 1));
        }

        int j = 0;
        while (j < 10) {
            System.out.println("Stampa j: " + j);
            j++;
        }

    }
}
