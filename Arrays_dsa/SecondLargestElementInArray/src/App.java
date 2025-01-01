public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = {3,2,1,0,5,4};
        secondLargestElementArray(arr);
        secondSmallestElementArray(arr);
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

    public static void secondSmallestElementArray(int[] arr){
        int smallestElement = arr[0];
        int secondSmallestElement = 999;

        for(int i=0; i<arr.length; i++){
            if( arr[i] < smallestElement ){
                secondSmallestElement = smallestElement;
                smallestElement = arr[i];
            }else if( arr[i] > smallestElement && arr[i] < secondSmallestElement){
                secondSmallestElement = arr[i];
            }
        }
        System.out.println("Second smallest :"+ secondSmallestElement);
    }

}

