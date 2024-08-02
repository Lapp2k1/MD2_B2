import java.util.Scanner;

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
                        System.out.println("Mời nhập vào giá trị của phần tử thứ" + (i+1) + "của mảng:");
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
