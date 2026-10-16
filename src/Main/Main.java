package Main;

import pet.Dog;
import pet.Pet;

public class Main {
    public static void main(String[] args) {

        // Dog Test
        Pet pet = new Dog("새싹");
        pet.makeSound();
        pet.sleep();
        pet.getInfo();
        pet.eat();
        if(pet instanceof Dog){
            ((Dog)pet).specialDog();
        }
    }
}