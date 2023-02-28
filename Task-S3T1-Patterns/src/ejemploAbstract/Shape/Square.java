package ejemploAbstract.Shape;

public class Square implements Shape{
    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public String getPhrase() {
        return "I'm a Square";
    }
}
