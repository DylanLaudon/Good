public class Good {
String theName;
double thePrice;

    public Good(String name, double price) {
        theName = name;
        thePrice = price;
    }

    void printer() {
        System.out.println(theName + "          $" + thePrice);
    }
}


