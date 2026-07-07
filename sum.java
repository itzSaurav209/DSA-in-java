import java.util.*;
class sum
{
    public static void main(String[] args)
    {
        int [] arr=new int[5];
        int sum=0;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}