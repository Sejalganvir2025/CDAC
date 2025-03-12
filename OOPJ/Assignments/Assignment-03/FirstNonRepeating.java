import java.util.*;
class FirstNonRepeating {
    public static int findFirstNonRepeating(int[] arr) {
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4, 1, 2};
        System.out.println("First Non-Repeating Element: " + findFirstNonRepeating(arr));
    }
}
