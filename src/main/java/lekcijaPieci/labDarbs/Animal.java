package lekcijaPieci.labDarbs;

public class Animal {
    int age;
    boolean canClimbTrees;

    public void breathe(){
        System.out.println("I can breathe");
    }

    public void makeSound(){
        System.out.println("I am animal, I make generic sound");

    }

    public void eat(){

        System.out.println("I am eating.....nom nom nom");
    }

    public void printClimbing(){

        System.out.println("Vai kaķis var kāpt kokos? " + canClimbTrees);
    }

}
