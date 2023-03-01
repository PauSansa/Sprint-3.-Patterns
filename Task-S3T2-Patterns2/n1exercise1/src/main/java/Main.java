public class Main {
    public static void main(String[] args) {
        Broker myBroker = new Broker();

        new EToro(myBroker);
        new MyInvestor(myBroker);
        new StockBrockers(myBroker);


        System.out.println("\n Prueba 1 ");
        myBroker.setPrice(12.5f);
        System.out.println("\n Prueba 2");
        myBroker.setPrice(22.5f);

    }
}
