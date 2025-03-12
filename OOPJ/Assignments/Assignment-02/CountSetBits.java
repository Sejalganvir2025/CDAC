class CountSetBits {
    public static void main(String[] args) {
        int num = 13; // Change this value to test
        int count = 0;

        while (num > 0) {
            num = num & (num - 1); // Clears the rightmost set bit
            count++;
        }

        System.out.println("Number of set bits: " + count);
    }
}
