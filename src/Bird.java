
public class Bird {
    private String name;
    public Bird(){
//        System.out.println("I'm a bird!");
    }
    //protected /* Чтобы спокойно менять в случае чего */ void fly(){
    public void fly(String name){
        System.out.println("I'm flying");
    }
    public final void setName(String name) {
        this.name = name;
    }
    public final void sayName(String name) {
        System.out.println(this.name);
    }
    public final void friends(Object object) {
        if (object.getClass() == this.getClass()) {
            if (object == this) System.out.println("He's alone.");
            else System.out.println("They can be friends!");
        }
        else System.out.println("They can't be friends!");
    }
}