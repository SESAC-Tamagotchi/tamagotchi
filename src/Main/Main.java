package Main;

import game.GameManager;
<<<<<<< HEAD
import pet.Dog;
import pet.Dragon;
=======
import pet.dog.Dog;
>>>>>>> origin/main
import pet.Pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pet pet;
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 펫을 키울까요?");
        System.out.println("1. 강아지");
        System.out.println("2. 드래곤");
        System.out.print("펫 종류를 선택하세요: ");
        String type = sc.nextLine();

        System.out.print("펫의 이름은 무엇인가요?: ");
<<<<<<< HEAD
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
=======
        String name = sc.nextLine().trim();
        System.out.println("펫의 종류를 선택하세요: 1. 강아지 2. 고양이");
        while (true){
            String input = sc.next().trim();
            try {
                int choice = Integer.parseInt(input);
                if (choice == 1) {
                    pet = new Dog(name);
                    break;
                } else if (choice == 2) {
                    System.out.println("고양이 구현시 추가");
                    return;
                } else{
                    System.out.println("없는 번호를 선택하셨습니다. 다시 선택해 주세요");
                }
            } catch (NumberFormatException e) {
                System.out.print("메뉴 숫자를 입력해주세요: ");
            }
>>>>>>> origin/main
        }

        System.out.println("안녕 " + name + "!");
//        if (pet instanceof Dog) {
//            ((Dog) pet).specialDog();
//        }

        GameManager gameManager = new GameManager(pet);

        // 게임 시작
        gameManager.startGame();
    }
}