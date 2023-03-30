package Seminar2_lesson;

import java.util.Objects;

public class Lesson2 {

    public static void main(String[] args) {
        // String Poll (String Table) ["string" == A1, "new_value" == A5]
        String s1 = "string"; // -> A1
        String s2 = "string"; // -> A1
        String s3 = new String("string"); // -> A3
        String s4 = new String("string"); // -> A4
        String s5 = null;

        s1 = s1.replace('s', 'm'); // mtring
        System.out.println(s1);

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
        System.out.println(Objects.equals(s5, s1));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.insert(0, "abcde");
        stringBuilder.deleteCharAt(2); // abde
        stringBuilder.reverse(); // edba
        stringBuilder.append("_suffix"); // edba_suffix
        stringBuilder.setCharAt(0, 'x'); // xdba_suffix
        stringBuilder.insert(0, "prefix_"); // prefix_xdba_suffix

        System.out.println(stringBuilder.toString());




    }

    static String compress(String source) {
        int counter = 1;
        String result = "";
        result += source.charAt(0);
        for (int i = 1; i < source.length(); i++) {
            if (source.charAt(i) == source.charAt(i - 1)) {
                counter++;
            } else {
                if (counter != 1) {
                    result += counter;
                }
                result += source.charAt(i);
                counter = 1;
            }
        }
        if (counter != 1) {
            result += counter;
        }
        return result;
    }

    static boolean isPalindrome(String source) {
        int length = source.length();
        int half = length / 2;
        for (int i = 0; i < half; i++) {
            if (source.charAt(i) != source.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    static boolean isPalindrome1 (String source){
        String reversed = new StringBuilder(source).reverse().toString();
        return Objects.equals(source, reversed);}
}





