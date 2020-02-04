package zadanie;

import java.math.BigDecimal;

public class TypyZmiennoprzecinkowe {
    float f1 = 1.4E-45F, f2 = 3.4E+38F; // 32-bit
    double d1 = 49E-324, d2 = 1.79E+308; // 64-bit

    // 2E+2 == 2 * 10^2
    // @E-5 == 2 * 10^(1/5)

    // Gdy wymagana jest przeogromna precyzja korzystajmy z klasy BigDecimal
    BigDecimal bigDecimal = new BigDecimal(10);
}
