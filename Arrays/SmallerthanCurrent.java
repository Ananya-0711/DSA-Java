import java.util.Scanner;
public class SmallerthanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count[i]+=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Array Elements: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        SmallerthanCurrent ob = new SmallerthanCurrent();
        int result[] = ob.smallerNumbersThanCurrent(nums);
        System.out.print("Result: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        sc.close();
    }
}

