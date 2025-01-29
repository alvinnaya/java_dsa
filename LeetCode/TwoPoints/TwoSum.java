

public class TwoSum {
    public static int[] TwoSum(int a, int[] arr){

        int left = 0;
        int right = arr.length - 1;
        int[] currentVal = new int[2];
        while (right > left) {
            
            if(arr[left] + arr[right] > a){
                right = right - 1;
            }else if(arr[left] + arr[right] < a){
                left = left + 1;
            }else if(arr[left] + arr[right] == a){
                currentVal[0] = arr[left];
                currentVal[1] = arr[right];
                break;
            }
        }


        return currentVal;
    }
    public static void main(String[] args) {

        int[] sum = {1,2,3,4,7,10};
        int[] val = new int[2];

        val = TwoSum(5, sum);
        System.out.println("the value is : " );
        System.out.print(val[0]);
        System.out.print(" and ");
        System.out.print(val[1]);

        
    }
}
