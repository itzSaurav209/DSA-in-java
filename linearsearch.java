class linearsearch
{
    public static void main(String[] args) {
        int[] arr={7,34,5,4,2,67,45,9};
        int x=45;//element to be searched 
        boolean flag=false;
        /*for(int i=0;i<arr.length;i++) // first method of solving linear search 
        {
            if(x==arr[i]){
            flag =true;
            break;
            }
        }
        if(flag==true)
        System.out.println("element found");
        else
        System.out.println("not found ");*/

        // seconf method of solving linear searchh

        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i]){
            flag =true;
            System.out.println("element found at index "+ i);
            break;
            }
        }
        if(flag==false)
        System.out.println("element not found");

        //third method of linear search 
        
        /*int found =-1;// means element is not in the array initaially
        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i]){
            found =i;
            break;
            }
        }
        if(found!=-1)
        System.out.println("element found at index "+found);
        else
        System.out.println("not found ");*/

         //4th method for solving linear search using method

        /* public static void linear(int[] arr,int x)
{
    boolean flag=false;
    for(int i=0;i<arr.length;i++) // first method of solving linear search 
        {
            
            
            if(x==arr[i]){
            flag =true;
            break;
            }   
        }
        if(flag)
        System.out.println("element found");
        else
        System.out.println("not found ");
}

    public static void main(String[] args) {
        int[] arr={7,34,5,4,2,67,45,9};
        int x=45;//element to be searched 
        
        linear(arr,x);
*/
    }
}