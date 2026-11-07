 import java.util.*;
/*class segregate0and1 {
    static void segregate0and1(int[] arr) {
        // code here
        int numberofzeroes=0;
        int numberofones=0;
        for(int ele:arr){
            if(ele==0) numberofzeroes++;
            else numberofones++;
        }

           // Pehle saare 0 bhar do
        for(int i = 0; i < numberofzeroes; i++) {
             arr[i] = 0;
              
        }

// Phir saare 1 bhar do
          for(int i = numberofzeroes; i < arr.length; i++) {
            arr[i] = 1;  
         }
         for(int ele:arr){
         System.out.println(ele);
         }
    }
    public static void main(String[] args){
    int [] arr=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the five elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        segregate0and1(arr);
    }
}
*/


//optimal approach of doing this quetsion 
class segregate0and1
{
    public static void segregate0and1(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j)
        {
            if(arr[i]==0)
             i++;
             else if(arr[j]==1)
             j--;
             else if(arr[i]==1 && arr[j]==0){
             arr[i]=0;
             arr[j]=1;
             i++;
             j--;
             }
        }
        for(int ele:arr){
         System.out.print(ele);
         }
    }
    public static void main(String[] args){
    int [] arr=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the five elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        segregate0and1(arr);
    }
}
