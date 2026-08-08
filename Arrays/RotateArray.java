import java.util.Scanner;
public class RotateArray {
    public void rotateArray(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        int[] temp = new int[n];
        int j = 0;
        for(int i=d;i<n;i++){
            temp[j] = arr[i];
            j++;
        }
        for(int i=0;i<d;i++){
            temp[j] = arr[i];
            j++;
        }
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number of rotations: ");
        int d = sc.nextInt();
        RotateArray ob = new RotateArray();
        ob.rotateArray(arr, d);
        System.out.print("Array after rotation: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
