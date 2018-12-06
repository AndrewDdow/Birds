import java.util.Random;

public class Macow extends Bird{
    public String name;
    private final String[] Names = {"Kesha", "Goga", "Jim", "Mark", "Ennys"};
    private final Random ChooseName = new Random();
    public Macow(){
//        this.name = "Kesha";
        System.out.println("I'm a macow");
        this.setName(Names[ChooseName.nextInt(Names.length)]);
    }
    public Macow(String name){
        this.name = name;
    }
    public void speak(){
        System.out.println("My name is " + this.name);
    }
}