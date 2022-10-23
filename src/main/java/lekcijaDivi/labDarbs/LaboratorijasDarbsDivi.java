package lekcijaDivi.labDarbs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LaboratorijasDarbsDivi {
    public static void main(String[] args) {
        //Salidzināšanas izteiksmes
        //Lielāks
        int x = 3;
        int y = 2;
        //šeit būs true
        System.out.println(x > y);
        y = 3;
        //šeit būs false
        System.out.println(x > y);
        //Mazāks
        x = 5;
        y = 3;
        System.out.println(x < y);
        y = 10;
        System.out.println(x < y);
        //vienāds
        System.out.println(x == y);
        System.out.println(5 == 5);

        String luksaforaKrasa = "green";
        System.out.println(luksaforaKrasa.equals("green"));
        System.out.println(luksaforaKrasa.equals("red"));

        //nav vienāds
        System.out.println(x != y);
        System.out.println(!luksaforaKrasa.equals("red"));

        //mazāks vienāds
        x = 5;
        y = 6;
        int z = 8;

        System.out.println(x <= y);

        int vecums = 18;
        System.out.println("Vai cilvēks var balsot(kļūdains variants)?" + (vecums > 18));
        System.out.println("Vai cilvēks var balsot?" + (vecums >= 18));

        System.out.println(x < 6 && z > y);

        int age = 18;
        boolean hasVoted = false;
        System.out.println("Paskaties cilvēka pasē");
        if (age >= 18 && hasVoted == false) {
            System.out.println("Drīkst balsot");

        } else {
            System.out.println("Nedrīkst balsot");
        }


        //es aizeju un nobalsoju
        hasVoted = true;

        System.out.println("Tālākas darbības");

        //pārbaudīt vai skaitlis ir negatīvs, ja ir, izvadīt uz ekrāna tekstu - NEGAĪVS
        int skaitlis = -5;
        if (skaitlis < 0) {
            System.out.println("\nNegatīvs vecums nav iespējams!!!");
        }

        if (skaitlis > 0) {
            System.out.println("Skaitlis pozitīvs");

        } else {
            System.out.println("Skaitlis negatīvs vai nulle");
        }
        String luksaforaKrasa2 = "green";
        if (luksaforaKrasa2.equals("green")) {
            System.out.println("Ej");
        } else {
            System.out.println("Stāvi");
        }

        System.out.println("Ievadīsim skaitli i");
        int i = 17;
        if (i == 10) {
            System.out.println("Skaitlis ir 10");
        } else if (i == 15) {
            System.out.println("Skaitlis ir 15");
        } else if (i == 20) {
            System.out.println("Skaitlis ir 20");
        } else {
            System.out.println("Skaitlis nav neviens no vajadzīgajiem");
        }
        //zala gaisma, sarkana gaisma, dzeltena gaisma, nedeg neviena gaisma(skaties zīmes)
        // ievadi skaitli - izvadi vai pozitivs/negativs vai nulle

        // KODS - LUKSOFORS
        String trafficLight;
        System.out.println("Enter traffic light color (red, yellow or green):");
        Scanner scanner = new Scanner(System.in);
        trafficLight = scanner.nextLine();

        if (trafficLight.equals("red")) {
            System.out.println("Stay!");
        } else if (trafficLight.equals("yellow")) {
            System.out.println("Wait!");
        } else if (trafficLight.equals("green")) {
            System.out.println("Go!");
        } else {
            System.out.println("Wrong color!");
        }

        //noteikt vai ievadītais skaitlis ir pāra vai nepāra skaitlis
        int number = scanner.nextInt();
        //te uzrakstīt kodu, kurš izvada vai skaitlis ir para vai nepara
        if (number % 2 == 0) {
            System.out.println(number + " ir pāra skaitlis");
        } else {
            System.out.println(number + " ir nepāra skaitlis");
        }

        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            default:
                System.out.println("Šāds mēnesis neeksistē");
        }


        String animal = "DOG";
        String result;
        switch (animal) {
            case "DOG":
            case "CAT":
                result = "Domestic animal";
                break;
            case "TIGER":
                result = "Wild animal";
            default:
                result = "Unknown animal";
        }

        System.out.println("This animal is: " + result);


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Hello Lekcija 2");
//        int vecums;
//        System.out.println("Kā tevi sauc?");
//        String name = scanner.nextLine();
//
//        System.out.println("Labdien, " + name + "Esi sveicienāta manā programmā");
//        System.out.println("Ievadi cilveka vecumu...");
//        vecums = scanner.nextInt();
//
//        if(vecums>=18){
//            System.out.println("Cilvēks drīkst balsot");
//
//
//
//
//
//
//}

    }
}
