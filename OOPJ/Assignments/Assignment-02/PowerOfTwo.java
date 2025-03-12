class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16; // Change this value to test
        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println(n + " is a power of 2: " + isPowerOfTwo);
    }
}
