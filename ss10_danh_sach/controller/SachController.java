package controller;

import java.util.ArrayList;
import java.util.List;
import model.Sach;
import view.SachView;

public class SachController {
    private List<Sach> danhSachSach;
    private SachView view;

    public SachController(SachView view) {
        this.view = view;
        this.danhSachSach = new ArrayList<>();
    }

    public void themSach(Sach sach) {
        danhSachSach.add(sach);
    }

    public void xoaSach(String maSach) {
        danhSachSach.removeIf(sach -> sach.getMaSach().equals(maSach));
    }

    public void capNhatSach(String maSach, Sach sachMoi) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                sach.setTenSach(sachMoi.getTenSach());
                sach.setTacGia(sachMoi.getTacGia());
                break;
            }
        }
    }

    public void hienThiDanhSach() {
        view.hienThiDanhSachSach(danhSachSach);
    }
}

