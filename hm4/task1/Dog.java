package Task1;

public class Dog extends Animal{
    String myName = "I am a dog!";

    @Override
    public String toString() {
        return "Dog{" +
                "myName='" + myName + '\'' +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
