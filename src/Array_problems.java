public class Array_problems {
//    static double getAverage(int[] arr){
//    double sum = 0;
//    for(int i = 0; i<arr.length; i++){
//        sum += arr[i];
//    }
//    int size = arr.length;
//    double avg = sum / size;
//    return avg;
//   }

//  array multiply by 10 and make new array

    
static int[] multiplyby10(int[] arr){
        int size = arr.length;
        int newArray[] = new int [size];
        for(int i = 0; i<arr.length; i++){
           int element = arr[i];
           int newElement = element * 10;
           newArray[i] = newElement;

        }
      return newArray;
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int ans[] = multiplyby10(arr);
        System.out.println("printing ans array : ");
        for(int i : ans){
            System.out.println(i);
        }

//       int arr [] = {2,4,6,6};
//        System.out.println(getAverage(arr));
    }
}




