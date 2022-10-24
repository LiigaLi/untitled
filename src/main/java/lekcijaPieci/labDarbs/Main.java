package lekcijaPieci.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat muris = new Cat();
        Dog reksis = new Dog();
        Cow govs = new Cow();
        Fish zivs = new Fish();


        muris.age = 3;
        reksis.age = 6;

        muris.breathe();
        reksis.breathe();
        govs.breathe();
        zivs.breathe();

        muris.makeSound();
        reksis.makeSound();
        govs.makeSound();

        muris.eat();
        reksis.eat();

        muris.sharpenClaws();
        reksis.growl();

        muris.canClimbTrees = true;

        reksis.canClimbTrees = false;

        muris.printClimbing();

        House house = new House(1, 2, 3, "Liepu", 2.5,
                100000L,true);

        house.printHouse();
        house.setKadastralaVertiba(300000L);
        house.setAdrese("Meža iela");
        System.out.println("Mājas adrese ir: " + house.getAdrese());

        house.printHouse();

        Calculator kalkulators = new Calculator();
        System.out.println(kalkulators.add('5',  10));






    }
}
