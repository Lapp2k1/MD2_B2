import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello: " + name);
    }

}

class Bai2 {
    public static void main(String[] args) {

        double rate = 23000;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị USD: ");
        double usdValue = scanner.nextDouble();


        double vndValue = usdValue * rate;


        System.out.println("Giá trị VND tương ứng: " + vndValue + " VND");
    }
}
class Bai3{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài");
       int CD = sc.nextInt();
        System.out.println("Nhập vào chiều rộng");
        int CR = sc.nextInt();
       int C = (CD + CR) * 2;
       int S = CD * CR;
        System.out.println("Chu vi hình chữ nhật là:" + C);
        System.out.println("Diện tích hình chữ nhật là:" + S);
    }
}
class Bai4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        int a = sc.nextInt();
        System.out.println("Bình phương của số a là:" + (int)Math.pow(a,2));
        System.out.println("Lập phương của số a là:" + (int)Math.pow(a,3));
    }
}
class Bai5{
    public static void main(String[] args) {
                System.out.printf("%-5s %-20s %-5s %-15s %s\n", "STT", "Ho va ten", "Tuoi", "So dien thoai", "email");
                System.out.printf("%-5d %-20s %-5d %-15s %s\n", 1, "Nguyen Van A", 20, "0904848481", "Nguyen Van A");
                System.out.printf("%-5d %-20s %-5d %-15s %s\n", 2, "Nguyen Van B", 21, "0904848482", "Nguyen Van A");
                System.out.printf("%-5d %-20s %-5d %-15s %s\n", 3, "Nguyen Van C", 18, "0904848483", "Nguyen Van A");
                System.out.printf("%-5d %-20s %-5d %-15s %s\n", 4, "Nguyen Van D", 19, "0904848484", "Nguyen Van A");
                System.out.printf("%-5d %-20s %-5d %-15s %s\n", 5, "Nguyen Van E", 22, "0904848485", "Nguyen Van A");
                System.out.printf("%-5d %-20s %-5d %-15s %s\n", 6, "Nguyen Van F", 21, "0904848486", "Nguyen Van A");
                System.out.printf("%-5d %-20s %-5d %-15s %s\n", 7, "Nguyen Van G", 23, "0904848487", "Nguyen Van A");
                System.out.printf("%-5d %-20s %-5d %-15s %s\n", 8, "Nguyen Van H", 19, "0904848488", "Nguyen Van A");
                System.out.printf("%-5d %-20s %-5d %-15s %s\n", 9, "Nguyen Van I", 18, "0904848489", "Nguyen Van A");
                System.out.printf("%-5d %-20s %-5d %-15s %s\n", 10, "Nguyen Van K", 21, "0904848480", "Nguyen Van A");
    }
}

class Bai6{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm Toán:");
        Float a = sc.nextFloat();
        System.out.println("Nhập điểm Văn:");
        Float b = sc.nextFloat();
        System.out.println("Nhập điểm Anh:");
        Float c = sc.nextFloat();
        System.out.println("Tổng điểm 3 môn: " + (a + b + c));
        System.out.printf("Điểm trung bình: %.1f", (a + b + c)/3);
    }
}
