import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Brokerage> observers = new ArrayList<>();
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyAllObservers();
    }

    public void attach(Brokerage observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Brokerage o: observers){
            o.update();
        }
    }
}
