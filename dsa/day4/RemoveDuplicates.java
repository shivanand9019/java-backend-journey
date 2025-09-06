



public class RemoveDuplicates {
    public int removeDuplicates(int[] arr){
        if(arr.length==0) return 0;
        int n = arr.length;
        int i = 0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        
        }
        return i+1;
    }


    public static void main(String[] args) {
        
        RemoveDuplicates remove = new RemoveDuplicates();
        int arr[] = {1,1,2,2,3,4,4,5};
        System.out.println("Original Array:");
        for(int num:arr){
            System.out.print(num+" ");
    }     System.out.println();
        int newLength = remove.removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<newLength;i++){
            System.out.print(arr[i]+" ");

    
}
    }
}

