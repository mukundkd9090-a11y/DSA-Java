public class Find_peakElement {
    public static int peakElementArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int result = peakElementArray(arr);

        System.out.println("Peak Element Index: " + result);
    }
}
