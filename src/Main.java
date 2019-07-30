import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of USD: ");
        double usdAmount=input.nextDouble();
        System.out.print("Enter exchange rate: ");
        float exchangeRate= input.nextFloat();
        double vndAmount= usdAmount*exchangeRate;
        System.out.print(usdAmount + " USD = "+ vndAmount+ " VND");
    }
}
