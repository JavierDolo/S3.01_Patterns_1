package level_2.modelclass;

public class Contact {
    private final String fullName;
    private final Address address;
    private final Phone phone;

    public Contact(String fullName, Address address, Phone phone) {
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
    }

    public void print() {
        System.out.println(fullName);
        System.out.println(address.format());
        System.out.println(phone.format());
        System.out.println();
    }
}

