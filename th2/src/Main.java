import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số tiền gửi:");
        double money = scanner.nextDouble();

        System.out.println("Nhập vào số tháng:");
        int month = scanner.nextInt();

        System.out.println("Nhập vào tỉ lệ lãi suất:");
        double rate = scanner.nextDouble();

        double totalmoney = 0;
        for (int i=0; i<month; i++) {
            totalmoney += money * (rate/100)/12 * month;
        }
        System.out.println("Số tiền lãi nhận được là: " + totalmoney);
        }
}