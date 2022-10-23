package lekcijaCetri.labDarbs;

public class MainDivi {
    public static void main(String[] args) {
        Kakis kakisTaisons = new Kakis();
        kakisTaisons.suga = "Bezšķirnes";
        kakisTaisons.gadi = 2;
        kakisTaisons.vards = "Taisons";
        kakisTaisons.vaiIzsalcis = true;
        kakisTaisons.printKakis();

        System.out.println("\nZIVS");

        Fish zivsViens = new Fish();
        zivsViens.species = "Renģe";
        zivsViens.weight = 2.5;
        zivsViens.color = "sudrabains";
        zivsViens.length = 32;
        zivsViens.liveInFreshWater = false;

        Fish zivs2 = new Fish();
        zivs2.species = "Lasis";
        zivs2.weight = 2.5;
        zivs2.color = "sudrabains";
        zivs2.length = 32;
        zivs2.liveInFreshWater = false;

        zivsViens.printFish();

        kakisTaisons.barotKaki(zivsViens);
        kakisTaisons.printKakis();

        kakisTaisons.barotKaki(zivs2);
        kakisTaisons.printKakis();

        Koks koksViens = new Koks();
        koksViens.suga = "liepa";
        koksViens.augstums = 25;
        koksViens.apkartmers = 120;
        koksViens.printKoks();
        Automasina auto = new Automasina();

        Automasina masinaViens = new Automasina();
        masinaViens.apdrosinana = true;
        masinaViens.krasa = "zila";
        masinaViens.durvjuSkaits = 4;
        masinaViens.marka = "Audi";
        masinaViens.nobraukums = 100150;
        masinaViens.printAuto();


    }
}
