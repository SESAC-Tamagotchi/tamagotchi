package Main;

import game.GameManager;
import pet.Dog;
import pet.Dragon;
import pet.Pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 펫을 키울까요?");
        System.out.println("1. 강아지");
        System.out.println("2. 드래곤");
        System.out.print("펫 종류를 선택하세요: ");
        String type = sc.nextLine();

        System.out.print("펫의 이름은 무엇인가요?: ");
        String name = sc.nextLine();
        System.out.println("안녕 " + name + "!");

        // 다형성: 부모 타입(Pet)으로 자식 객체를 참조
        Pet pet;
        if(type.equals("2")){
            pet = new Dragon(name);
        } else {
            pet = new Dog(name);
        }

        if(pet instanceof Dog){
            ((Dog)pet).specialDog();
        }

        GameManager gameManager = new GameManager(pet);

        // 게임 시작
        gameManager.startGame();
    }
}