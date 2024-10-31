

public class array {

    static void printArray(int a[]){
        int n = a.length;
        for( int i = 0; i<n; i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("this is array");
        int myFirstArray[] = new int[5];

        myFirstArray[2] = 5;
        printArray(myFirstArray);




        //remove even number from array

        

    }
}
