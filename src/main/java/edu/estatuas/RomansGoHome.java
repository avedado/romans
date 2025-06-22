package edu.estatuas;

public class RomansGoHome{
  public static void main(String[] args) {

        List<String> romanNumbers = List.of(
                "MMMDCCCLXXXVIII", // 3888
                "MMDCCLXXVII",  // 2777
                "CDXLIV", // 444
                "CDXXXIX" // 439
        );

        for (String roman : romanNumbers) {
            RomanNumber number = new RomanNumber(roman);
            System.out.println(number.toString() + " = " + number.toDecimal());
        }
    }

}
