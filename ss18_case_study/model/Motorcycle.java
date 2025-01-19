package ss18_case_study.model;

public class Motorcycle extends Vehicle {
    private int congSuat;

    public Motorcycle(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public String getLoai() {
        return "Xe máy";
    }

    public int getCongSuat() {
        return congSuat;
    }
}

