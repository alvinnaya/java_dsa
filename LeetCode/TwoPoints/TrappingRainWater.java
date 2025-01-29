public class TrappingRainWater {
    public static void main(String[] args) {

        int[] rain = {0,2,0,3,1,0,1,3,2,1};

        int totalWater = mostContainer(rain);
        System.out.println(totalWater);


        
    }



    public static int mostContainer(int height[]){
        int first = 0;
        int second = height.length - 1;
        int s = second - first + 2;
        int volume = 0;
        int decVal = 0;
        int highestSec = height[0];
        int highestFirst = height[height.length-1];
        

          
        if(height[first]>height[second]){
            volume = height[second]*(s);
        }else{
            volume = height[first]*(s);
        }

       while (second >= first) {

        if(height[first]>height[second]){

            if(height[second] > highestSec){
                volume = volume - highestSec*(second - first + 1);
                volume = volume + height[second]*(second-first + 1);
                highestSec = height[second];
                decVal = decVal + height[second];
                second = second -1;
            }else{
                second = second -1;
                decVal = decVal + height[second];
            }
            
            
            
        }else{
            
            if(height[first] > highestFirst){
                volume = volume - highestFirst*(second - first + 1);
                volume = volume + height[first]*(second-first + 1);
                highestFirst = height[first];
                decVal = decVal + height[first];
                first = first + 1;
            }else{
                first = first + 1;
                decVal = decVal + height[first];
            }
           
        }

       }
       volume = volume - decVal;

        return volume;

    }
}
