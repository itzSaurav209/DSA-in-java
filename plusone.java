// hame list me yaa array me diye gaye number me 1 add karwana hai 
import java.util.*;
class plusone {
    // this is done eith the help of array
    /*
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
    */
   //now i am doing with the help of arraylist
   static ArrayList<Integer> increment(ArrayList<Integer> arr) {

        for (int i = arr.size() - 1; i >= 0; i--) {

            if (arr.get(i) != 9) {
                arr.set(i, arr.get(i) + 1);
                return arr;
            }

            arr.set(i, 0);
        }

        arr.add(0, 1);
        return arr;
    } 
    // this  main method is for array list
    /*
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
}*/
//this is from array list 
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        System.out.println("Enter the digits:");

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        ArrayList<Integer> ans = increment(arr);

        System.out.println("Answer:");

        for (int x : ans) {
            System.out.print(x + " ");
        }
}
}