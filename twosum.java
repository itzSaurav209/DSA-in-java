import java.util.*;
class twosum
{
    public static void main(String [] args)
    {
         int [] arr=new int[5];
         boolean flag=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the target value ");
        int target=sc.nextInt();
        System.out.println("enter the five elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                flag=true;
                System.out.println("elements are in index "+i+" "+j);
                break;
                }
            }
            if (flag)
        break;
        }
        
    }
}