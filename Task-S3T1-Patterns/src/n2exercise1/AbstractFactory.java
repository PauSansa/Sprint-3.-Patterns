package n2exercise1;

public interface AbstractFactory<T> {
    T create(String type);
}
