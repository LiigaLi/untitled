package lekcijaCetri.labDarbs;

public class Fish {
    String species;
    String color;
    double weight;
    double length;
    boolean liveInFreshWater = true;
    boolean zivsBeigta = true;
    boolean vaiIzsalkusi = true;
    public void printFish() {
        System.out.println("Tu esi noķēris " + species);
        System.out.println("Tas ir " + color + ", sver " + weight + "kg un ir " + length + "cm garš.");
        if (liveInFreshWater == true) {
            System.out.println("Tā ir saldūdens zivs.");
        } else {
            System.out.println("Šī zivs mīt sāļos ūdeņos.");
        }


    }

}
