
public class BTVN7 {
    public static void main(String[] args) {

        int numbers = 20;
        int count = 0;
        int n = 2;

        while (count < numbers) {
            if (isPrime(n)) {
                System.out.println(n);
                count++;
            }
            n++;
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
