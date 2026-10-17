package Main;

import game.GameManager;
import pet.Dog;
import pet.Pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Dog Test
        System.out.print("펫의 이름은 무엇인가요?: ");
        String name = sc.nextLine();
        System.out.println("안녕 " + name + "!");
        Pet pet = new Dog(name);
        if(pet instanceof Dog){
            ((Dog)pet).specialDog();
        }

        GameManager gameManager = new GameManager(pet);

        // 게임 시작
        gameManager.startGame();
    }
}