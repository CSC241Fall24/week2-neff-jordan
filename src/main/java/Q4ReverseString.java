// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string
        if(s.equals("")) return "";
        else {
            return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
    }
}