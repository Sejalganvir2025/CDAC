class DivisibilityByThree {
    public static boolean isDivisibleBy3(int num) {
        num = Math.abs(num); // Handle negative numbers
        while (num > 3) {
            int sum = 0;
            while (num > 0) {
                sum += num & 1; // Extract last bit
                num >>= 1; // Right shift (divide by 2)
            }
            num = sum;
        }
        return (num == 0 || num == 3);
    }

    public static void main(String[] args) {
        int num = 27; // Change this value to test
        System.out.println(num + (isDivisibleBy3(num) ? " is" : " is not") + " divisible by 3");
    }
}
