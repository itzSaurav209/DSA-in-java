class mergetwosortedarr {
    public static void merge(int[] a, int[] b,int[] c){
        int i=0,k=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                
            }
            else{
                c[k]=b[j];//we can also write thse 2 lines as->c[k++]=b[j++]
                j++;
            }
            k++;
        }
        if(i==a.length){ //a ka array khatam aur ab b ke bache hue element lo
            while(j<b.length){
                c[k++]=b[j++];
            }
        }
        else{           //b array khatam aur ab a ke bache hue element lo 
            while (i<a.length) {
                c[k++]=a[i++]; 
            }
        }
    }
    public static void main(String[] args){
        int[] a={1,3,4,9};
        int[] b={2,6,7,11,24};
        int[] c=new int[a.length+b.length];
        for(int ele:c){
            System.out.print(ele);
        }
        merge(a,b,c);
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}