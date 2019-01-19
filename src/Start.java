
public class Start {
//    @param args the command line arguments
    public static void main(String[] args) {
//        System.out.println("Hello, world!");
//        Bird b = new Bird();
//        b.fly();
//          Penguin p1 = new Penguin();
//          p1.sayName("");
//          Penguin p2 = new Penguin();
//          p2.sayName("");
////        p.fly();
//          Macow m1 = new Macow();
//          m1.sayName("");
//          Macow m2 = new Macow();
//          m2.sayName("");
////        m1.fly();
////        m1.speak();
////        m1.name = "George";
////        m1.speak();
////        Macow m2 = new Macow ("Peter");
////        m2.fly();
////        m2.speak();
//          m1.friends(m2);
//          m1.friends(p1);
//          p1.friends(p2);
//          p1.friends(p1);
          Pack p = new Pack("Penguin");
          p.addBird(10);
          p.drawBirds();
          Pack c = new Pack("Macow");
          c.addBird(10);
          c.drawBirds();
    }
}