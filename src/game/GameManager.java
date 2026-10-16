package game;

import pet.Pet;

import java.util.Scanner;

public class GameManager {

    private Pet pet;
    private int day;
    private Scanner sc = new Scanner(System.in);

    public GameManager(Pet pet) {
        this.pet = pet;
        this.day = 1;
    }

    public void startGame(){
        System.out.println("================================");
        System.out.println("     나만의 다마고치 키우기");
        System.out.println("================================");
        boolean isRunning = true;

        while (isRunning){
            System.out.println("==============="+day+"일차=================");

            // 하루에 행동 3번
            for(int i = 0; i <= 2; i++){

            }

            }
        }

    // 행동 메뉴
    private void showMenu(){
        System.out.println("========== 행동 선택 ==========");
        System.out.println("1. 밥 주기");
        System.out.println("2. 산책하기");
        System.out.println("3. 놀아주기");
        System.out.println("4. 씻기기");
        System.out.println("5. 재우기");
        System.out.println("0. 게임 종료");
        System.out.print("행동을 선택하세요: ");
    }

//    // 사용자 입력
//    private int getChoice(){
//    }

}

