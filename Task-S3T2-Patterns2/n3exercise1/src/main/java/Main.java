import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Paraguas",12.1f), new Product("Comedero",9.10f), new Product("Bandera",5.42f));

        Displayer SpainShop = new Displayer("euro");
        Displayer AmericaShop = new Displayer("dollar");
        Displayer UkShop = new Displayer("gbp");


        System.out.println("Spain: ");
        products.forEach(SpainShop::display);

        System.out.println("\nAmerica");
        products.forEach(AmericaShop::display);

        System.out.println("\nUK");
        products.forEach(UkShop::display);
    }
}
