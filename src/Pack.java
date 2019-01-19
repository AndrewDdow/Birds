import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;

public class Pack{
    public ArrayList<Object> pack = new ArrayList<>();
    private int i;
    private int Type;
    public Pack(String type) {
        switch(type) {
            case "Penguin":
                Type = 0;
                System.out.println("The penguin's pack done.");
                break;
            case "Macow":
                Type = 1;
                System.out.println("The macaw's pack done.");
                break;
            default:
                System.out.println("I can't do this.");
                System.exit(0);
        }
    }
    private Object createBird() {
        switch(Type) {
            case 0:
                return new Penguin();
            case 1:
                return new Macow();
            default:
                return null;
        }
    }
    public void addBird() {
        pack.add(createBird());
    }
    public void addBird(int Number) {
        for(i = 0; i <= Number; i++){
            pack.add(createBird());
        }
    }
    public int numberOfBirds() {
        return pack.size();
    }
    public void drawBirds() {
        if (numberOfBirds() <= 27 && numberOfBirds() != 0) {
            Drawer window = new Drawer(Type);
            for (int i = 0; i < numberOfBirds(); i++) window.drawBird((Bird) pack.get(i));
        } else System.out.println("Flock size must be more than 0 and less than 27");
    }
}