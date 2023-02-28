package n2exercise1.Italy;

public class ItalyAddress implements Italy{
    public String getAdress(String street, int num, String zipcode){
        return String.join(", ", street, Integer.toString(num), zipcode , country);
    }
}
