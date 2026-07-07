import java.util.*;
class max{
    public static void main(String[] args){
        int [] arr=new int[5];
        Scanner sc= new Scanner(System.in);
        System.err.println("enter the five elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.err.println(max);
    }
}