package n2exercise1.Spain;

public class SpainAddress implements Spain{
    public String getAdress(String street, int num, String zipcode){
        return String.join(", ", street, Integer.toString(num), zipcode , country);
    }
}
