class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        
        for (int num : arr) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // 3 is missing
        int n = 6;
        System.out.println("Missing Number: " + findMissing(arr, n));
    }
}
