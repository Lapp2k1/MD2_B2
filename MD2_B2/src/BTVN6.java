import java.util.Scanner;

public class BTVN6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 1;
        while (true) {
            if (N % 5 == 0 && N % 7 == 0 && N % 11 == 0) {
                break;
            }
            N++;
        }
        System.out.println("Số nguyên dương nhỏ nhất chia hết cho cả 5, 7 và 11 là: " + N);
    }
}
