public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = {3,2,1,5,4};
        secondLargestElementArray(arr);
    }

    public static void secondLargestElementArray(int[] arr){

        int largestElement = arr[0];
        int secondLargestElement = -1;

        for( int i=1 ; i<arr.length; i++){
            if( arr[i] > largestElement ){
                secondLargestElement = largestElement; 
                largestElement = arr[i];
            }
            else if( arr[i] < largestElement && arr[i] > secondLargestElement ){
                secondLargestElement = arr[i];
            }
        }
        System.out.println("Second Largest :"+ secondLargestElement);
    }
}
