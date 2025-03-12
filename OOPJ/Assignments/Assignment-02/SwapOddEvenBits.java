class SwapOddEvenBits {
    public static void main(String[] args) {
        int x = 23; // Change this value to test
        int evenBits = x & 0xAAAAAAAA; // Mask for even bits
        int oddBits = x & 0x55555555;  // Mask for odd bits
        int result = (evenBits >> 1) | (oddBits << 1);

        System.out.println("Number after swapping odd and even bits: " + result);
    }
}
