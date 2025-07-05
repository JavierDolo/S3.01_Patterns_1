package level_2.factory;

import level_2.dto.ContactDTO;
import level_2.modelclass.Contact;

public interface AbstractContactFactory {
    Contact createContact(ContactDTO dto);
}

