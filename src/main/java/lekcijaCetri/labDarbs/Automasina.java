package lekcijaCetri.labDarbs;

public class Automasina {
    int durvjuSkaits;
    int nobraukums;
    String marka;
    boolean apdrosinana;
    String krasa;

    public void printAuto() {
        System.out.println("Automasina{" +
                "durvjuSkaits=" + durvjuSkaits +
                ", nobraukums=" + nobraukums +
                ", marka='" + marka + '\'' +
                ", apdrosinana=" + apdrosinana +
                ", krasa='" + krasa + '\'' +
                '}');
    }
}
