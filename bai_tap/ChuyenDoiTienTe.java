package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhập số USD: ");
        double usd = Double.parseDouble(sc.nextLine());
        double vnd = usd * rate;
        System.out.println("Số VND: " + vnd);
    }
}
