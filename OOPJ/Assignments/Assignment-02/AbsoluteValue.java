class AbsoluteValue {
    public static void main(String[] args) {
        int num = -15; // Change this value to test
        int mask = num >> 31; // Extracts sign bit (0 for positive, -1 for negative)
        int absValue = (num + mask) ^ mask;

        System.out.println("Absolute value of " + num + " is: " + absValue);
    }
}
