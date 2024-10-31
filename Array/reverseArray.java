public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        printArray(arr);
        System.out.println(" ");
        int reverseArray[] = new int[arr.length];
        int idx = arr.length ;
        System.out.println(idx);
        for(int i = 0; i < arr.length; i++){
            reverseArray[i] = arr[idx-1];
            idx = idx - 1;
        }
        System.out.println("reversed array");
        printArray(reverseArray);


        System.out.println(" ");
        System.out.println("this is more Efficient MEthod");
        reverse(arr);
        printArray(arr);
        

    }




    // more efficient method
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    static void printArray(int a[]){
        int n = a.length;
        for( int i = 0; i<n; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
