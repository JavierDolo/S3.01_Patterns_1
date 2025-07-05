package level_2.app;

import level_2.dto.ContactDTO;
import level_2.factory.AbstractContactFactory;
import level_2.factory.SpainContactFactory;
import level_2.factory.USAContactFactory;
import level_2.modelclass.AddressBook;

public class Main {
    public static void main(String[] args) {
        AddressBook book = new AddressBook();

        AbstractContactFactory spainFactory = new SpainContactFactory();
        AbstractContactFactory usaFactory = new USAContactFactory();

        book.addContact(spainFactory.createContact(new ContactDTO(
                "Juan Pérez", "Calle", "Mayor", "23", "3.º, 2", "28001",
                "Madrid", "Madrid", "Spain", "912345678"
        )));

        book.addContact(spainFactory.createContact(new ContactDTO(
                "Lucía González", "Avenida", "Libertad", "45", "2.º B", "46002",
                "Valencia", "Valencia", "Spain", "965432100"
        )));

        book.addContact(usaFactory.createContact(new ContactDTO(
                "Sarah Johnson", "123", "Main Street", "Apartment 4B",
                "Anytown", "California", "91234", "USA", "555-1234"
        )));

        book.addContact(usaFactory.createContact(new ContactDTO(
                "Robert Smith", "789", "Broadway", null,
                "New York", "New York", "10010", "USA", "212-555-7890"
        )));

        book.viewContacts();
    }
}

