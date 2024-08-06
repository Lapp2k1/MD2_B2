
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] names = new int[5];

        int choice;

        names[0] = 1;
        names[1] = 4;
        names[2] = 2;
        names[3] = 3;
        System.out.println(names[1]);
        do {


            System.out.println("Menu:");
            System.out.println("1. Nhập giá trị cho các phần tử trong mảng:");
            System.out.println("2. Hiển thị giá trị các phần tử của mảng:");
            System.out.println("3. In ra giá trị các phần tử là số chẵn");
            System.out.println("4. In ra giá trị các phần tử có chỉ số là số lẻ");
            System.out.println("5. Tính tổng các phần tử trong mảng:");
            System.out.println("6. In ra giá trị nhỏ nhất và lớn nhất trong mảng");
            System.out.println("7. Thoát");

            System.out.println("Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("Mời nhập vào giá trị của phần tử thứ" + (i + 1) + "của mảng:");
                        names[i] = scanner.nextInt();

                    }
                    break;
                case 2:
                    for (int i = 0; i < names.length; i++) {
                        System.out.println(i + ":" + names[i]);


                    }
                    break;
                case 3:
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] % 2 == 0) {
                            System.out.println(i + ":" + names[i]);
                        }
                    }
                    break;
                case 4:
                    for (int i = 1; i < names.length; i += 2) {

                        System.out.println(i + ":" + names[i]);

                    }
                    break;
                case 5:
                    int sum = 0;
                    for (int i = 0; i < names.length; i++) {
                        sum += names[i];


                    }
                    System.out.println("Tổng :" + sum);
                    break;
                case 6:
                    int min = names[0];
                    int max = names[0];
                    for (int i = 1; i < names.length; i++) {
                        if (min < names[i]) {
                            min = names[i];
                        }
                        if (max > names[i]) {
                            max = names[i];
                        }


                    }
                    System.out.println("Max :" + max);
                    System.out.println("Min :" + min);
                    break;
                case 7:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }

        } while (choice != 7);
        scanner.close();
    }
};

class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập các giá trị của mảng: ");
            arr[i] = scanner.nextDouble();
        }
        System.out.println("Các giá trị của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Ex2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        n = scanner.nextInt();
        String[] hoTen = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập họ tên của từng sinh viên:");
            hoTen[i] = scanner.nextLine();
        }
        System.out.println("Họ tên của tất cả sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println(hoTen[i]);
        }
    }
}

class Ex3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập các giá trị của mảng: ");
            arr[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Ex4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        n = scanner.nextInt();
        String[] tenSinhVien = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên của từng sinh viên:");
            tenSinhVien[i] = scanner.next();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (tenSinhVien[i].compareTo(tenSinhVien[j]) > 0) {
                    String temp = tenSinhVien[i];
                    tenSinhVien[i] = tenSinhVien[j];
                    tenSinhVien[j] = temp;
                }
            }
        }
        System.out.println("Danh sách tên sau khi sắp xếp:");
        System.out.println(Arrays.toString(tenSinhVien));
    }
}

class Ex5 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 2, 9},
                {3, 7, 1},
                {8, 4, 6}
        };
        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Các phần tử là số chẵn trong mảng:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}

class Ex6 {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] B = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        if (colsA != B.length) {
            System.out.println("Không thể nhân hai ma trận này.");
            return;
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Ma trận tích của A và B:");
        for (int i = 0; i < rowsA; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}