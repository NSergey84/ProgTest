import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstQuestion = "What is Bitcoin price today?";
        String secondQuestion = "How much $ do you have?";
        double bitcoinPrice = getNumbers(firstQuestion);
        double dollars = getNumbers(secondQuestion);
        System.out.printf("You can buy %.7f BTC", dollars/bitcoinPrice);
    }

    public static double getNumbers(String s) {
        double number;
        Scanner sc = new Scanner(System.in);
       do {
           System.out.println(s);
           while (!sc.hasNextDouble()) {
               System.out.println("It's must by a numbers\n" + s);
               sc.next();
           }
           number = sc.nextDouble();
           if (number < 0) System.out.println("Please put a positive value");
       } while (number < 0);
       return number;
    }
}
