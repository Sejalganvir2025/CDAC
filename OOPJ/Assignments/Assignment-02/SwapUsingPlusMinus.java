class SwapUsingPlusMinus {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a += b; // a = a + b
        b = a - b; // b = (a + b) - b -> original a
        a -= b; // a = (a + b) - a -> original b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
