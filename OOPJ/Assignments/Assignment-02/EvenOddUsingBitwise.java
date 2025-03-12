class EvenOddUsingBitwise {
    public static void main(String[] args) {
        int n = 7; // Change this value to test
        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}
