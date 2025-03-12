class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14, 17, 20};
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
    }
}
