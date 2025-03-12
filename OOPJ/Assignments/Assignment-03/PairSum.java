import java.util.HashSet;

class PairSum {
    public static void findPair(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = sum - num;
            if (set.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return;
            }
            set.add(num);
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        findPair(arr, target);
    }
}
