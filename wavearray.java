import java.util.*;
class wavearray
{
    public static void sortInWave(int arr[]) {
        for(int i=0;i<arr.length-1;i=i+2)
        {
            int temp =arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args)
    {
        int [] arr=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the five elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sortInWave(arr);
    }
}