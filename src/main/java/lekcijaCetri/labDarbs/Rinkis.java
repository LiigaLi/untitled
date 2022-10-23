package lekcijaCetri.labDarbs;

public class Rinkis {
    double r = 0;
    final double PI = 3.14;

    public Rinkis(double r) {
        this.r = r;
    }

    public double rekinatLaukumu() {
        return r * r * PI;
    }

    public double rekinatLinijasGarumu(){
        return 2 * PI * r;
    }
}
