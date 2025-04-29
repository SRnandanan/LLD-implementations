package com.sysdesign.lld.builder;

public class BuilderExample {


    public static void main(String[] args) {
        Pizza pizzaOne = new Pizza.PizzaBuilder()
                .setSize(8)
                .setTopping("Pepperoni")
                .setStuffedCrust(false).build();

        System.out.println("The created pizza is: "+pizzaOne.toString());

        Pizza pizzaTwo = new Pizza.PizzaBuilder()
                            .setSize(12)
                            .setTopping("Paneer")
                            .setStuffedCrust(true).build();

        System.out.println("The created pizza is: "+pizzaTwo.toString());
    }
}
