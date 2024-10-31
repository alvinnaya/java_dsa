public class FindMinValue {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,77,4,6};
        int minimumValue = FindMinValue(arr);
        System.out.println(minimumValue);
    }

    public static int FindMinValue(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static void printArray(int a[]){
        int n = a.length;
        for( int i = 0; i<n; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
}
