import java.util.Scanner;
public class RemoveDup{
    public int removeDup(int arr[]){
        int n = arr.length;
        int j=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        RemoveDup ob = new RemoveDup();
        int j = ob.removeDup(arr);
        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}