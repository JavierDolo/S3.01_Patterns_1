package level_2.factory;

import level_2.dto.ContactDTO;
import level_2.model.es.SpanishAddress;
import level_2.model.es.SpanishPhone;
import level_2.modelclass.Address;
import level_2.modelclass.Contact;
import level_2.modelclass.Phone;

public class SpainContactFactory implements AbstractContactFactory {
    public Contact createContact(ContactDTO dto) {
        Address address = new SpanishAddress(
                dto.streetType, dto.streetName, dto.number,
                dto.floorDoor, dto.postalCode, dto.city, dto.province
        );
        Phone phone = new SpanishPhone(dto.phone);
        return new Contact(dto.fullName, address, phone);
    }
}
