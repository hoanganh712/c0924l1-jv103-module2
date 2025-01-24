package final_test.manager;
import final_test.model.Contact;
import java.io.*;
import java.util.*;

public class ContactManager {
    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void updateContact(String name, Contact newContact) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhone(newContact.getPhone());
                contact.setAddress(newContact.getAddress());
                contact.setEmail(newContact.getEmail());
                contact.setGender(newContact.getGender());
                return;
            }
        }
    }

    public void deleteContact(String name) {
        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
    }

    public List<Contact> searchContact(String name) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                results.add(contact);
            }
        }
        return results;
    }

    public void readFromFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            contacts.clear();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    contacts.add(new Contact(data[0], data[1], data[2], data[3], data[4]));
                }
            }
        }
    }

    public void writeToFile(String fileName) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Contact contact : contacts) {
                bw.write(contact.getName() + "," + contact.getPhone() + "," + contact.getAddress() + "," + contact.getEmail() + "," + contact.getGender());
                bw.newLine();
            }
        }
    }
}
