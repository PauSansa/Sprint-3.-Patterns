public class BotigaSabates {
    static Stripe stripe = new Stripe();
    public void getPaid(int method){


        switch(method){
            case 1:
                stripe.executeWith(() -> System.out.println("Paying with Credit Card"));
                break;
            case 2:
                stripe.executeWith(() -> System.out.println("Paying with Paypal"));
                break;
            case 3:
                stripe.executeWith(() -> System.out.println("Paying with Bank Transfer"));
                break;
            default:
                System.out.println("That's not a option");

        }
    }
}
