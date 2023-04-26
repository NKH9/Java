package Task1;

public class Cat extends Animal{
    String myName = "I am a cat!";

    @Override
    public String toString() {
        return "Cat{" +
                "myName='" + myName + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
