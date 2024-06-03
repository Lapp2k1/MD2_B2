import java.util.Scanner;

public class BTVN8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập số cần kiểm tra:");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " là số chẵn");
                    } else {
                        System.out.println(number + " là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("Nhập số cần kiểm tra:");
                    number = scanner.nextInt();
                    if (isPrime(number)) {
                        System.out.println(number + " là số nguyên tố");
                    } else {
                        System.out.println(number + " không phải là số nguyên tố");
                    }
                    break;
                case 3:
                    System.out.println("Nhập số cần kiểm tra:");
                    number = scanner.nextInt();
                    if (number % 3 == 0) {
                        System.out.println(number + " chia hết cho 3");
                    } else {
                        System.out.println(number + " không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (choice != 4);

        scanner.close();
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
