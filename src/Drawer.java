
import javax.swing.*;
import java.util.Random;


public class Drawer extends JFrame{
    private ImageIcon birdImage;
    private Object bird;
    private int plane[][] = new int[5][3];
    private int windowSize[] = {0, 0};
    public Drawer(int Type){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(0,0);
        setVisible(true);
        switch(Type) {
            case 0:
                birdImage = new ImageIcon(Pack.class.getResource("images/Penguin.png"));
                bird = new Penguin();
                setTitle("Penguin");
                break;
            case 1:
                birdImage = new ImageIcon(Pack.class.getResource("images/Macow.png"));
                bird = new Macow();
                setTitle("Macow");
                break;
            default:
                System.out.println("This type birds is not allowed here.");
                System.exit(0);
        }
    }
    public void drawBird(Bird bird) {
        if (bird.getClass() == this.bird.getClass()) {
            JLabel img = new JLabel(birdImage);
            JLabel name = new JLabel(bird.getName());
            Random randomX = new Random();
            Random randomY = new Random();
            int x = randomX.nextInt(5); 
            int y = randomY.nextInt(3);
            while (plane[x][y] == 1) {
                x = randomX.nextInt(5);
                y = randomY.nextInt(3);
            }
            if (windowSize[0] < x) windowSize[0] = x;
            if (windowSize[1] < y) windowSize[1] = y;
            img.setBounds(x * (30 + birdImage.getIconWidth()), y * (birdImage.getIconHeight() + 40), birdImage.getIconWidth(), birdImage.getIconHeight());
            name.setBounds(x * (30 + birdImage.getIconWidth()) + 40, y * (birdImage.getIconHeight() + 40) + birdImage.getIconHeight() + 8, birdImage.getIconWidth(), 20);
            plane[x][y] = 1;
            add(img);
            add(name);
            setSize((birdImage.getIconWidth() + 30) * (1 + windowSize[0]), (birdImage.getIconHeight() + 45) * (windowSize[1] + 1));
        } else {
            System.out.println("There's no place for this kind of birds.");
        }
    }
}
