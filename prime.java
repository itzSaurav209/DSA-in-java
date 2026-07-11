import java.util.*;
class prime 
{
    public static  void main(String[] args)
    {
        int count =0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(i%1==0 && i%i==0)
            System.out.println("number of prime number upto n"+n);
            System.out.println(i);
        }
    }
}