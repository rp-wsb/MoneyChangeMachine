import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MoneyChangerEuro {
    public static void main(String[] args) {
        double amount = getUserInput();
        calculateChange(amount);
    }

    public static double getUserInput(){
        Scanner scanner = new Scanner(System.in);
        double amount = 0;
        boolean validInput = false;

        while (!validInput){
            try{
                System.out.println("Enter the amount in euros: ");
                String input = scanner.nextLine();
                NumberFormat format = NumberFormat.getInstance(Locale.US);
                Number number = format.parse(input);
                amount = number.doubleValue();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid data format. Enter a number");
                scanner.nextLine();
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
        scanner.close();
        return amount;
    }

    public static void calculateChange(double amount) {
        int[] coinValues = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] change = new int[coinValues.length];
        int amountInCents = (int) (amount * 100);

        for (int i = 0; i < coinValues.length; i++) {
            if (amountInCents >= coinValues[i]){
                change[i] = amountInCents / coinValues[i];
                amountInCents %= coinValues[i];
            }
        }

        for(int i = 0; i < coinValues.length; i++) {
            if (change[i] >0){
                System.out.println(change[i] + " x " + coinToEuro(coinValues[i]));
            }
        }

    }
    private static String coinToEuro(int coin){
        return coin / 100.0 +"€";
    }
}
