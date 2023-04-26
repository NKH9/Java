package Task1;

public class ConcreteAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal(String str) {
        Animal animalItem;
        if (str == "dog" ) {
            animalItem = new Dog();
        } else {
            animalItem    = new Cat();
        }
        return animalItem;
    }
}
