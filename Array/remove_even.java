public class remove_even {



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,0};
        int result[] = removeEven(arr);
        printArray(arr);
        printArray(result);


    }

    public static int[] removeEven(int[] arr){
        int oddCOunt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 ){
                oddCOunt++;
            }
        }

        int result[] = new int[oddCOunt];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0 ){
                result[idx] = arr[i];
                idx++;
            }
        }

        return result;
    }

    static void printArray(int a[]){
        int n = a.length;
        for( int i = 0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
