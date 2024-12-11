package ss5_modifier_method_property.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        // Tạo đối tượng Circle với hàm tạo không tham số
        Circle circle1 = new Circle();
        System.out.println("Circle 1: ");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());

        // Tạo đối tượng Circle với hàm tạo có tham số
        Circle circle2 = new Circle(2.5);
        System.out.println("\nCircle 2: ");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
    }
}
