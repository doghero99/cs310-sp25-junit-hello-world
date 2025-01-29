package edu.jsu.mcis.cs310;

public class Main {

    /**
     * Returns the greeting message.
     * @return a "Hello, World!" greeting message.
     */
    public String getGreeting() {
        return "Hello, World!";
    }

    /**
     * Reverses the input string.
     * @param str the string to be reversed.
     * @return the reversed string.
     */
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Main main = new Main();

        // Print the greeting and the reversed greeting
        System.out.println(main.getGreeting());
        System.out.println(main.reverse(main.getGreeting()));
    }
}
