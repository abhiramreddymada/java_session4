public class Day_6_Problems {
    public static void main(String[] args) {
        //outer loop
        for(int i=0;i<4;i++){
            //inner loop
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int[] arr=new int[5];
        System.out.print(arr);
    }
}
