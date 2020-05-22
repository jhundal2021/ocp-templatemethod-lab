package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.AmericanoCoffee;
import lab.assignment.beforerefactoring.CapuccinoCoffee;
import lab.assignment.beforerefactoring.CoffeeMakerTemplate;
import lab.assignment.beforerefactoring.MochaCoffee;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMakerTemplate starbuzz = new MochaCoffee();
        starbuzz.prepareCoffee();

        System.out.println("********************");
        starbuzz = new CapuccinoCoffee();
        starbuzz.prepareCoffee();

        System.out.println("********************");
        starbuzz = new AmericanoCoffee();
        starbuzz.prepareCoffee();

    }

}
