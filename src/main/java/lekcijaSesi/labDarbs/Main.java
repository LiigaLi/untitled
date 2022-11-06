package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String vards = faker.name().firstName();
        System.out.println("Mani sauc " + vards);
        System.out.println("Mani sauc " + "Līga");

        System.out.println(faker.shakespeare().hamletQuote());
        System.out.println(faker.address().streetName());
        for (int i = 0; i < 10; i++){
            System.out.println("Cat name " + faker.cat().name());
        }
        System.out.println("\n \n \n");

        //Adresi, telefona nr., e-pastu, uzvārdu, 1 pēc brīvas izvēles
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.name().lastName());
        System.out.println(faker.artist().name());


    }
}
