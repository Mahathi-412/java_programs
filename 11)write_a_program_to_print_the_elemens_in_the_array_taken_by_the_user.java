import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements for the elements to store:");
        int n=sc.nextInt();
        int[] arr=new int[10];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("array elements are:");
        for(int i=0;i<n;i++)
        {
         System.out.println(arr[i]);
        }
    }
}
