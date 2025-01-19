package ss18_case_study.model;

public class Truck extends Vehicle {
    private int trongTai;

    public Truck(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    @Override
    public String getLoai() {
        return "Xe tải";
    }

    public int getTrongTai() {
        return trongTai;
    }
}

