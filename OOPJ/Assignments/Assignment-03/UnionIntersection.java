import java.util.*;

class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : arr1) union.add(num);
        for (int num : arr2) {
            if (!union.add(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
