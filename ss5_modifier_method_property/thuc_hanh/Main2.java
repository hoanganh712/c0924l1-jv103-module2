package ss5_modifier_method_property.thuc_hanh;

public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Audi 8");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda Cx5", "Audi 6");
        System.out.println(Car.numberOfCars);
    }
}
