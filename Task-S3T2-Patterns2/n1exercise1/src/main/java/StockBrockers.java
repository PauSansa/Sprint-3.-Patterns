public class StockBrockers extends Brokerage{
    public StockBrockers(Broker broker){
        this.subject = broker;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("StockBrockers Dashboard $$ Price Updated: " + subject.getPrice());
    }
}
