package lekcijaPieci.labDarbs;

public class House {
    private int stavuDaudzums;
    private int loguSkaits;
    private int durvjuSkaits;
    private String adrese;
    private double griestuAugstums;
    private long kadastralaVertiba;
    private boolean vaiPrivatipasums;

    //Getter - no an.val. Get - iegūt

    public String getAdrese() {
        return adrese;
    }


    //Setter - no angļu val. SET - uzstādīt

    public void setKadastralaVertiba(long kadastralaVertiba) {
        this.kadastralaVertiba = kadastralaVertiba;
    }

    public void setStavuDaudzums(int stavuDaudzums) {
        this.stavuDaudzums = stavuDaudzums;
    }

    public void setLoguSkaits(int loguSkaits) {
        this.loguSkaits = loguSkaits;
    }

    public void setDurvjuSkaits(int durvjuSkaits) {
        this.durvjuSkaits = durvjuSkaits;
    }

    public void setAdrese(String adrese) {
        this.adrese = adrese;
    }

    public void setGriestuAugstums(double griestuAugstums) {
        this.griestuAugstums = griestuAugstums;
    }

    public void setVaiPrivatipasums(boolean vaiPrivatipasums) {
        this.vaiPrivatipasums = vaiPrivatipasums;
    }

    public House(int stavuDaudzums, int loguSkaits, int durvjuSkaits, String adrese, double griestuAugstums, long kadastralaVertiba, boolean vaiPrivatipasums) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvjuSkaits = durvjuSkaits;
        this.adrese = adrese;
        this.griestuAugstums = griestuAugstums;
        this.kadastralaVertiba = kadastralaVertiba;
        this.vaiPrivatipasums = vaiPrivatipasums;
    }



    public void printHouse() {
        System.out.println("House{" +
                "stavuDaudzums=" + stavuDaudzums +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", griestuAugstums=" + griestuAugstums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                ", vaiPrivatipasums=" + vaiPrivatipasums +
                '}');
    }

}

