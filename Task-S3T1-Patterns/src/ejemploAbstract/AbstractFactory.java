package ejemploAbstract;

public interface AbstractFactory<T> {
    T create(String type);
}
