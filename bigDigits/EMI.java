package bigDigits;

import java.math.*;

public class EMI {

  public static void main(String[] args) {
    BigDecimal r = new BigDecimal("10.5").divide(new BigDecimal("12"));
    BigDecimal p = new BigDecimal("10000000");

    r = r.divide(BigDecimal.valueOf(100));
    int n = 120;


    BigDecimal part = (r.add(BigDecimal.valueOf(1))).pow(n);
    BigDecimal numerator = r.multiply(part);
    BigDecimal denominator = part.subtract(BigDecimal.ONE);
    BigDecimal A = p.multiply(numerator.divide(denominator, RoundingMode.HALF_UP));
    System.out.println(A.setScale(10, RoundingMode.HALF_UP));


  }

}
