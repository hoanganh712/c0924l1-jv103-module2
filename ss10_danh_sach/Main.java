
import controller.SachController;
import model.Sach;
import view.SachView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SachView view = new SachView();
        SachController controller = new SachController(view);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn một hành động: 1. Thêm 2. Xóa 3. Cập nhật 4. Hiển thị 5. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Xóa bộ đệm

            switch (choice) {
                case 1:
                    // Thêm sách
                    System.out.println("Nhập mã sách:");
                    String maSach = scanner.nextLine();
                    System.out.println("Nhập tên sách:");
                    String tenSach = scanner.nextLine();
                    System.out.println("Nhập tác giả:");
                    String tacGia = scanner.nextLine();
                    controller.themSach(new Sach(maSach, tenSach, tacGia));
                    break;
                case 2:
                    // Xóa sách
                    System.out.println("Nhập mã sách cần xóa:");
                    maSach = scanner.nextLine();
                    controller.xoaSach(maSach);
                    break;
                case 3:
                    // Cập nhật sách
                    System.out.println("Nhập mã sách cần cập nhật:");
                    maSach = scanner.nextLine();
                    System.out.println("Nhập tên mới của sách:");
                    tenSach = scanner.nextLine();
                    System.out.println("Nhập tác giả mới:");
                    tacGia = scanner.nextLine();
                    controller.capNhatSach(maSach, new Sach(maSach, tenSach, tacGia));
                    break;
                case 4:
                    // Hiển thị danh sách sách
                    controller.hienThiDanhSach();
                    break;
                case 5:
                    // Thoát chương trình
                    System.out.println("Chương trình kết thúc.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

            // Hiển thị danh sách sau mỗi lần thao tác
            System.out.println("Danh sách sách hiện tại:");
            controller.hienThiDanhSach();
        }
    }
}
