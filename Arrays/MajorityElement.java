import java.util.Scanner;
public class MajorityElement {
    public int majorityElement(int nums[]){
        int count = 0;
        int candidate = 0;
        for(int num:nums){
            if(count==0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        MajorityElement ob = new MajorityElement();
        int result = ob.majorityElement(nums);
        System.out.print("Majority Element: "+result);
        sc.close();
    }
}
