import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên không âm (tối đa 3 chữ số): ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= 0 && number <= 999) {
            int hangTram = number / 100;
            int hangChuc = (number % 100) / 10;
            int hangDonVi = number % 10;
            switch (hangTram) {
                case 1:
                    System.out.print("one hundred ");
                    break;
                case 2:
                    System.out.print("two hundred ");
                    break;
                case 3:
                    System.out.print("three hundred ");
                    break;
                case 4:
                    System.out.print("four hundred ");
                    break;
                case 5:
                    System.out.print("five hundred ");
                    break;
                case 6:
                    System.out.print("six hundred ");
                    break;
                case 7:
                    System.out.print("seven hundred ");
                    break;
                case 8:
                    System.out.print("eight hundred ");
                    break;
                case 9:
                    System.out.print("nine hundred ");
                    break;

                default:
                    break;
            }


            switch (hangChuc) {
                case 1:
                    // Xử lý trường hợp số từ 10 đến 19
                    switch (hangDonVi) {
                        case 1:
                            System.out.print("eleven");
                            break;
                        case 2:
                            System.out.print("twelve");
                            break;
                        case 3:
                            System.out.print("thirteen");
                            break;
                        case 4:
                            System.out.print("fourteen");
                            break;
                        case 5:
                            System.out.print("fifteen");
                            break;
                        case 6:
                            System.out.print("sixteen");
                            break;
                        case 7:
                            System.out.print("seventeen");
                            break;
                        case 8:
                            System.out.print("eighteen");
                            break;
                        case 9:
                            System.out.print("nineteen");
                            break;

                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eightty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
                default:
                    break;
            }
            switch (hangDonVi) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;

                default:
                    break;
            }
        } else {
            System.out.println("Số nằm ngoài khả năng của chương trình.");
        }
    }
}
