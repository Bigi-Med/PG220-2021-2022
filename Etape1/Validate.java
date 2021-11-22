import java.util.Locale;

public interface Validate {
    boolean isPrice(double price);
    boolean isDate(String format, String value, Locale locale);
    boolean isDimension(Dimension dim);
    boolean isId(int id);
    boolean isNumber(int number);
    // boolean isPos(double x, double y);


}
