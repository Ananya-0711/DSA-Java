import java.util.Scanner;

public class MajorityElement {

    public int majorityElement(int nums[]) {

        // Step 1: Find a possible candidate
        int count = 0;
        int candidate = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify the candidate
        int frequency = 0;

        for (int num : nums) {
            if (num == candidate) {
                frequency++;
            }
        }

        // Step 3: Check if candidate is actually a majority
        if (frequency > nums.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MajorityElement obj = new MajorityElement();

        int result = obj.majorityElement(nums);

        if (result == -1) {
            System.out.println("No majority element.");
        } else {
            System.out.println("Majority Element: " + result);
        }

        sc.close();
    }
}