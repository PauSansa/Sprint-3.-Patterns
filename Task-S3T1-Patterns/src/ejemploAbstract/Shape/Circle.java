package ejemploAbstract.Shape;

public class Circle implements Shape{

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public String getPhrase() {
        return "I'm a circle";
    }
}
