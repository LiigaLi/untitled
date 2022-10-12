package lekcijaDivi.majasDarbs;


import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        printNewLine();


        printBusinessCardTwo("Liene", "Bērziņa", "+371 233333333", "1992");
        printBusinessCardTwo("Kristaps", "Babris", "+371 24444444", "1986");
        printNewLine();


        int x = 7;
        int y = 4;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5);
        System.out.println(x <= 10);
        boolean b;
        if (!(x <= 5)) b = true;
        System.out.println(b = true);
        System.out.println(x < 10);
        System.out.println(x == 0);
        System.out.println(x == 10);
        System.out.println((x * x) > 10);

        //2.uzdevums

            int monthNumber = 6;
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
                    case 5:
                            System.out.println("Maijs");
                            break;
                    case 6:
                            System.out.println("Jūnijs");
                            break;
                    case 7:
                            System.out.println("Jūlijs");
                            break;
                    default:
                            System.out.println("Šāds mēnesis neeksistē");
                                        }

                                        //3.uzdevums
            System.out.println("Lielākais skaitlis k: 30");
            int k = 30;
            if (k == 10){
                    System.out.println("Skaitlis k ir 10");
            } else if (k == 20){
                    System.out.println("Skaitlis k ir 20");
            } else if (k == 30) {
                    System.out.println("Skaitlis k ir 30");
            } else {
                    System.out.println("Neviens skaitlis nav pareizs");
            }

            //4. uzdevums

            String luksafors = "red";
            System.out.println("Ievadi luksafora krāsu (red, yellow or green):");
            Scanner scanner = new Scanner(System.in);
            luksafors = scanner.nextLine();

            if (luksafors.equals("red")){
                    System.out.println("Stāvi!");
            } else if (luksafors.equals("yellow")) {
                    System.out.println("Gaidi!");
            } else if (luksafors.equals("green")) {
                    System.out.println("Ej!");
            } else {
                    System.out.println("Luksafors nedarbojas - ievēro satiksmes noteikumus!");
            }


    }

    public static void printNewLine(){
        System.out.println("\n");
    }

    public static void printBusinessCard(){
        //5.uzdevums
        System.out.println("Vizītkarte");
        System.out.println("##################");
        System.out.println("Vārds: Līga");
        System.out.println("Uzvārds: Liberga");
        System.out.println("Telefona numrs: +371 12345678");
        System.out.println("Dzimnšanas gads: 1982");
        System.out.println("##################");


    }

    public static void printBusinessCardTwo(String vards, String uzvards, String telNumurs, String dzimGads){
        //5.uzdevums
        System.out.println("Vizītkarte");
        System.out.println("##################");
        System.out.println("Vārds: " + vards);
        System.out.println("Uzvārds: " + uzvards);
        System.out.println("Telefona numrs: " + telNumurs);
        System.out.println("Dzimnšanas gads: " + dzimGads);
        System.out.println("##################");

    }


}