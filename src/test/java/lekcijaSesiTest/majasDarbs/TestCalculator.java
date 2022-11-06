package lekcijaSesiTest.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {



    //1. uzdevums

    @Test

    public void testCalculatorAdd(){
        Calculator kalkulators = new Calculator();
        System.out.println("Tests, kurš pārbauda summu");
        Assert.assertEquals(kalkulators.add(4,5),9);
        Assert.assertEquals(kalkulators.add(2,2),4);
    }
    @Test

    public void testCalculatorSubstract(){
        Calculator kalkulators = new Calculator();
        System.out.println("Tests, kurš pārbauda starpību");
        Assert.assertEquals(kalkulators.substract(9,8),1);
        Assert.assertEquals(kalkulators.substract(3,4),-1);
    }

    @Test

    public void testCalculatorMultiply(){
        Calculator kalkulators = new Calculator();
        System.out.println("Tests, kurš pārbauda reizinājumu");
        Assert.assertEquals(kalkulators.multiply(4,5),20);
        Assert.assertEquals(kalkulators.multiply(3,2),6);
    }
    @Test

    public void testCalculatorDivide(){
        Calculator kalkulators = new Calculator();
        System.out.println("Tests, kurš pārbauda dalījumu");
        Assert.assertEquals(kalkulators.divide(20,5),4);
        Assert.assertEquals(kalkulators.divide(10,2),5);
    }

}
