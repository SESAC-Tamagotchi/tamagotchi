package pet;

public abstract class Pet {

    /* 초기 세팅
    * getter & setter 필요에 따라 추가 */

    // 공통 속성
    private String name;
    private int age;
    private int health; // 체력
    private int happiness;
    private int hunger;
    private int cleanliness;
    private int affection;  // 친밀도

    public Pet(String name) {
        this.name = name;
        this.age = 0;
        this.health = 100;
        this.happiness = 50;
        this.hunger = 0;
        this.cleanliness = 100;
        this.affection = 0;
    }

    // 공통 기능
    public void eat(){}
    public void walk(){}
    public void play(){}
    public void clean(){}
    public void sleep(){}
    public void getInfo(){}

    // 펫 고유 기능
    public abstract void makeSound();
    public abstract void specialAction();


}
