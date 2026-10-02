package Sorting;
import java.util.Scanner;
public class BubbleSort {
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void bubble(int[] arr, int n){
        for(int i = n-1; i >= 1; i--){
            int didSwap = 0;
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
            System.out.println("hi ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort ob = new BubbleSort();
        ob.bubble(arr,n);

        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
