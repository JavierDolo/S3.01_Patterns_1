package level_2.model.es;

import level_2.modelclass.Address;

public class SpanishAddress implements Address {
    private final String streetType, streetName, number, floorDoor, postalCode, city, province;

    public SpanishAddress(String streetType, String streetName, String number,
                          String floorDoor, String postalCode, String city, String province) {
        this.streetType = streetType;
        this.streetName = streetName;
        this.number = number;
        this.floorDoor = floorDoor;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
    }

    public String format() {
        return String.format("%s %s, %s, %s\n%s %s\nSpain",
                streetType, streetName, number, floorDoor, postalCode, city);
    }
}

