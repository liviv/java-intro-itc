package lesson02;

public class EachNth {

    public static String extractEachNthChar(String originalString, int n) {

        if (originalString.isEmpty()) {
            System.out.println(originalString + "Empty string");
            return originalString;
        } else if (n < 0) {


            System.out.println("index cannot be negative");
            return originalString;
        } else {
            String newString = "";

            for (int i = 0; i < originalString.length(); i = i + n) {

                newString += originalString.substring(i, i + 1);

            }
            System.out.println(" new string is: " + newString);
            return newString;
        }

    }


}
