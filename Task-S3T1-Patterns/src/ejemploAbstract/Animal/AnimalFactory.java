package ejemploAbstract.Animal;

import ejemploAbstract.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {
    public Animal create(String animalType){
        if("Dog".equalsIgnoreCase(animalType)){
            return new Dog();
        } else if("Duck".equalsIgnoreCase(animalType)){
            return new Duck();
        }
        return null;
    }
}
