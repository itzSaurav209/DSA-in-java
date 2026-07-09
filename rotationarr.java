// ye ham log rotation of an array karwa rhe hai with the position of d elements 
import java.util.*;
class rotationarr
{
    public static void reverse(int[] arr,int i,int j){
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
    static void rotateArr(int arr[], int d) {
        // this is for left rotation
        
        int n=arr.length;
        
        /*reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);*/
        // this is for right rotation 
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args)
    {
        int [] arr=new int[5];
        int d;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the five elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of d at which index it should be rotate");
         d=sc.nextInt();
        System.out.println("array before rotating are as follows :");
        for(int shukla:arr)
        {
            System.out.println(shukla);
        }
        rotateArr(arr,d );

        System.out.println("\n\nArray after left rotation:");

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}