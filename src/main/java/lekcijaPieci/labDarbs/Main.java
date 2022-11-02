package lekcijaPieci.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat muris = new Cat();
        Dog reksis = new Dog();
        Cow govs = new Cow();
        muris.age = 3;
        muris.canClimbTrees = true;

        reksis.makeSound();

        reksis.canClimbTrees = false;

        muris.breathe();
        reksis.breathe();
        govs.breathe();

        muris.makeSound();
        reksis.makeSound();
        govs.makeSound();
        muris.eat();
        reksis.eat();
        muris.sharpenClaws();
        reksis.growl();

        muris.printClimbing();

        House house = new House(1,2,3,"Brivibas",
                2.5,100000L,true);

        house.printHouse();
        house.setKadastralaVertiba(30000L);
        house.setAdrese("Tallinas iela");

        System.out.println("Mājas adrese ir: " + house.getAdrese());


        house.printHouse();

        Person cilveks1 = new Person("Juris","Kreilis");
        System.out.println(cilveks1.getPersonsKods());


        System.out.println(Calculator.add(5,10));
        System.out.println(Calculator.add(5.0,10.0));
        System.out.println(Calculator.add(3,5,7));




    }
}
