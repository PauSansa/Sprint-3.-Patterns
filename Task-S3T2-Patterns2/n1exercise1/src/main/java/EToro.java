public class EToro extends Brokerage{
    public EToro(Broker broker){
        this.subject = broker;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("EToro Dashboard $$ Price Updated: " + subject.getPrice());
    }
}
