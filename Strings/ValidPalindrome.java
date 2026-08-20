package Strings;
import java.util.Scanner;
public class ValidPalindrome {
    public boolean validPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') ||
                            (s.charAt(i)>='A' && s.charAt(i)<='Z') ||
                            (s.charAt(i)>='0' && s.charAt(i)<='9'))){
                i++;
            }
            while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') ||
                            (s.charAt(j)>='A' && s.charAt(j)<='Z') ||
                            (s.charAt(j)>='0' && s.charAt(j)<='9'))){
                j--;
            }

            char left = s.charAt(i);
            char right = s.charAt(j);

            if(left>='A' && left<='Z'){
                left = (char)(left+32);
            }
            if(right>='A' && right<='Z'){
                right = (char)(right+32);
            }

            if(left!=right){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        ValidPalindrome ob = new ValidPalindrome();
        boolean result = ob.validPalindrome(s);
        System.out.println("Is a Palindrome?\n"+result);
        sc.close();
    }
}
