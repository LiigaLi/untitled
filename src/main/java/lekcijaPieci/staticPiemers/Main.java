package lekcijaPieci.staticPiemers;

public class Main {
    public static void main(String[] args) {
        Cilveks persona1 = new Cilveks("Pēteris");
        persona1.printName();
        Cilveks persona2 = new Cilveks("Anna");

        persona1.printName();


        Cilveks.darbiniekaNumurs = 3;
        persona2.printName();

    }

    }



