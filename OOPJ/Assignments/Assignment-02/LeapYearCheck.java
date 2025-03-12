class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024; // Change this value to test
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        System.out.println(year + " is " + (isLeap ? "a Leap Year" : "not a Leap Year"));
    }
}
