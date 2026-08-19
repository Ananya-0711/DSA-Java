package Strings;
import java.util.Scanner;
public class LengthofLastWord {
    public int lengthOfLastWord(String s){
        int i = s.length()-1;
        int count=0;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        
        LengthofLastWord ob = new LengthofLastWord();
        int result = ob.lengthOfLastWord(s);
        System.out.print("Length of Last word = "+result);
        sc.close();
    }
}
