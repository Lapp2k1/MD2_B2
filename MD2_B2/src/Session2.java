import java.util.Scanner;
import java.time.LocalDate;
import java.util.Calendar;

public class Session2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        int min, max;
        if (a > b) {
            max = a;
            min = b;
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        } else if (a < b) {
            max = b;
            min = a;
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        } else {
            System.out.println("2 số bằng nhau");
        }
    }
}

class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = scanner.nextInt();

        int max, min;
        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }

        if (a < b && a < c) {
            min = a;
        } else if (b < c) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

class B3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = scanner.nextInt();
        System.out.print("Nhập số thứ tư: ");
        int d = scanner.nextInt();

        int max, min;
        // Tìm max
        if (a > b && a > c && a > d) {
            max = a;
        } else if (b > c && b > d) {
            max = b;
        } else if (c > d) {
            max = c;
        } else {
            max = d;
        }

        // Tìm min
        if (a < b && a < c && a < d) {
            min = a;
        } else if (b < c && b < d) {
            min = b;
        } else if (c < d) {
            min = c;
        } else {
            min = d;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}

class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = scanner.nextInt();
        System.out.print("Nhập số thứ tư: ");
        int d = scanner.nextInt();
        System.out.print("Nhập số thứ năm: ");
        int e = scanner.nextInt();

        int max, min;
        // Tìm max
        if (a > b && a > c && a > d && a > e) {
            max = a;
        } else if (b > c && b > d && b > e) {
            max = b;
        } else if (c > d && c > e) {
            max = c;
        } else if (d > e) {
            max = d;
        } else {
            max = e;
        }

        // Tìm min
        if (a < b && a < c && a < d && a < e) {
            min = a;
        } else if (b < c && b < d && b < e) {
            min = b;
        } else if (c < d && c < e) {
            min = c;
        } else if (d < e) {
            min = d;
        } else {
            min = e;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

class B5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm Toán: ");
        double toan = scanner.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        double ly = scanner.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        double hoa = scanner.nextDouble();
        System.out.print("Nhập điểm Văn: ");
        double van = scanner.nextDouble();
        System.out.print("Nhập điểm Sử: ");
        double su = scanner.nextDouble();
        System.out.print("Nhập điểm Địa: ");
        double dia = scanner.nextDouble();

        double diemTrungBinh = (toan + ly + hoa + van + su + dia) / 6;
        System.out.println("Điểm trung bình: " + diemTrungBinh);

        if (diemTrungBinh >= 9 && diemTrungBinh <= 10) {
            System.out.println("Xếp loại: Xuất sắc");
        } else if (diemTrungBinh >= 8 && diemTrungBinh < 9) {
            System.out.println("Xếp loại: Giỏi");
        } else if (diemTrungBinh >= 6.5 && diemTrungBinh < 8) {
            System.out.println("Xếp loại: Khá");
        } else if (diemTrungBinh >= 5 && diemTrungBinh < 6.5) {
            System.out.println("Xếp loại: Trung bình");
        } else if (diemTrungBinh >= 3.5 && diemTrungBinh < 5) {
            System.out.println("Xếp loại: Yếu");
        } else {
            System.out.println("Xếp loại: Kém");
        }
    }
}

class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên chủ hộ: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập số công tơ đầu: ");
        int soCongToDau = scanner.nextInt();
        System.out.print("Nhập số công tơ cuối: ");
        int soCongToCuoi = scanner.nextInt();

        int soDienTieuThu = soCongToCuoi - soCongToDau;
        double tienDien = 0;

        if (soDienTieuThu <= 50) {
            tienDien = soDienTieuThu * 1806;
        } else if (soDienTieuThu <= 100) {
            tienDien = 50 * 1806 + (soDienTieuThu - 50) * 1866;
        } else if (soDienTieuThu <= 200) {
            tienDien = 50 * 1806 + 50 * 1866 + (soDienTieuThu - 100) * 2167;
        } else if (soDienTieuThu <= 300) {
            tienDien = 50 * 1806 + 50 * 1866 + 100 * 2167 + (soDienTieuThu - 200) * 2729;
        } else if (soDienTieuThu <= 400) {
            tienDien = 50 * 1806 + 50 * 1866 + 100 * 2167 + 100 * 2729 + (soDienTieuThu - 300) * 3050;
        } else {
            tienDien = 50 * 1806 + 50 * 1866 + 100 * 2167 + 100 * 2729 + 100 * 3050 + (soDienTieuThu - 400) * 3151;
        }

        System.out.println("Chủ hộ: " + hoTen);
        System.out.println("Số điện tiêu thụ: " + soDienTieuThu + " kWh");
        System.out.println("Số tiền phải trả: " + tienDien + " đồng");
    }
}

class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh này tạo thành một tam giác.");
            int chuVi = a + b + c;
            double p = chuVi / 2.0;
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Chu vi: " + chuVi);
            System.out.println("Diện tích: " + dienTich);
        } else {
            System.out.println("Ba cạnh này không tạo thành một tam giác.");
        }
    }
}

class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }
}

class B9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình là: x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }
}

class B10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số từ 0 đến 9: ");
        int number = scanner.nextInt();

        switch (number) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            default:
                System.out.println("Số không hợp lệ.");
        }
    }
}

class B11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số từ 10 đến 99: ");
        int number = scanner.nextInt();

        if (number < 10 || number > 99) {
            System.out.println("Số không hợp lệ.");
            return;
        }

        int ten = number / 10;
        int unit = number % 10;

        switch (ten) {
            case 1:
                System.out.print("Mười");
                break;
            case 2:
                System.out.print("Hai mươi");
                break;
            case 3:
                System.out.print("Ba mươi");
                break;
            case 4:
                System.out.print("Bốn mươi");
                break;
            case 5:
                System.out.print("Năm mươi");
                break;
            case 6:
                System.out.print("Sáu mươi");
                break;
            case 7:
                System.out.print("Bảy mươi");
                break;
            case 8:
                System.out.print("Tám mươi");
                break;
            case 9:
                System.out.print("Chín mươi");
                break;
        }

        if (unit != 0) {
            switch (unit) {
                case 1:
                    System.out.println(" một");
                    break;
                case 2:
                    System.out.println(" hai");
                    break;
                case 3:
                    System.out.println(" ba");
                    break;
                case 4:
                    System.out.println(" bốn");
                    break;
                case 5:
                    System.out.println(" năm");
                    break;
                case 6:
                    System.out.println(" sáu");
                    break;
                case 7:
                    System.out.println(" bảy");
                    break;
                case 8:
                    System.out.println(" tám");
                    break;
                case 9:
                    System.out.println(" chín");
                    break;
            }
        } else {
            System.out.println();
        }
    }
}

class B12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số từ 100 đến 999: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Số không hợp lệ.");
            return;
        }

        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int unit = number % 10;

        switch (hundred) {
            case 1:
                System.out.print("Một trăm");
                break;
            case 2:
                System.out.print("Hai trăm");
                break;
            case 3:
                System.out.print("Ba trăm");
                break;
            case 4:
                System.out.print("Bốn trăm");
                break;
            case 5:
                System.out.print("Năm trăm");
                break;
            case 6:
                System.out.print("Sáu trăm");
                break;
            case 7:
                System.out.print("Bảy trăm");
                break;
            case 8:
                System.out.print("Tám trăm");
                break;
            case 9:
                System.out.print("Chín trăm");
                break;
        }

        if (ten != 0 || unit != 0) {
            System.out.print(" ");
            switch (ten) {
                case 0:
                    System.out.print("lẻ");
                    break;
                case 1:
                    System.out.print("mười");
                    break;
                case 2:
                    System.out.print("hai mươi");
                    break;
                case 3:
                    System.out.print("ba mươi");
                    break;
                case 4:
                    System.out.print("bốn mươi");
                    break;
                case 5:
                    System.out.print("năm mươi");
                    break;
                case 6:
                    System.out.print("sáu mươi");
                    break;
                case 7:
                    System.out.print("bảy mươi");
                    break;
                case 8:
                    System.out.print("tám mươi");
                    break;
                case 9:
                    System.out.print("chín mươi");
                    break;
            }

            if (unit != 0) {
                System.out.print(" ");
                switch (unit) {
                    case 1:
                        System.out.println("một");
                        break;
                    case 2:
                        System.out.println("hai");
                        break;
                    case 3:
                        System.out.println("ba");
                        break;
                    case 4:
                        System.out.println("bốn");
                        break;
                    case 5:
                        System.out.println("năm");
                        break;
                    case 6:
                        System.out.println("sáu");
                        break;
                    case 7:
                        System.out.println("bảy");
                        break;
                    case 8:
                        System.out.println("tám");
                        break;
                    case 9:
                        System.out.println("chín");
                        break;
                }
            } else {
                System.out.println();
            }
        } else {
            System.out.println();
        }
    }
}

class B13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số từ 1 đến 9999: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 9999) {
            System.out.println("Số không hợp lệ.");
            return;
        }

        int thousand = number / 1000;
        int hundred = (number % 1000) / 100;
        int ten = (number % 100) / 10;
        int unit = number % 10;

        if (thousand != 0) {
            switch (thousand) {
                case 1:
                    System.out.print("Một nghìn");
                    break;
                case 2:
                    System.out.print("Hai nghìn");
                    break;
                case 3:
                    System.out.print("Ba nghìn");
                    break;
                case 4:
                    System.out.print("Bốn nghìn");
                    break;
                case 5:
                    System.out.print("Năm nghìn");
                    break;
                case 6:
                    System.out.print("Sáu nghìn");
                    break;
                case 7:
                    System.out.print("Bảy nghìn");
                    break;
                case 8:
                    System.out.print("Tám nghìn");
                    break;
                case 9:
                    System.out.print("Chín nghìn");
                    break;
            }
        }

        if (hundred != 0) {
            System.out.print(" ");
            switch (hundred) {
                case 1:
                    System.out.print("một trăm");
                    break;
                case 2:
                    System.out.print("hai trăm");
                    break;
                case 3:
                    System.out.print("ba trăm");
                    break;
                case 4:
                    System.out.print("bốn trăm");
                    break;
                case 5:
                    System.out.print("năm trăm");
                    break;
                case 6:
                    System.out.print("sáu trăm");
                    break;
                case 7:
                    System.out.print("bảy trăm");
                    break;
                case 8:
                    System.out.print("tám trăm");
                    break;
                case 9:
                    System.out.print("chín trăm");
                    break;
            }
        }

        if (ten != 0 || unit != 0) {
            System.out.print(" ");
            switch (ten) {
                case 0:
                    System.out.print("lẻ");
                    break;
                case 1:
                    System.out.print("mười");
                    break;
                case 2:
                    System.out.print("hai mươi");
                    break;
                case 3:
                    System.out.print("ba mươi");
                    break;
                case 4:
                    System.out.print("bốn mươi");
                    break;
                case 5:
                    System.out.print("năm mươi");
                    break;
                case 6:
                    System.out.print("sáu mươi");
                    break;
                case 7:
                    System.out.print("bảy mươi");
                    break;
                case 8:
                    System.out.print("tám mươi");
                    break;
                case 9:
                    System.out.print("chín mươi");
                    break;
            }

            if (unit != 0) {
                System.out.print(" ");
                switch (unit) {
                    case 1:
                        System.out.println("một");
                        break;
                    case 2:
                        System.out.println("hai");
                        break;
                    case 3:
                        System.out.println("ba");
                        break;
                    case 4:
                        System.out.println("bốn");
                        break;
                    case 5:
                        System.out.println("năm");
                        break;
                    case 6:
                        System.out.println("sáu");
                        break;
                    case 7:
                        System.out.println("bảy");
                        break;
                    case 8:
                        System.out.println("tám");
                        break;
                    case 9:
                        System.out.println("chín");
                        break;
                }
            } else {
                System.out.println();
            }
        } else {
            System.out.println();
        }
    }
}
class B14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập một số nguyên dương: ");
            n = scanner.nextInt();
        } while (n <= 0);

        System.out.println("Các số chẵn từ 1 đến " + n + " là:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class B15{
    public static void main(String[] args) {
        String proId, proName, producer;
        int yearMaking;
        double price;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Nhap ma san pham: ");
            proId = sc.nextLine();
            if(proId.length()!=5){
                System.out.println("Ma san pham phai nhap dung 5 ki tu");
            }else{
                String twoCharacters = proId.substring(0, 2);
                if(!twoCharacters.equals("SP")){
                    System.out.println("Ma san pham phai bat la SP");
                }else{
                    String threeCharacters = proId.substring(2);
                    try{
                        int number = Integer.parseInt(threeCharacters);
                        break;
                    }catch (Exception ex){
                        System.out.println("Ba ki tu cuoi cua ma san pham phai la so");
                    }
                }
            }
        }while(true);

        do{
            System.out.println("Nhap nam san xuat: ");
            try{
                yearMaking = Integer.parseInt(sc.nextLine());
                int currentYear = LocalDate.now().getYear();
                if(yearMaking<2000 || yearMaking>currentYear){
                    System.out.println("Nam san xuat phai tu 2000 den nam hien thoi");
                }else{
                    break;
                }
            }catch (Exception e){
                System.out.println("Nam san xuat phai la so");
            }
        }while (true);
    }
}

