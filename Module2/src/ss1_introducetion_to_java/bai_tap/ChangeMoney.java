package ss1_introducetion_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23_000, usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien  USD");
        usd = scanner.nextDouble();
        double quydoi =  usd*23000;
        System.out.println("Gia tri VND: " + quydoi);
    }
}
