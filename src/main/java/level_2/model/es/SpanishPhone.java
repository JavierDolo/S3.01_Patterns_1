package level_2.model.es;

import level_2.modelclass.Phone;

public class SpanishPhone implements Phone {
    private static final String COUNTRY_CODE = "+34";
    private final String number;

    public SpanishPhone(String number) {
        this.number = number;
    }

    public String format() {
        return "📞 Spain: " + COUNTRY_CODE + " " + number;
    }
}

