import java.util.Arrays;

class MaxProductPair {
    public static void findMaxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2]; // Max two positive numbers
        int product2 = nums[0] * nums[1]; // Min two negative numbers

        if (product1 > product2) {
            System.out.println("Pair is (" + nums[n - 2] + ", " + nums[n - 1] + "), Maximum Product: " + product1);
        } else {
            System.out.println("Pair is (" + nums[0] + ", " + nums[1] + "), Maximum Product: " + product2);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        findMaxProduct(nums);
    }
}
