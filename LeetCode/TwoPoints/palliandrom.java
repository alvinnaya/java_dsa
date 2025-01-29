

public class palliandrom {
    public static void main(String[] args) {
        String nama = "llakll";
        System.out.println(nama.length());

        int left = 0;
        int right = nama.length() - 1;

        while (left <= right) {
            if(nama.charAt(left) == nama.charAt(right)){
                left = left + 1;
                right = right - 1;
            }else{
                System.out.println("string arent palliandrom");
                break;
            }

        }

        System.out.println("yes it palliandrom");

    }
}
