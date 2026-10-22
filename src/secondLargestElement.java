public class secondLargestElement {
    public static void main(String[] args) {

        int[] nums = {8, 8, 7, 6, 5};

        int largestvalue = Integer.MIN_VALUE;
        int secondlargestvalue = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > largestvalue) {
                secondlargestvalue = largestvalue;
                largestvalue = nums[i];
            }
            else if (nums[i] > secondlargestvalue && nums[i] != largestvalue) {
                secondlargestvalue = nums[i];
            }
        }

        if (secondlargestvalue == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondlargestvalue);
        }
    }
}