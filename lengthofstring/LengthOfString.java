package com.lengthofstring;

public class LengthOfString {
    public static void main(String args[]) {

        String message = "Good NIGHT";

        System.out.println(message.length());
        System.out.println(message.charAt(0));
        System.out.println(message.charAt(message.length() - 1));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.equalsIgnoreCase("good night"));
        System.out.println(message.contentEquals("good after"));
        System.out.println(message.trim());

    }
}
