package ss5_modifier_method_property.thuc_hanh;

public class Student {
    private int rollno;
    private String name;
    private static String college = "VALO";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
