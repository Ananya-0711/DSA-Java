package Sorting;
import java.util.Scanner;
public class SelectionSort {
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void selection(int[] arr, int n){
        for(int i = 0; i <= n-2; i++){
            int mini = i;
            for(int j = i; j <= n-1; j++){
                if(arr[j] < arr[i]){
                    mini = j;
                }
            }
            swap(arr, mini, i);
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
        SelectionSort ob = new SelectionSort();
        ob.selection(arr,n);

        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
