public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] height = {1,7,2,5,4,7,3,6};

        int volume = mostWater(height);
        System.out.println(volume);
        
    }


    public static int mostWater(int height[]){
        int first = 0;
        int second = height.length - 1;
        int mostWater = 0;
        int volume = 0;

        while (second > first) {
            
            if(height[first]>height[second]){
                volume = height[second]*(second - first);
                second = second - 1;
            }else{
                volume = height[first]*(second - first);
                first = first + 1;
            }

            if(volume > mostWater){
                mostWater = volume;
            }
        }



        return mostWater;

    }
}
