import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Imput the name of the good: ");
        String gName = imput.nextLine();
        System.out.println("Imput the price of the good: ");
        double gPrice = imput.nextDouble();
        Good g1 = new Good(gName, gPrice);

        int counter = 0;
        ArrayList<Good> indeed = new ArrayList<Good>();
        while(gName != "r") {
            System.out.println("Imput r to finish imputing goods");
            System.out.println("Imput the next good: ");
            String gName1 = imput.nextLine();
            System.out.println("Imput the next price: ");
            double gPrice1 = imput.nextDouble();

            Good num1 = new Good(gName1, gPrice1);
            indeed.add(num1);
            counter ++;
        }
        //prints all of the goods
        g1.printer();
        while(counter >=0) {
            indeed.get(counter);
            counter --;
        }
        }
    }