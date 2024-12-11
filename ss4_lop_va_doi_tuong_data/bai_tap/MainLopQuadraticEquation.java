package ss4_lop_va_doi_tuong_data.bai_tap;

import java.util.Scanner;

public class MainLopQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập giá trị c: ");
        double c = scanner.nextDouble();

        LopQuadraticEquation equation = new LopQuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiệm thứ nhất: " + root1);
            System.out.println("Nghiệm thứ hai: " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Nghiệm kép: " + root);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

        scanner.close();
    }
}
