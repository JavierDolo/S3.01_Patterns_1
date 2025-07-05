package level_2.dto;

public class ContactDTO {
    public String fullName;
    public String company;
    public String streetType;
    public String streetName;
    public String number;
    public String floorDoor;
    public String postalCode;
    public String city;
    public String province;
    public String country;
    public String phone;
    public String apartment;
    public String state;

    public ContactDTO(String fullName, String streetType, String streetName, String number,
                      String floorDoor, String postalCode, String city, String province,
                      String country, String phone) {
        this.fullName = fullName;
        this.streetType = streetType;
        this.streetName = streetName;
        this.number = number;
        this.floorDoor = floorDoor;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.country = country;
        this.phone = phone;
    }

    public ContactDTO(String fullName, String number, String streetName, String apartment,
                      String city, String state, String postalCode, String country, String phone) {
        this.fullName = fullName;
        this.number = number;
        this.streetName = streetName;
        this.apartment = apartment;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
    }
}

