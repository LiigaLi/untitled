package lekcijaPieci.staticPiemers;

public class Cilveks {
    public String name;
    public int age = 0;
    public static int count=1;
    public int darbiniekaNumurs;

    public Cilveks(String name) {
        this.name = name;
        darbiniekaNumurs = count;
        count++;
    }

    public void printName() {
        System.out.println("Cilveka vards ir: " + name);
    }

    public static void printCount() {
        System.out.println(count);
    }
}

