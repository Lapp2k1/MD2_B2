import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc:");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println(readNumber(number));
        }

    }

    public static String readNumber(int number) {
        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number < 20) {
            return ones[number];
        } else if (number < 100) {
            return tens[number / 10] + (number % 10 != 0 ? " " + ones[number % 10] : "");
        } else {
            return ones[number / 100] + " hundred" + (number % 100 != 0 ? " and " + readNumber(number % 100) : "");
        }
    }
}
