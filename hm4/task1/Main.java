package Task1;

public class Main {
    public static void main(String[] args) {
        ConcreteAnimalFactory item = new ConcreteAnimalFactory();
        System.out.println(item.createAnimal("dog"));
        System.out.println(item.createAnimal("cat"));
        item.createAnimal("dog").speak();
        item.createAnimal("cat").speak();
    }
}

