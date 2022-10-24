package lekcijaPieci.staticPiemers;

public class Cilveks {
    public static int darbiniekaNumurs = 0;
    public String name;

    public Cilveks(String name) {
        this.name = name;
        darbiniekaNumurs ++;


    }
    public void printName(){
        System.out.println("Cilveka vards ir: " + name);
        System.out.println("Darbinieka numurs ir: " + darbiniekaNumurs);
    }
}

