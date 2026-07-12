// hame list me yaa array me diye gaye number me 1 add karwana hai 
import java.util.*;
class plusone {

    public static int[] plusOne(int[] digits) {
        int n=digits.length-1; 
        
        for(int i=n;i>=0;i--){
             if(digits[i]!=9) {
            digits[i]+=1; 
            return digits;
            }
            else
            digits[i]=0;
         }
        int[] ans=new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
    public static void main(String[] args) {
     int [] digits=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the five elements");
        for(int i=0;i<digits.length;i++)
        {
            digits[i]=sc.nextInt();
        }
         int[] result = plusOne(digits);

        System.out.print("Answer: ");

        for (int x : result) {
            System.out.print(x + " ");
    }
}
}