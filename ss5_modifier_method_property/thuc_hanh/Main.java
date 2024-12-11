package ss5_modifier_method_property.thuc_hanh;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(001, "Duc");
        Student s2 = new Student(002, "Dung");
        Student s3 = new Student(003, "Khai");

        s1.display();
        s2.display();
        s3.display();
    }
}
