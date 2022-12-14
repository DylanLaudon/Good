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

        String gName1 = "";
        int counter = -1;
        //makes an array of the Good objects
        ArrayList<Good> indeed = new ArrayList<Good>();
        while(!gName1.equals("r")) {
            System.out.println("Imput r to finish imputing goods");
            System.out.println("Imput the next good: ");
            gName1 = imput.next();
            if(gName1.equals("r")){
                break;
            }
            System.out.println("Imput the next price: ");
            double gPrice1 = imput.nextDouble();

            Good num1 = new Good(gName1, gPrice1);
            indeed.add(num1);
            counter ++;
        }
        //prints all of the goods
        g1.printer();
        while(counter >=0) {
            indeed.get(counter).pleasePrint();
            counter --;
        }
        }
    }