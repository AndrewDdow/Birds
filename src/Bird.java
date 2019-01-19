
public class Bird {
    protected String name;
    public Bird(){
    }
    public void fly(String name){
        System.out.println("I'm flying");
    }
    public final void setName(String name) {
        this.name = name;
    }
    public void sayName(String name) {
        System.out.println(this.name);
    }
    public final String getName(){
        return this.name;
    }
    public final void friends(Object object) {
        if (object.getClass() == this.getClass()) {
            if (object == this) System.out.println("He's alone.");
            else System.out.println("They can be friends!");
        }
        else System.out.println("They can't be friends!");
    }
}