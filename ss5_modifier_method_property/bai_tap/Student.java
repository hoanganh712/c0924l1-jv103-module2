package ss5_modifier_method_property.bai_tap;

public class Student {

    private String name;
    private String classes;

    public Student() {
        this.name = "Dung";
        this.classes = "C02";
    }

    public void setName(String name) { // Thay đổi thành private
        this.name = name;
    }

    public void setClasses(String classes) { // Thay đổi thành private
        this.classes = classes;
    }

    public String getName() { // Duy trì public để kiểm tra
        return this.name;
    }
    public String getClasses() { // Duy trì public để kiểm tra
        return this.classes;
    }
}

