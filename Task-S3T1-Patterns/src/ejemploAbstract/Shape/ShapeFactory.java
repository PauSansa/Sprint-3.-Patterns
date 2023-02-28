package ejemploAbstract.Shape;

import ejemploAbstract.AbstractFactory;

public class ShapeFactory implements AbstractFactory<Shape> {

    @Override
    public Shape create(String type) {
        if("Circle".equalsIgnoreCase(type)){
            return new Circle();
        } else if("Square".equalsIgnoreCase(type)){
            return new Square();
        }
        return null;
    }
}
