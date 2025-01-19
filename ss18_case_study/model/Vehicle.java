package ss18_case_study.model;

public abstract class Vehicle {
    private String bienKiemSoat;
    private String hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public Vehicle(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public abstract String getLoai();
}

