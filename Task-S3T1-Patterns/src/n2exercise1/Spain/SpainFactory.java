package n2exercise1.Spain;


import n2exercise1.AbstractFactory;


public class SpainFactory implements AbstractFactory<Spain> {
    @Override
    public Spain create(String type) {
        if("Phone".equalsIgnoreCase(type)){
            return new SpainNumber();
        } else if ("Address".equalsIgnoreCase(type)) {
            return new SpainAddress();
        }
        return null;
    }
}
