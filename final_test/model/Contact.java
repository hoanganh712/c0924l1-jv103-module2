package final_test.model;

public class Contact {
    private String name;
    private String phone;
    private String address;
    private String email;
    private String gender;

    // Constructors, Getters, and Setters
    public Contact(String name, String phone, String address, String email, String gender) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters for each field
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", phone=" + phone + ", address=" + address + ", email=" + email + ", gender=" + gender + "]";
    }
}
