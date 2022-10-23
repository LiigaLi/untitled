package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {
        String vards = "Juris";

        House majaViens = new House(2,10,10,"Brivibas 1",3.2,10000,true);
        majaViens.printHouse();

        House majaDivi = new House(6,14,22,"Pērnavas 2",4.2,30000,false);

        majaDivi.printHouse();

        char[] mansVards = {'J' };
        int i = 1;
        for (char burts : mansVards) {
            System.out.println("CIKLS NR:" + i);
            System.out.println(burts);
            i++;
        }

        House[] majas = {majaViens, majaDivi};

        for (House maja : majas) {
            maja.printHouse();
        }

        Velosipeds ritenBraucejsViens = new Velosipeds();

        for (int j = 0; j <10; j++) {
            new Velosipeds();
        }

        Velosipeds ritenBraucejsDivi = new Velosipeds();
        Velosipeds ritenisX = new Velosipeds("ZZK",21,100);

        ritenBraucejsViens.atrums = 40;
        ritenBraucejsDivi.atrums = 30;


        ritenBraucejsViens.printAtrums();
        ritenBraucejsDivi.printAtrums();

        Velosipeds ritenBraucejsTris = new Velosipeds();

        ritenBraucejsTris.zimols = "ZZK";
        System.out.println(ritenBraucejsTris.zimols);
        ritenBraucejsTris.printAtrums();

        ritenBraucejsTris.paatrinajums(10);
        ritenBraucejsTris.paatrinajums(30);
        ritenBraucejsTris.paatrinajums(20);
        ritenBraucejsTris.paatrinajums(5);

        ritenBraucejsTris.printAtrums();
        System.out.println("Priekšā izskrien kaķis");

        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.printAtrums();

        Rinkis rinkisViens = new Rinkis(5);
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.rekinatLinijasGarumu());

        Rinkis rinkisDivi = new Rinkis(10);
        System.out.println(rinkisDivi.rekinatLaukumu());
        System.out.println(rinkisDivi.rekinatLinijasGarumu());

        System.out.println(rinkisDivi.rekinatLaukumu());
        System.out.println(rinkisDivi.rekinatLinijasGarumu());

    }
    
    
}
