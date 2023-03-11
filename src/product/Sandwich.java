package product;

import person.ConsumingMan;
import person.ProducingMan;
import product.Food;

public class Sandwich extends Food {
    public Sandwich(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
