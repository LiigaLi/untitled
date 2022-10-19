package lekcijaTris.majasDarbs;

import java.util.Scanner;

public class LoopHomeWork {

    public static void main(String[] args) {

        whileCikls();

    }
//1uzdevums
    public static void whileCikls(){
        Scanner ievade = new Scanner(System.in);

        int skaitlis;
        int x = 0;
        while (x < 100) {
            System.out.println("Ievadi skaitli... ");
            skaitlis = ievade.nextInt();
            x = x + skaitlis;

        }
        System.out.println("Gatavs");


        //2.uzdevums

        int [] elektribasPaterinsKwh = {450, 560, 320, 700, 800, 680, 720, 805, 230, 789, 456, 555};
        String[] ieluNosaukumi = {"Liepu iela", "Saules iela", "Sporta iela", "Skolas iela", "Pasta iela"};
        char[] simboli = {'@', '%', '*', '&', '$', '!'};

        //while
        int k = 0;
        while (k < elektribasPaterinsKwh.length) {
            System.out.println("Elektrības patēriņš ir: " + elektribasPaterinsKwh[k]);
            k++;
        }

        int i = 0;
        while(i < ieluNosaukumi.length) {
            System.out.println("Tumes pagasta ielu nosaukumi ir: " + ieluNosaukumi[i]);
            i = i + 1;
        }

        int q = 0;
        while(q < simboli.length) {
            System.out.println(simboli);
            q++;
        }

        System.out.println("\n******************************************");

        //do while
        int k1 = 0;
        do {
            int kWh = elektribasPaterinsKwh [k1];
            System.out.println(kWh);
            k1++;
        }
        while ( k1 < elektribasPaterinsKwh.length);

        int i1 = 0;
        do {
            String ielas = ieluNosaukumi [i1];
            System.out.println(ielas);
            i1++;
        }
        while (i1 < ieluNosaukumi.length);

        int q1 = 0;
        do {
            char simboluSaraksts = simboli [q1];
            System.out.println(simboli);
            q1++;
        }
        while (q1 < simboli.length);

        System.out.println("\n****************************");

        //for loop
        for (int l = 0; l < elektribasPaterinsKwh.length; l++){
            System.out.println(elektribasPaterinsKwh[l]);
        }
        for (int l = 0; l < ieluNosaukumi.length; l++){
            System.out.println(ieluNosaukumi[l]);
        }
        for (int l = 0; l <simboli.length; l++){
            System.out.println(simboli[l]);
        }
        System.out.println("\n**************************************");

        //for each

        for (int kWh : elektribasPaterinsKwh){
            System.out.println(kWh);
        }
        for (String ielas : ieluNosaukumi){
            System.out.println(ielas);
        }
        for (char simboluSaraksts: simboli){
            System.out.println(simboluSaraksts);
        }

        System.out.println("\n###############################################");
        //3. uzdevums

        for (int t = 0; t <= 100; t++) {
            if (t % 2 == 0){
                System.out.println(t+"");
            }
        }

        int[] skaitluMasivs =  new int[100];
        for (int t1 = 0; t1 < skaitluMasivs.length; t1++) {
            skaitluMasivs[t1] = t1 * 2;
        }
        for (int vertiba : skaitluMasivs) {
            System.out.print(vertiba);
        }

        System.out.println("\n############################################");
        //4.uzdevms
        Scanner ievade1 = new Scanner(System.in);
        System.out.println("Ievadi veselu skaitli: " );
        int cipars = ievade1.nextInt();
        long veselsSkaitlis = 1;
        for (long y = 1; y <= cipars; y++){
            veselsSkaitlis = veselsSkaitlis * y;
        }
        System.out.println(veselsSkaitlis);




    }



    
}
