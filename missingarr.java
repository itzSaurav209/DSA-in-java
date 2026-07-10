import java.util.*;
class missingarr {
    public static int missingNum(int arr[]) {
        // code here
        long n=arr.length+1;
        long sum=n*(n+1)/2;
        long arrsum=0;
        for(int ele:arr)
        {
         arrsum+=ele;
        }
        return (int)(sum-arrsum);
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
        int ans =missingNum(arr);
        System.out.println(ans);
    }
}