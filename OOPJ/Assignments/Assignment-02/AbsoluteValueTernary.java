class AbsoluteValueTernary {
    public static void main(String[] args) {
        int num = -25; // Change this value to test
        int absValue = (num < 0) ? -num : num;

        System.out.println("Absolute value: " + absValue);
    }
}
