package com.sysdesign.lld.builder;

public class Pizza {

    private final String topping;
    private final int size;
    private final boolean stuffedCrust;

    public Pizza(PizzaBuilder builder){
        System.out.println("Creating pizza with parameters");
        this.topping = builder.topping;
        this.size = builder.size;
        this.stuffedCrust = builder.stuffedCrust;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "topping='" + topping + '\'' +
                ", size=" + size +
                ", stuffedCrust=" + stuffedCrust +
                '}';
    }

    static class PizzaBuilder{
        String topping;
        int size;
        boolean stuffedCrust;

        public PizzaBuilder setTopping(String topping){
            this.topping = topping;
            return this;
        }

        public PizzaBuilder setSize(int size){
            this.size = size;
            return this;
        }

        public PizzaBuilder setStuffedCrust(boolean isStuffed) {
            this.stuffedCrust = isStuffed;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
