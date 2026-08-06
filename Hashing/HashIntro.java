import java.util.HashMap;
public class HashIntro{
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101,"ananya");
        students.put(102,"aanya");
        students.put(103,"avanya");
        System.out.println(students);
        System.out.println(students.get(101));
    }
}
