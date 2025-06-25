import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergeso(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    private static void mergeso(int[] arr, int i, int j) {
        if(i>=j)
        {
            return;
        }
        int mid=i+(j-i)/2;
        mergeso(arr, i, mid);
        mergeso(arr, mid+1, j);
        merge(arr,i,mid,j);

    }

    private static void merge(int[] arr, int si, int mid, int ei) {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei)
        {
            if(arr[i]>arr[j])
            {
                temp[k]=arr[j];
                j++;
                k++;
            }
            else{
                temp[k]=arr[i];
                i++;
                k++;
            }
        }
        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
        int q;
        for(q=si,k=0;k<temp.length;k++,q++)
        {
            arr[q]=temp[k];
        }
    }
}
