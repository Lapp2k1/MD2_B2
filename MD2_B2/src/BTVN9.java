import java.util.Scanner;

public class BTVN9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài:");
                    double length = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập chiều rộng:");
                    double width = Double.parseDouble(scanner.nextLine());
                    System.out.println("Chu vi hình chữ nhật: " + 2 * (length + width));
                    System.out.println("Diện tích hình chữ nhật: " + length * width);
                    break;
                case 2:
                    System.out.println("Nhập cạnh a:");
                    double a = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập cạnh b:");
                    double b = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập cạnh c:");
                    double c = Double.parseDouble(scanner.nextLine());
                    double p = (a + b + c) / 2;
                    System.out.println("Chu vi hình tam giác: " + 2 * p);
                    System.out.println("Diện tích hình tam giác: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                    break;
                case 3:
                    System.out.println("Nhập bán kính:");
                    double r = Double.parseDouble(scanner.nextLine());
                    System.out.println("Chu vi hình tròn: " + 2 * Math.PI * r);
                    System.out.println("Diện tích hình tròn: " + Math.PI * r * r);
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (choice != 4);
    }
}
