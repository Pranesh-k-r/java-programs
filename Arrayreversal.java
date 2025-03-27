import java.util.Scanner;

public class Arrayreversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int start=0;
        int end=a.length-1;
        while (start<end) {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
            
        }
        System.out.println("Reversed array:"+Array.toString(a));

    }
    
}
