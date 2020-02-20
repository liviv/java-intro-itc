package lesson05.learn_collections;

public class GenerateString {

    public static String generateString(int n, int a) {
        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";
        StringBuffer sb = new StringBuffer(n);
        for (int i = 0; i <= a; i++) {
            int length = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(length)
            );

        }
      //  System.out.println(sb);
        return sb.toString();
    }

}
