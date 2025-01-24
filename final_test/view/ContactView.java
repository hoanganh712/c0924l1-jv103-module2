package final_test.view;

import final_test.manager. ContactManager;
import final_test.model.Contact;
import java.util.*;
import java.io.IOException;

public class ContactView {
    private Scanner scanner = new Scanner(System.in);
    private ContactManager manager = new ContactManager();

    public void showMenu() {
        String choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi ra file");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextLine();
            handleChoice(choice);
        } while (!choice.equals("0"));
    }

    private void handleChoice(String choice) {
        try {
            switch (choice) {
                case "1":
                    viewContacts();
                    break;
                case "2":
                    addContact();
                    break;
                case "3":
                    updateContact();
                    break;
                case "4":
                    deleteContact();
                    break;
                case "5":
                    searchContact();
                    break;
                case "6":
                    readFromFile();
                    break;
                case "7":
                    writeToFile();
                    break;
                case "0":
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    private void viewContacts() {
        List<Contact> contacts = manager.getContacts();
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    private void addContact() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();

        manager.addContact(new Contact(name, phone, address, email, gender));
        System.out.println("Thêm danh bạ thành công.");
    }

    private void updateContact() {
        System.out.print("Nhập tên danh bạ cần cập nhật: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số điện thoại mới: ");
        String phone = scanner.nextLine();
        System.out.print("Nhập địa chỉ mới: ");
        String address = scanner.nextLine();
        System.out.print("Nhập email mới: ");
        String email = scanner.nextLine();
        System.out.print("Nhập giới tính mới: ");
        String gender = scanner.nextLine();

        manager.updateContact(name, new Contact(name, phone, address, email, gender));
        System.out.println("Cập nhật danh bạ thành công.");
    }

    private void deleteContact() {
        System.out.print("Nhập tên danh bạ cần xóa: ");
        String name = scanner.nextLine();
        System.out.print("Bạn có chắc chắn muốn xóa? (y/n): ");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("y")) {
            manager.deleteContact(name);
            System.out.println("Xóa danh bạ thành công.");
        } else {
            System.out.println("Hủy xóa danh bạ.");
        }
    }

    private void searchContact() {
        System.out.print("Nhập tên cần tìm: ");
        String name = scanner.nextLine();
        List<Contact> results = manager.searchContact(name);
        for (Contact contact : results) {
            System.out.println(contact);
        }
        if (results.isEmpty()) {
            System.out.println("Không tìm thấy danh bạ.");
        }
    }

    private void readFromFile() throws IOException {
        System.out.print("Nhập tên file: ");
        String fileName = scanner.nextLine();
        manager.readFromFile(fileName);
        System.out.println("Đọc file thành công.");
    }

    private void writeToFile() throws IOException {
        System.out.print("Nhập tên file: ");
        String fileName = scanner.nextLine();
        manager.writeToFile(fileName);
        System.out.println("Ghi file thành công.");
    }
}
