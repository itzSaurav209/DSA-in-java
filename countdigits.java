import java.util.*;
 class countdigits
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int count;
        System.out.println("enter the value of n");
        int n=sc.nextInt();
       /* while(n>0)
        {
            int l=n%10;
            count++;
            n=n/10;
        }*/
       count=(int)Math.log10(n)+1;
        System.out.println(count);
    }
 } 