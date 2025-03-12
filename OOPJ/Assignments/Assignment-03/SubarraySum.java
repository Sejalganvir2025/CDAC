class SubarraySum {
    public static void findSubarray(int[] arr, int sum) {
        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > sum && start <= end) {
                currentSum -= arr[start++];
            }

            if (currentSum == sum) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        findSubarray(arr, sum);
    }
}
