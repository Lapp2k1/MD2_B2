import java.util.Scanner;

public class BTVN10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        while (true) {
            System.out.println("Nhập cạnh a:");
            a = scanner.nextDouble();
            System.out.println("Nhập cạnh b:");
            b = scanner.nextDouble();
            System.out.println("Nhập cạnh c:");
            c = scanner.nextDouble();

            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                double p = (a + b + c) / 2;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Chu vi tam giác: " + 2 * p);
                System.out.println("Diện tích tam giác: " + area);
                break;
            } else {
                System.out.println("3 cạnh vừa nhập không tạo thành tam giác. Vui lòng nhập lại.");
            }
        }

        scanner.close();
    }
}
