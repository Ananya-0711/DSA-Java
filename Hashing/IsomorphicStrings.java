import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {

    public boolean isomorphicStrings(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            // Check s -> t mapping
            if (mapST.containsKey(a) && mapST.get(a) != b) {
                return false;
            }

            // Check t -> s mapping
            if (mapTS.containsKey(b) && mapTS.get(b) != a) {
                return false;
            }

            // Store the mappings
            mapST.put(a, b);
            mapTS.put(b, a);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        IsomorphicStrings obj = new IsomorphicStrings();

        boolean result = obj.isomorphicStrings(s, t);

        System.out.println("Isomorphic: " + result);

        sc.close();
    }
}