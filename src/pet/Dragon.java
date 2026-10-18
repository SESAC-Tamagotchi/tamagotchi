package pet;

public class Dragon extends Pet{

    public Dragon(String name){
        super(name);
    }

    @Override
    public boolean play(){
        boolean isSuccess = super.play();
        if(!isSuccess){
            return false;
        }
        setHappiness(getHappiness() + 10);
        System.out.println("하늘을 날며 놀았어요! 비행 보너스! 행복도 + 10");

        return true;
    }

    @Override
    public int getEvolutionBonus(){
        return 20;
    }

    @Override
    public void passTime(){
        super.passTime();
        setHappiness(getHappiness() - 5);
    }

    @Override
    public void makeSound(){
        System.out.println("크아아앙!");
    }

    @Override
    public void specialAction(){
        makeSound();
        System.out.println(getName() + "이(가) 하늘을 향해 불을 뿜어요! 🔥");
    }

    public void showHappyImage() {
        System.out.println("                       /\\ /\\");
        System.out.println("        /\\            / \\\\ \\_____");
        System.out.println("       /  \\__        |  (@)      >");
        System.out.println("      / /\\   \\__     |      __VVVV  ~🔥🔥");
        System.out.println("     /_/  \\_____\\__  |     /");
        System.out.println("         /\\/\\/\\/\\/\\/\\|     \\__^^^^>");
        System.out.println("        /               _______/");
        System.out.println("  <>___/   _________   /");
        System.out.println("          /_/\\    /_/\\/");
        System.out.println("          VVV     VVV");
    }

    public void showUnhappyImage() {
        System.out.println("                       /\\ /\\   ~");
        System.out.println("        /\\            / \\\\ \\_____~");
        System.out.println("       /  \\__        |  (-)      >");
        System.out.println("      / /\\   \\__     |      __VVVV|");
        System.out.println("     /_/  \\_____\\__  |     /  ^^^^|");
        System.out.println("         /\\/\\/\\/\\/\\/\\|     \\______/");
        System.out.println("        /               /");
        System.out.println("  <>___/   _________   /");
        System.out.println("          /_/\\    /_/\\/");
        System.out.println("          VVV     VVV");
    }

}
