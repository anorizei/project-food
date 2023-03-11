package product;

import person.Consumer;
import person.ConsumingMan;
import person.Producer;
import person.ProducingMan;



public class FoodFactory {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        foodFactory.run();

    }

    private void run() {
        ProducingMan[] producingPeople = new ProducingMan[] {
                new Producer("Alicja", "Zupowa"),
                new Producer("Krzysztof", "Ciastkarski")
        };

        ConsumingMan[] consumingPeople = new ConsumingMan[] {
                new Consumer("Rafał", "Pożeracz", "chocolate"),
                new Consumer("Angelika", "Zajadacz", "fish")
        };
        int counter = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                counter++;
            }
        }
        
        Food[] foods = new Food[counter];
        
        int index = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                Food food = producingPerson.produce(consumingPerson.getExpectations(), consumingPerson);
                foods[index] = food;
                index++;

            }
        }
        System.out.println("Printing food: ");
        for (Food food : foods) {
            System.out.println(food);
        }
    }
}
