package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> set = new ArrayList<>();
        ArrayList<Integer> copy = new ArrayList<>();
        helper(set, copy, nums);
        return set;
    }

    private static void helper(List<List<Integer>> set, List<Integer> copy, int[] nums) {

        if (copy.size() == nums.length) {
            set.add(new ArrayList<>(copy));
        } else {
            for (int i = 0; i < nums.length; i++) {

                if (copy.contains(nums[i])) {
                    continue;
                }
                copy.add(nums[i]);
                helper(set, copy, nums);
                 copy.remove(copy.size() - 1);
            }
        }
    }
}