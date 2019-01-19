import java.util.Random;

public class Penguin extends Bird{
    private final String[] Names = {"Kryak", "Goblin", "Justin", "Motya", "Eggzy"};
    private final Random ChooseName = new Random();
    public Penguin() {
        System.out.println("I'm a penguin");
        setName(Names[ChooseName.nextInt(Names.length)]);
        sayName(this.name);
    }
    //@Override
    public void fly(){
        System.out.println("I can't fly");
    }
}