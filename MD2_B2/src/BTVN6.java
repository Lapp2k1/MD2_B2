public class BTVN6 {
    public static void main(String[] args) {
            int number = 1;
        while (number % 5 != 0 || number % 7 != 0 || number % 11 != 0) {
            number++;
        }
        System.out.println("Số nguyên dương nhỏ nhất chia hết cho cả 5, 7 và 11 là: " + number);
    }
}
