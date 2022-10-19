package lekcijaTris.labDarbs;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        whileCikls();



        System.out.println("Sākās programma");
        printetKartinu2("Pēteris", "Kalniņš", "Ventspils", 50);
        printetKartinu2("Pēteris2", "Kalniņš2", "Ventspils2", 52);
        printetKartinu();
        printNewLine();
        printetKartinu();

        System.out.println("Beidzās programma");
        int laukums = aprekinatTaisnsturaLaukumu(3, 10);
        System.out.print("Taisnstūra laukums ir:" + laukums);


        //masīvu definēšana

        int[] monthlyCosts = {100, 40, 23, 44, 55, 200};
        String[] produktuSaraksts = {"Piens", "Maize", "Olas"};
        System.out.println(produktuSaraksts[0]); //piens
        System.out.println(produktuSaraksts[1]); //maize
        System.out.println(produktuSaraksts[2]); //olas
        System.out.println(monthlyCosts[3]);


        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        System.out.println("Masiva garums ir:" + cars.length);

        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);


        int[] menesiGada = new int[12];
        menesiGada[0] = 1;

    }

    public static int aprekinatTaisnsturaLaukumu(int platums, int garums) {
        return platums * garums;
    }

    public static void printNewLine() {
        System.out.println("\n");
    }

    public static void printetKartinu() {
        System.out.println("@@@@@@@@@@@@@");
        System.out.println("LIGA LIBERGA");
        System.out.println("Tukums");
        System.out.println("Vecums:" + 40);
        System.out.println("$$$$$$$$$$$$$");

    }

    public static void printetKartinu2(String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("@@@@@@@@@@@@@");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums:" + vecums);
        System.out.println("$$$$$$$$$$$$$");


    }
    //cikli

    public static void whileCikls() {
        int x = 5;
        while (x > 0) {
            System.out.println("X nav nulle, X = " + x);
            x = x - 1;
        }

        int i = 10;
        while (i < 50) {
            System.out.println("I ir " + i);
            i = i + 1;

        }


        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};

        System.out.println("kods sākās");
        int z = 0;
        while (z < 4) {
            System.out.println(cars[z]);
            z = z + 1;
        }
        System.out.println("kods turpinās");

        String[] kartis2 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

        for (int j = 0; j < kartis2.length; j++) {
            System.out.println(kartis2[j]);
        }


        long[] telefonaNumuri = {222222, 333333, 444444, 555555, 534534543};

        for (long masivatelefons : telefonaNumuri) {
            System.out.println(masivatelefons);
        }

        String[] kartis3 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

        for (int j = 0; j < kartis3.length; j++) {
            System.out.println(kartis3[j]);
        }
        int count = 0;
        for (int j = 1; j <= 50; j++){
            System.out.println("Mājas numuri: " + j);
        }
        for (int j = 1; j <= 50; j++){
            if(j%3==0 || j%5==0){
                System.out.println("Šie numuri neder" + j);

            } else {
                count++;
            }
        }
        System.out.println("Der " + count + "Māju numuri");

        char[] vards = {'L','i','g','a'};
        for (char burts: vards){
            System.out.print(burts);
        }

        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi skaitli...");
        int number = ievade.nextInt();
        int summa = 0;
        while (number > 0) {
            summa = summa + number;
            System.out.println("Ievadi skaitli...");
            number = ievade.nextInt();
        }
        System.out.println("summa ir: " + summa);


    }


    }