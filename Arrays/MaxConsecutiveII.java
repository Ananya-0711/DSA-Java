import java.util.Scanner;
public class MaxConsecutiveII {
    public int maxConsecutiveII(int[] nums){
        int left = 0;
        int max = 0;
        int zeros = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                zeros++;
            while(zeros > 1){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;

            }
            max = Math.max(max, i-left+1);
        }
        return max;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter length of array: ");
       int n = sc.nextInt();
       int[] nums = new int[n];

       System.out.print("Array Elements: ");
       for(int i = 0; i < n ; i++){
        nums[i] = sc.nextInt();
       }

        MaxConsecutiveII obj = new MaxConsecutiveII();
        int result = obj.maxConsecutiveII(nums);
        System.out.println("Maximum consecutive ones: " + result);
       
       sc.close();
    }
}
