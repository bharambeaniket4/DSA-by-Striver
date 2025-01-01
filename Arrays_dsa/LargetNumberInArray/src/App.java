public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = {3,2,1,5,2};
        largestElementInArray( arr );
    }

    public static  void largestElementInArray(int[] arr){
        int largestElement = arr[0];

        for( int i=0; i<arr.length; i++){
            if( arr[i] > largestElement){
                largestElement = arr[i];
            }
        }
        System.out.println( "LargestElement :"+ largestElement );

    }
}
