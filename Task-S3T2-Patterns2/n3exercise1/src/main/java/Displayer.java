import conversor.*;

public class Displayer {
    Conversor conversor;

    public Displayer(String currency){
        switch(currency.toLowerCase()){
            case ("dollar")-> conversor = new EurToDollar();
            case ("yuan")-> conversor = new EurToYuan();
            case ("gbp")-> conversor = new EurToGBP();
            default -> conversor = new EurToEur();
        }

    }

    public void display(Product product){
        float finalPrice = conversor.converse(product.getPrice());
        System.out.printf("%n Name: %s, Price: %.2f %s",product.getName(), finalPrice, conversor.getTo());
    }
}
