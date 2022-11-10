import java.util.Scanner;

public class Code {
    

    static boolean f(int isPrime, int y) {

        if (y == 1 || y == 0) {
            return true;
        } else if (isPrime % y == 0) {
            return false;
        } else {
            return f(isPrime, y - 1);

        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number : ");
        int isPrime = input.nextInt();
        int y = isPrime - 1;
        if (f(isPrime, y) == true) {
            System.out.println(isPrime + " is a prime number.");
        } else {
            System.out.println(isPrime + " is not a prime number.");
        }

    }

}
