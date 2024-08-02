import java.util.Arrays;
import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 8};
        a[2] = a[3];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}

class B1 {
    public static void main(String[] args) {
        int length, index, count;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            length = scanner.nextInt();
        } while (length <= 0);
        int array[] = new int[length];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (index = 0; index < length; index++) {
            System.out.print("Nhập phần tử thứ " + index + ": ");
            array[index] = scanner.nextInt();
        }
        System.out.println("Nhập số nguyên k: ");
        int deleteNumber = scanner.nextInt();

        count = 0;
        for (index = 0; index < length; index++) {
            if (array[index] != deleteNumber) {
                array[count] = array[index];
                count++;
            }
        }
        length = count;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + deleteNumber + " là: ");
        for (index = 0; index < length; index++) {
            System.out.print(array[index] + "\t");
        }
    }
}

class B2 {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            length = scanner.nextInt();
        } while (length <= 0);
        int array[] = new int[length];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập vào phần tử cần chèn: ");
        int insertNumber = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần chèn: ");
        int index = scanner.nextInt();
        if (index >= 0 && index <= array.length) {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = insertNumber; // Chèn phần tử X vào vị trí index
            for (int i = index + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
            System.out.println("Mảng sau khi chèn phần tử " + insertNumber + " vào vị trí " + index + ":");
            for (int i = 0; i < newArray.length; i++) {
                System.out.println(newArray[i]);
            }
        } else {
            System.out.println("Vị trí không hợp lệ. Không thể chèn phần tử vào mảng.");
        }

    }
}
