package Strings;

import java.util.Scanner;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        int minLength = strs[0].length();

        // Find the length of the shortest string
        for (int i = 1; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }

        StringBuilder result = new StringBuilder();

        // Check each character position
        for (int j = 0; j < minLength; j++) {

            char ch = strs[0].charAt(j);

            // Compare with every other string
            for (int i = 1; i < strs.length; i++) {

                if (strs[i].charAt(j) != ch) {
                    return result.toString();
                }
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String[] strs = new String[n];

        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        LongestCommonPrefix obj = new LongestCommonPrefix();

        String result = obj.longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}