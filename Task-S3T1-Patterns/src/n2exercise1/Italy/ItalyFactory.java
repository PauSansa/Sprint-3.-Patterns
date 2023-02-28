package n2exercise1.Italy;

import n2exercise1.AbstractFactory;


public class ItalyFactory implements AbstractFactory<Italy> {

    @Override
    public Italy create(String type) {
        if("Phone".equalsIgnoreCase(type)){
            return new ItalyNumber();
        } else if ("Address".equalsIgnoreCase(type)) {
            return new ItalyAddress();
        }
        return null;
    }
}
