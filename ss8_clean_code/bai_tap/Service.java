package ss8_clean_code.bai_tap;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Customer> customers;

    public Service() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public void deleteCustomer(int id) {
        customers.removeIf(customer -> customer.getId() == id);
    }

    public void updateCustomer(Customer updatedCustomer) {
        for (Customer customer : customers) {
            if (customer.getId() == updatedCustomer.getId()) {
                customer.setName(updatedCustomer.getName());
                customer.setDateOfBirth(updatedCustomer.getDateOfBirth());
                customer.setAddress(updatedCustomer.getAddress());
            }
        }
    }
}

