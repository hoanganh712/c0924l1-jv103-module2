package ss8_clean_code.bai_tap;
import java.util.Scanner;

public class ControllerCustomer {
    private Service service;
    private Scanner scanner;

    public ControllerCustomer() {
        service = new Service();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Hiển thị tất cả khách hàng");
            System.out.println("3. Xóa khách hàng");
            System.out.println("4. Cập nhật khách hàng");
            System.out.println("5. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    displayAllCustomers();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    updateCustomer();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private void addCustomer() {
        System.out.print("Nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh (yyyy-mm-dd): ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, dateOfBirth, address);
        service.addCustomer(customer);
        System.out.println("Khách hàng đã được thêm.");
    }

    private void displayAllCustomers() {
        for (Customer customer : service.getAllCustomers()) {
            System.out.println("ID: " + customer.getId());
            System.out.println("Tên: " + customer.getName());
            System.out.println("Ngày sinh: " + customer.getDateOfBirth());
            System.out.println("Địa chỉ: " + customer.getAddress());
            System.out.println("-------------------");
        }
    }

    private void deleteCustomer() {
        System.out.print("Nhập ID của khách hàng để xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        service.deleteCustomer(id);
        System.out.println("Khách hàng đã được xóa.");
    }

    private void updateCustomer() {
        System.out.print("Nhập ID của khách hàng để cập nhật: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh mới (yyyy-mm-dd): ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập địa chỉ mới: ");
        String address = scanner.nextLine();

        Customer updatedCustomer = new Customer(id, name, dateOfBirth, address);
        service.updateCustomer(updatedCustomer);
        System.out.println("Khách hàng đã được cập nhật.");
    }
}
