package lekcijaPieci.labDarbs;

public class Dog extends Animal {

    private int legCount = 4;

    public void makeSound(){
        test123();
        System.out.println("VAU VAU VAU");
    }

    private void test123(){
        System.out.println("PRIVATE METHOD");
    }

    public void growl(){
        System.out.println("RRRRRRRRRRRRRRRRRRRRR");
    }

}
