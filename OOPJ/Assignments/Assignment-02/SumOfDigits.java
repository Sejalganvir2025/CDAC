class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345; // Change this value to test
        int sum = 0;

        while (num > 0) {
            sum += num % 10; // Extract last digit
            num /= 10; // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}
