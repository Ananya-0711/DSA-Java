package Strings;
import java.util.Scanner;
public class ToLowerCase {
    public String toLowerCase(String s){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                result.append(ch);
            }
            else if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
                result.append(ch);
            }
            else{
                result.append(ch); //for other characters in the String
            }
        }
        return result.toString();
   }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String a = sc.next();
    ToLowerCase ob = new ToLowerCase();
    String result = ob.toLowerCase(a);
    System.out.print(result);

    sc.close();
   }
}
