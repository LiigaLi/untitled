package lekcijaPieci.staticPiemers;

public class Main {
    public static void main(String[] args) {
        Cilveks.printCount();
        Cilveks.printCount();
        Cilveks.printCount();
        Cilveks.printCount();
        Cilveks.printCount();
        Cilveks persona1 = new Cilveks("Pēteris");
        Cilveks.printCount();
        Cilveks.printCount();

        persona1.printName();
        Cilveks persona2 = new Cilveks("Anna");
        Cilveks.printCount();
        persona1.printName();
        persona2.printName();
        Cilveks persona3 = new Cilveks("Anna1");
        Cilveks persona4 = new Cilveks("Anna2");
        Cilveks persona5 = new Cilveks("Anna3");
        Cilveks persona6 = new Cilveks("Anna4");
        Cilveks persona7 = new Cilveks("Anna5");
        Cilveks.printCount();
    }

    }



