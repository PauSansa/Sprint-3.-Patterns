package ejemploAbstract;

import ejemploAbstract.Animal.AnimalFactory;
import ejemploAbstract.Shape.ShapeFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        } else if ("Shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        }
        return null;
    }
}
