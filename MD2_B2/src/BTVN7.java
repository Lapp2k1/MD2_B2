import java.util.Scanner;
public class BTVN7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 20;
        int count = 0;
        int N = 2;

        while (count < numbers) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
