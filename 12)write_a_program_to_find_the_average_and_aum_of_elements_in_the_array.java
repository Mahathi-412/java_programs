import java.util.*;
public class Main{
    public static void main(String[] args) {
        int sum=0,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements for the elements to store:");
        int n=sc.nextInt();
        int[] arr=new int[10];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("the sum of elements in the array:");
        {
         for(int i=0;i<=n;i++)
         {
          sum=sum+i;
         }
        avg=sum/n;
        System.out.println(sum);
        System.out.println(avg);
        }
    }
}
