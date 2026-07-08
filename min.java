import java.util.*;
class min
{
    public static void main(String[] args)
    {
        int [] arr=new int[5];
        Scanner sc= new Scanner(System.in);
        System.err.println("enter the five elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println(min);
    }
}