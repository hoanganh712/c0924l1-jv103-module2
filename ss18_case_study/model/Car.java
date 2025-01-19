package ss18_case_study.model;

public class Car extends Vehicle {
    private int soChoNgoi;
    private String kieuXe;

    public Car(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    @Override
    public String getLoai() {
        return "Ôtô";
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }
}
