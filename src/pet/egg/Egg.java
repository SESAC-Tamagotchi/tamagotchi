package pet.egg;

import pet.Pet;
import pet.dog.Dog;
import pet.dragon.Dragon;

// 알: 어떤 행동에도 수치가 변하지 않고, 행동 횟수만 기록
// 부화하는 날 가장 많이 한 행동에 따라 강아지 또는 드래곤이 태어남
public class Egg extends Pet {

    // 부화하는 날 (이 날 아침에 부화)
    // 강아지의 3일차 진화와 겹치지 않도록 2일차에 부화
    private static final int HATCH_DAY = 2;

    // 행동 횟수
    private int eatCount;
    private int walkCount;
    private int playCount;
    private int cleanCount;
    private int sleepCount;

    public Egg(String name){
        super(name);
    }

    @Override
    public boolean eat(){
        eatCount++;
        wobble();
        return true;
    }

    @Override
    public boolean walk(){
        walkCount++;
        wobble();
        return true;
    }

    @Override
    public boolean play(){
        playCount++;
        wobble();
        return true;
    }

    @Override
    public void clean(){
        cleanCount++;
        wobble();
    }

    @Override
    public void sleep(){
        sleepCount++;
        wobble();
    }

    // 알은 시간이 흘러도 수치가 변하지 않음
    @Override
    public void passTime(){
        System.out.println("시간이 흐르고 있습니다...");
    }

    // 산책을 가장 많이 했으면 강아지, 그 외(밥, 놀이 위주)는 드래곤
    @Override
    public Pet evolve(int day){
        if(day != HATCH_DAY){
            return this;
        }
        System.out.println("알에 금이 가기 시작해요... 쩌적!");

        boolean walkMost = walkCount > eatCount && walkCount > playCount
                && walkCount > cleanCount && walkCount > sleepCount;
        if(walkMost){
            System.out.println(getName() + "이(가) 강아지로 태어났어요!");
            return new Dog(this);
        }
        System.out.println(getName() + "이(가) 드래곤으로 태어났어요!");
        return new Dragon(this);
    }

    private void wobble(){
        System.out.println(getName() + "이(가) 살짝 흔들려요...");
    }

    @Override
    public void makeSound(){
        System.out.println("...톡톡");
    }

    @Override
    public void specialAction(){
        System.out.println(getName() + "을(를) 따뜻하게 품어줬어요.");
        wobble();
    }

    @Override
    public void showHappyImage() {
        System.out.println("   ___");
        System.out.println("  /   \\");
        System.out.println(" | ^ ^ |");
        System.out.println("  \\___/");
    }

    @Override
    public void showUnhappyImage() {
        System.out.println("   ___");
        System.out.println("  /   \\");
        System.out.println(" | - - |");
        System.out.println("  \\___/");
    }

}
