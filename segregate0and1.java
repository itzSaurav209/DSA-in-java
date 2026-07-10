import java.util.*;
class segregate0and1 {
    static void segregate0and1(int[] arr) {
        // code here
        int numberofzeroes=0;
        int numberofones=0;
        for(int ele:arr){
            if(ele==0) numberofzeroes++;
            else numberofones++;
        }
        int index = 0;

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
