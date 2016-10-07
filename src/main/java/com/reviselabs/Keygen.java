package com.reviselabs;

/**
 * Created by Kevin Sheppard on 10/7/2016.
 *
 * A utility class for generating random strings. Could be used for Auth Token or API Key generation.
 *
 */
public class Keygen {

    public static final String[] ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".split("");
    public static final String[] ALPHA_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
    public static final String[] ALPHA_NUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".split("");
    public static final String[] ALPHA_NUMERIC_SPECIAL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789#@!*&^-_+=?{}".split("");

    /**
     * Generates a string of characters based on a character library. The length
     * of the string is dependent upon the length provided.
     * @param alphabet The character library.
     * @param keyLength The desired length of the generated string.
     * @return A string of characters based on a character library and is as long as the length provided.
     */
    public static String generate(String[] alphabet, int keyLength) {
        StringBuilder _key = new StringBuilder();
        for(int i=0; i<keyLength; i++) {
            int index = (int) Math.floor(Math.random() * alphabet.length);
            _key.append(alphabet[index]);
        }
        return _key.toString();
    }

    /**
     * Generates a 64 character string of characters based on the character library provided.
     * @param alphabet The desired character library.
     * @return A random string of 64 characters based on the character library provided.
     */
    public static String generate(String[] alphabet) {
        return generate(alphabet, 64);
    }

    /**
     * Generates a random character string of a specified length based on the ALPHA_NUMERIC_SPECIAL
     * (A-Za-z0-9!*&^-_+=?{}) character library.
     * @param length The desired length of the string to be returned.
     * @return A random character string of a specified length based on the ALPHA_NUMERIC_SPECIAL character library.
     */
    public static String generate(int length) {
        return generate(ALPHA_NUMERIC_SPECIAL, length);
    }


    /**
     * Generates a string of 64 random characters based on the ALPHA_NUMERIC_SPECIAL character library.
     * @return A string of 64 random characters based on the ALPHA_NUMERIC_SPECIAL character library.
     */
    public static String generate() {
        return generate(ALPHA_NUMERIC_SPECIAL, 64);
    }

    public static void main(String[] args) {
        String apiKey = generate(ALPHA_NUMERIC_SPECIAL, 64);
        System.out.println(apiKey + " is " + apiKey.length() + " characters long");
    }
}
