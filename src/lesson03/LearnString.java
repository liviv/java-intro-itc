package lesson03;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Objects;

public class LearnString {
/*    Создать программу, в которой используются основные методы класса String
      (см. слайд 20 презентации ко 2-му занятию + ссылки к заданию).
    Минимум - для методов, выделенных жирным на слайде, максимум - для всех методов со слайда.
    */

    public static String learnCharAt(String originString, int i) {
        char newChar;
        if (originString.isEmpty()) {
            System.out.println("String cannot be empty");
            return originString;
        } else {
            newChar = (originString.charAt(i));
            System.out.println("character extracted with charAt is: " + newChar);
        }
        return String.valueOf(newChar);
    }

    public static boolean learnEndsWith(String originString, String suffix) {
        Objects.requireNonNull(originString, "Origin string must not be null");
        Objects.requireNonNull(suffix, "Suffix string must not be null");
        Boolean result = originString.endsWith(suffix);
        System.out.println(String.format("'%s' ends with '%s': %s", originString, suffix, result));
        return result;
    }

    public static boolean learnEquals(@NotNull String str1, @NotNull String str2) {
        Objects.requireNonNull(str1, "String 1 must not be null");
        Objects.requireNonNull(str2, "String 2 must not be null");

        boolean result = str1.equals(str2);
        System.out.println("'" + str1 + "' equals '" + str2 + "': " + result);
        System.out.println(String.format("'%s' equals '%s': %s", str1, str2, result));
        return result;
    }

    public static boolean learnEquals2(String str1, String str2) {
        boolean result = Objects.equals(str1, str2);
        System.out.println(String.format("%s equals %s : %s", str1, str2, result));
        return Objects.equals(str1, str2);
    }

    public static boolean learnEqualsIgnoreCase(@NotNull String str1, @NotNull String str2) {
        Objects.requireNonNull(str1, "String 1 must not be null");
        Objects.requireNonNull(str2, "String 2 must not be null");

        boolean result = str1.equalsIgnoreCase(str2);
        System.out.println(String.format("'%s' equals '%s': %s", str1, str2, result));
        return result;
    }

    public static boolean learnStartsWith(String originString, String prefix) {
        Objects.requireNonNull(originString, "Origin string must not be null");
        Objects.requireNonNull(prefix, "Prefix string must not be null");
        Boolean result = originString.startsWith(prefix);
        System.out.println(String.format("'%s' starts with '%s': %s", originString, prefix, result));
        return result;
    }

    public static String learnReplace(String s, Character oldChar, char newChar) {
        System.out.println("Old string: " + s);
        Objects.requireNonNull(oldChar, "oldChar must not be null");
        Objects.requireNonNull(newChar, " newChar must not be null");
        Objects.requireNonNull(s, "String must not be null");
        if (!s.contains((oldChar.toString()))) {
            System.out.println("the values to be replaced is not in the string");
            return s;
        }
        String s1 = s.replace(oldChar, newChar);
        System.out.println("New string: " + s1);
        return s1;
    }

    public static String learnToUpperCase(String s) {
        Objects.requireNonNull(s, "Sting must not be null");
        s = s.toUpperCase();
        System.out.println("String in upper case: " + s);
        return s;
    }

    public static String learnToLowerCase(String s) {
        Objects.requireNonNull(s, "Sting must not be null");
        s = s.toLowerCase();
        System.out.println("String in lower case: " + s);
        return s;
    }


    public static String learnSubstringStart(String s, int beginIndex) {
        Objects.requireNonNull(s, "Sting must not be null");
        if (beginIndex > s.length()) {
            System.out.println("begin index cannot be > than String length");
            return s;
        }
        s = s.substring(beginIndex);
        System.out.println("Substring starting from " + beginIndex + ": " + s);
        return s;
    }

    public static String learnSubstringStartEnd(String s, int beginIndex, int endIndex) {
        Objects.requireNonNull(s, "Sting must not be null");
        if (beginIndex > s.length() || endIndex > s.length()) {
            System.out.println("begin index  or end index cannot be > than String length");
            return s;
        } else if (beginIndex > endIndex) {
            System.out.println("begin index cannot be > end index");
            return s;
        }
        s = s.substring(beginIndex, endIndex);
        System.out.println("Substring starting from " + beginIndex + "and ending with " + endIndex + ": " + s);
        return s;
    }

    public static String[] learnSplit(String s, String delimiter) {
        String[] stringArray = new String[s.length() * 2];
        if (!s.contains(delimiter)) {
            System.out.println("String does not contain delimiter");
        } else {
            stringArray = s.split(delimiter);
            System.out.println(Arrays.toString(stringArray));

        }
        return stringArray;
    }

    public static boolean xy(String str) {
//if
        if (!(str.contains("x"))) {
            System.out.println("no y ");
            return true;
        }
        if (str.lastIndexOf("y") > str.lastIndexOf("x")) {
            return true;
        } else {
            System.out.println(" no y after x");
            return false;
        }


    }


}




