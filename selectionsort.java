import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<=arr[minindex])
                {
                    minindex=j;
                }
            }
            if(i!=minindex)
            {
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
                count++;
            }
        }
        System.out.println(count);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
