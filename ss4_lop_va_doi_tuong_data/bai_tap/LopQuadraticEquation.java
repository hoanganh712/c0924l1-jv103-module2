package ss4_lop_va_doi_tuong_data.bai_tap;

public class LopQuadraticEquation {
    private double a;
    private double b;
    private double c;

    public LopQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
}
