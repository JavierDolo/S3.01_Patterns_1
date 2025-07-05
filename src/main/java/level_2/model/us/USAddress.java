package level_2.model.us;

import level_2.modelclass.Address;

public class USAddress implements Address {
    private final String number, street, apartment, city, state, postalCode;

    public USAddress(String number, String street, String apartment,
                     String city, String state, String postalCode) {
        this.number = number;
        this.street = street;
        this.apartment = apartment;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append(number).append(" ").append(street).append("\n");
        if (apartment != null && !apartment.isBlank()) {
            sb.append(apartment).append("\n");
        }
        sb.append(city).append(", ").append(state.toUpperCase()).append(" ").append(postalCode).append("\n");
        sb.append("USA");
        return sb.toString();
    }
}

