package lekcijaCetri.labDarbs;

public class Kakis {
    String suga;
    int gadi;
    boolean vaiIzsalcis = true;
    String vards;

    int kakjaZivjuMaxSkaits = 5;

    public void barotKaki(Fish zivs) {
        if (zivs.species.equals("Renģe")) {
            System.out.println("Fū, neēdīšu");
        } else if (zivs.species.equals("Lasis")) {
            vaiIzsalcis = false;
        }

    }

    public void printKakis() {
        System.out.println("Kakis{" +
                "suga='" + suga + '\'' + "\n" +
                ", gadi=" + gadi + "\n" +
                ", vaiIzsalcis=" + vaiIzsalcis + "\n" +
                ", vards='" + vards + '\'' + "\n" +
                '}');
    }

}
