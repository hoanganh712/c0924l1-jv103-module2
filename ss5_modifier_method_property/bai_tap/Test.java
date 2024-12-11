package ss5_modifier_method_property.bai_tap;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Khai");
        student.setClasses("C03");


        System.out.println("Tên sinh viên: " + student.getName());
        System.out.println("Lớp học: " + student.getClasses());
    }
}
