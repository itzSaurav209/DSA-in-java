import java.util.*;
class basic
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        //for printing the values ina rraylist we use method named as .add()
        System.out.println(arr.get(3));
        //for setting the value in particular index we use set method
        arr.set(3,60);
        System.out.println(arr.get(3));

        // there is a shortcut to print whole array in arraylist
        System.out.println(arr);
        // if we want to print value with loop the 
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+" ");
        }
        
    }
}