public class FindSecondMinArr {
    


    public static void main(String[] args) {
        int arr[] = {0,1,2,4,6,77,4,6,4,5,6,};
        int minimumValue = FindSecondMinValue(arr);
        System.out.println(minimumValue);
    }

    public static int FindSecondMinValue(int[] arr){
        int min = arr[0];
        int sec = arr[1];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                sec = min;
                min = arr[i];
            
            }else if(sec > arr[i]){
                sec = arr[i];
            }
        }
        return sec;
    }




    static void printArray(int a[]){
        int n = a.length;
        for( int i = 0; i<n; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }




}
