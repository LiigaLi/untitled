package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestRinkis {

    @Test

public void testRekinatLaukumu(){
        System.out.println("Hello test, mans pirmais tests");

        Rinkis mansRinkis = new Rinkis(4.5);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedArea = 63.585;
        Double actualArea = mansRinkis.rekinatLaukumu();

        //assert/assertion - pārbaudes
   Assert.assertEquals(actualArea,expectedArea);
        calculateAreaAndAssert(4.5,63.585);


}
@BeforeTest
public void pirmsTesta (){
    System.out.println("Šī ir BEFORE TEST ANOTĀCIJA");

}
@AfterTest
public void pecTesta (){
    System.out.println("Šī ir AFTER TEST ANOTĀCIJA");

}
@BeforeMethod
public void sagatavosanas(){ //setup
    System.out.println("Šī metode tiek izpildīta pirms katra testa");

}
@AfterMethod
public void pecDarbibas(){ //tearDown
    System.out.println("Ši metode tiek izpildīte pēc katra testa");


}


    @Test

    public void testRekinatLaukumuVesels(){
        System.out.println("Hello test, mans pirmais tests");

        Rinkis mansRinkis = new Rinkis(4);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedArea = 50.24;
        Double actualArea = mansRinkis.rekinatLaukumu();

        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea,expectedArea);
        calculateAreaAndAssert(4.0,50.24);

    }

    @Test

    public void testRekinatLaukumuNulle() {
        System.out.println("Hello test, mans pirmais tests");

        Rinkis mansRinkis = new Rinkis(0);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedArea = 0.0;
        Double actualArea = mansRinkis.rekinatLaukumu();

        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea, expectedArea);
    }

    //Uzrakstīt vairākus testus, kas notestēs riņķa līnijas garuma aprēķinus

    @Test

    public void testRekinatLinijasGarumuNulle() {
        System.out.println("Hello test, mans pirmais tests");

        Rinkis mansRinkis = new Rinkis(0);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedArea = 0.0;
        Double actualArea = mansRinkis.rekinatLinijasGarumu();

        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea, expectedArea);
    }
    @Test

    public void testRekinatLinijasGarumuVesels() {
        System.out.println("Hello test, mans pirmais tests");

        Rinkis mansRinkis = new Rinkis(16);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedArea = 100.48;
        Double actualArea = mansRinkis.rekinatLinijasGarumu();

        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea, expectedArea);
    }

    @Test

    public void testRekinatLinijasGarumu() {
        System.out.println("Hello test, mans pirmais tests");

        Rinkis mansRinkis = new Rinkis(6.8);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedArea = 42.704;
        Double actualArea = mansRinkis.rekinatLinijasGarumu();

        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea, expectedArea);

    }
    @Test

    public void testRekinatLaukumuNulle1() {
        calculateAreaAndAssert(0.0,0.0);

    }


    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
        System.out.println("Hello test, mans pirmais tests");

        Rinkis mansRinkis = new Rinkis(radiuss);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedArea = sagaidamaisLaukums;
        Double actualArea = mansRinkis.rekinatLaukumu();

        //assert/assertion - pārbaudes
        Assert.assertEquals(actualArea, expectedArea);
    }

}
