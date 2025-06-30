import java.util.Scanner;
public class quicksort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        quicksorting(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    private static void quicksorting(int[] arr, int low, int high) {
        if(low<high)
        {
            int p=partition(arr,low,high);
            quicksorting(arr, low, p-1);
            quicksorting(arr, p+1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) 
    {
        int i=low+1;
        int j=high;
        int pivot=arr[low];
        while(i<=j)
        {
            while(i<=high && arr[i]<=pivot)
            {
                i++;
            }
            while(j>=low && arr[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
}

