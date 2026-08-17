package Strings;

import java.util.Scanner;

public class ReverseStringII {

    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        for (int j = 0; j < arr.length; j += 2 * k) {

            int left = j;
            int right = Math.min(j + k - 1, arr.length - 1);

            while (left < right) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        ReverseStringII obj = new ReverseStringII();

        String result = obj.reverseStr(s, k);

        System.out.println("Result: " + result);

        sc.close();
    }
}