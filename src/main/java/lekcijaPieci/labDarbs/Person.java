package lekcijaPieci.labDarbs;

public class Person {
    public long personsKods;
    private String vards;
    private String uzvards;
    private int vecums;

    public long getPersonsKods() {
        return personsKods;
    }

    public String getVards() {
        return vards;
    }

    public String getUzvards() {
        return uzvards;
    }

    public int getVecums() {
        return vecums;
    }

    public Person(String vards, String uzvards) {
        this.vards = vards;
        this.uzvards = uzvards;
        this.vecums = 0;
        this.personsKods = generatePersonasKods();
    }

    private long generatePersonasKods(){
        return (long) (Math.random()*Math.pow(10,10));
    }

}
