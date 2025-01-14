package view;

import model.Sach;
import java.util.List;

public class SachView {
    public void hienThiDanhSachSach(List<Sach> danhSachSach) {
        for (Sach sach : danhSachSach) {
            System.out.println(sach);
        }
    }
}

