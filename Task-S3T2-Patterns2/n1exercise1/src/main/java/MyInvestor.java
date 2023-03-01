public class MyInvestor extends Brokerage{

    public MyInvestor(Broker broker){
        this.subject = broker;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("MyInvestor Dashboard $$ Price Updated: " + subject.getPrice());
    }
}
