package Strings;
import java.util.Scanner;
public class ReverseString {
    public void reverseString(char[] s) {
        int j = s.length-1;
        int i = 0;
        char temp;
        while(i<j){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = sc.nextInt();
        char[] s = new char[n];
        for(int i=0;i<n;i++){
            s[i] = sc.next().charAt(0);
        }
        ReverseString obj = new ReverseString();
        obj.reverseString(s);

        System.out.print("Reversed string: ");

        for(int i = 0; i < n; i++){
            System.out.print(s[i]);
        }
        sc.close();
    }
}
