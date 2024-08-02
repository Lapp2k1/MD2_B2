import java.util.Scanner;

public class BTVN5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị đầu:");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá trị cuối:");
        int end = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + sum);

    }
}
