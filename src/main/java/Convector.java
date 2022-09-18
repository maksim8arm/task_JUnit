import java.math.BigDecimal;
import java.math.RoundingMode;

public class Convector {

    final double CONSTINCH = 0.0254;

    public double inchToMetre(double inch) {
        double result = new BigDecimal(CONSTINCH * inch).setScale(4, RoundingMode.HALF_UP).doubleValue();
        return result;
    }
}
