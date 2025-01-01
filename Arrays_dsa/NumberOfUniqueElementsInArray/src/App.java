public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] arr = {1,2,2,3,3,4,4,4,4,4,5,7,7,7};
        NumberOfUniqueElement(arr);
    }

    public static void NumberOfUniqueElement(int[] arr){
        int i = 0;

        for( int j=1; j<arr.length; j++){
            if( arr[j] != arr[i] ){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("Length of Unique arr : "+ i+1);
        System.out.println("arr "+ arr.toString());
    }

}
