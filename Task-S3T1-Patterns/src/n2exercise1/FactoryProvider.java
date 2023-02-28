package n2exercise1;

import n2exercise1.Italy.ItalyFactory;
import n2exercise1.Spain.SpainFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String type){
        if("Spain".equalsIgnoreCase(type)){
            return new SpainFactory();
        } else if ("Italy".equalsIgnoreCase(type)) {
            return new ItalyFactory();
        }
        return null;
    }
}
