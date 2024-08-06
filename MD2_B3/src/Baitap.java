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

class B3 {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng thứ nhất: ");
            length = scanner.nextInt();
        } while (length <= 0);
        int array1[] = new int[length];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        do {
            System.out.println("Nhập vào số phần tử của mảng thứ hai: ");
            length = scanner.nextInt();
        } while (length <= 0);
        int array2[] = new int[length];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array2[i] = scanner.nextInt();
        }
        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = array1.length; i < newArray.length; i++) {
            newArray[i] = array2[i - array1.length];
        }
        System.out.println("Mảng mới sau khi gộp 2 mảng là:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}

class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và số cột
        System.out.print("Nhập số dòng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        // Nhập các phần tử cho mảng
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        // Tìm phần tử lớn nhất
        int max = arr[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất là " + max + " tại vị trí [" + row + "][" + col + "]");
    }
}

class B5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Nhập các phần tử cho mảng
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Tìm giá trị nhỏ nhất
        int minValue = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
}

class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và số cột
        System.out.print("Nhập số dòng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        // Nhập các phần tử cho mảng
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        // Hiển thị mảng
        System.out.println("Mảng vừa nhập:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // Nhập số cột cần tính tổng
        System.out.print("Nhập số cột cần tính tổng: ");
        int y = scanner.nextInt();

        // Tính tổng các số trong cột y
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += arr[i][y - 1];
        }

        System.out.println("Tổng các số trong cột " + y + " là: " + sum);
    }
}

class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước ma trận vuông
        System.out.print("Nhập kích thước ma trận vuông (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Nhập giá trị cho ma trận
        System.out.println("Nhập giá trị cho ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Tính tổng đường chéo chính và đường chéo phụ
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += matrix[i][i]; // Đường chéo chính
            sum2 += matrix[i][n - 1 - i]; // Đường chéo phụ
        }

        System.out.println("Tổng đường chéo chính: " + sum1);
        System.out.println("Tổng đường chéo phụ: " + sum2);
    }
}

class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String myString = scanner.nextLine();
        System.out.print("Nhập ký cần kiểm tra: ");
        char targetChar = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == targetChar) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự '" + targetChar + "' trong chuỗi là: " + count);
    }
}

class B9 {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            length = scanner.nextInt();
        } while (length <= 1);
        int array[] = new int[length];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        int max = array[0], max2 = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max2 = max;
                max = array[i];
            } else if (array[i] > max2 && array[i] != max) {
                max2 = array[i];
            }
        }
        System.out.println("Phần tử lớn thứ hai là: " + max2);
    }
}

class EX {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhap vao so nguyen thu nhat: ");
            n1 = scanner.nextInt();
            System.out.println("Mời bạn nhap vao so nguyen thu hai: ");
            n2 = scanner.nextInt();
        } while (n1 > n2);
        int sum = 0;

        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 1) {
                sum += i;
            }

        }
        System.out.println("Tong cac so le tu so thu nhat den so thu hai la: " + sum);
        boolean isPrime;
        if (n2 <= 1) {
            isPrime = false;
        } else {
            for (int i = n1; i <= n2; i++) {
                isPrime = true;
                if (i <= 1) {
                    isPrime = false;
                }
                for (int j = 2; j <= Math.sqrt(i); j++) {

                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(i + " là số nguyên tố");
                }
            }
        }


    }
}