package lekcijaCetri.labDarbs;

import java.util.Date;

public class Velosipeds {
    String zimols;
    int ramjaIzmers;
    int atrums = 0;
    Date izgatavošanasDatums;

    Velosipeds(){
        System.out.println("Taisām Jaunu VELO!!!!!");
        izgatavošanasDatums = new Date();
        System.out.println("Izgatavošanas datums: " + izgatavošanasDatums);
    }

    Velosipeds(String zimols, int ramjaIzmers, int atrums){
        izgatavošanasDatums = new Date();
        this.zimols = zimols;
        this.ramjaIzmers=ramjaIzmers;
        this.atrums=atrums;
    }


    public void printAtrums() {
        System.out.println(atrums);
    }

    public void paatrinajums(int paatrinajums) {
        System.out.println(zimols+" Velo paatrinas");
        atrums = atrums + paatrinajums;
    }

    public void bremzesana() {
        if (atrums >= 5) {
            System.out.println(zimols+"Velo Bremze , atrums ir: " + atrums);
            atrums = atrums - 5;
        } else {
            System.out.println(zimols+"Beidz bremzēt, tu jau stāvi");
        }
    }


}
