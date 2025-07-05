package level_2.modelclass;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void viewContacts() {
        System.out.println("📘 Address Book:");
        System.out.println("--------------------------");
        for (Contact contact : contacts) {
            contact.print();
            System.out.println("--------------------------");
        }

    }
}

