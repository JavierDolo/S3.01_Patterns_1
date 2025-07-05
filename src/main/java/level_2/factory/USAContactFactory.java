package level_2.factory;

import level_2.dto.ContactDTO;
import level_2.model.us.USAddress;
import level_2.model.us.USPhone;
import level_2.modelclass.Address;
import level_2.modelclass.Contact;
import level_2.modelclass.Phone;

public class USAContactFactory implements AbstractContactFactory {
    public Contact createContact(ContactDTO dto) {
        Address address = new USAddress(
                dto.number, dto.streetName, dto.apartment,
                dto.city, dto.state, dto.postalCode
        );
        Phone phone = new USPhone(dto.phone);
        return new Contact(dto.fullName, address, phone);
    }
}

