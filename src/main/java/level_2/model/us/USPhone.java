package level_2.model.us;

import level_2.modelclass.Phone;

public class USPhone implements Phone {
    private static final String COUNTRY_CODE = "+1";
    private final String number;

    public USPhone(String number) {
        this.number = number;
    }

    public String format() {
        return "📞 USA: " + COUNTRY_CODE + " " + number;
    }
}

