import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;

public class Pack {
    private final ArrayList<Macow> birds1 = new ArrayList<>();
    private final ArrayList<Penguin> birds2 = new ArrayList<>();
    private int Type;
    public Pack(String type) {
        switch(type) {
            case "Penguins":
                Type = 0;
                System.out.println("The penguin's pack done.");
                break;
            case "Macows":
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
}