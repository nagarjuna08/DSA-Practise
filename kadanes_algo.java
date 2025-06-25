import java.util.ArrayList;
import java.util.List;

public class kadanes_algo {
public static void main(String[] args) {
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
    int sum=0;
    int max=Integer.MIN_VALUE;
    List<Integer> li=new ArrayList<>();
    for(int i=0;i<arr.length;i++)
    {
        sum=sum+arr[i];
        max=Math.max(max,sum);
        if(sum<0)
        {
            sum=0;
            li.clear();
        }
        else{

            li.add(arr[i]);
        }
    }
    System.out.println(max+" "+li);
}   
} 