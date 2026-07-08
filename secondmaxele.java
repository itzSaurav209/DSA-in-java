import java.util.*;
class secondmaxele
{
    public static void main(String []args)
    {
         int [] arr=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the five elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax&&arr[i]!=max)
            smax=arr[i];
        }
        System.out.println(smax);
    }
}