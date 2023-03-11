package person;

import product.Chocolate;
import product.Food;
import product.Sandwich;
import product.Soup;

public class Producer extends Person implements ProducingMan {
    @Override
    public String getExpectations() {
        return "no expectations";
    }

    public Producer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void consume(Food food) {
        System.out.println("Producent consuming food: " + food);
    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
        switch (productName){
            case "chocolate":
                return new Chocolate(productName, this,  consumingMan);
            case "soup":
                return new Soup(productName, this,  consumingMan);
            default:
                return new Sandwich(productName, this,  consumingMan);
        }
    }
}
