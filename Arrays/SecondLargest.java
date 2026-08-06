import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter length: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Array Elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int L=0;
        int Sl=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]>L){
                L=a[i];
            }
            else if(a[i]>Sl && a[i]<L){
                Sl=a[i];
            }
        }
        if(Sl==Integer.MIN_VALUE){
            System.out.println("No Second Largest");
        }
        else{
            System.out.println("Second Largest = "+Sl);
        }
        sc.close();
    }
}
