class reversearray
{
    public static void main(String [] args)
    {
        int[] arr={6,8,1,4,9,5,4};
        int n=arr.length;
        //first method of reversing an array 
        /*int i=0;
        int n=arr.length;
        int j=n-1;
        while(i<j)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }*/
        // second method of reversing an array
        /* jaise first and last element ko swap karna hai then second element aur
         second last element ko swap karna hai then third element ko aur third 
         last element ko swap karna hai .....so this is teh approach of solving it y next method */

         for(int i=0;i<n/2;i++)
         {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
            
         }
        
    }
}