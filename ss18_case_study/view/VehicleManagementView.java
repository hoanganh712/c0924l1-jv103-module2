package ss18_case_study.view;

import java.util.Scanner;

public class VehicleManagementView {
    private static Scanner scanner = new Scanner(System.in);
    private static VehicleController vehicleController = new VehicleController();

    public void run() {
        int luaChon;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    themPhuongTien();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 3:
                    xoaPhuongTien();
                    break;
                case 4:
                    System.out.println("Thoát... Tạm biệt!");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ! Vui lòng chọn lại.");
            }
        } while (luaChon != 4);
    }

    private static void themPhuongTien() {
        System.out.println("Chọn loại phương tiện:");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ôtô");
        System.out.println("3. Thêm xe máy");
        int loaiPhuongTien = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.print("Hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.print("Năm sản xuất: ");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();

        Vehicle vehicle = null;
        switch (loaiPhuongTien) {
            case 1:
                System.out.print("Trọng tải: ");
                int trongTai = scanner.nextInt();
                vehicle = new Truck(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
                break;
            case 2:
                System.out.print("Số chỗ ngồi: ");
                int soChoNgoi = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Kiểu xe: ");
                String kieuXe = scanner.nextLine();
                vehicle = new Car(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
                break;
            case 3:
                System.out.print("Công suất: ");
                int congSuat = scanner.nextInt();
                vehicle = new Motorcycle(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
                break;
            default:
                System.out.println("Loại phương tiện không hợp lệ!");
        }

        if (vehicle != null && vehicleController.addVehicle(vehicle)) {
            System.out.println("Thêm mới phương tiện thành công!");
        }
    }

    private static void hienThiPhuongTien() {
        System.out.println("Chọn loại phương tiện cần hiện thị:");
        System.out.println("1. Hiện thị xe tải");
        System

