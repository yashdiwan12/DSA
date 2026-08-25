class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if (num > 0 && num % k == 0) {
                hs.add(num / k);
            }
        }

        for (int i = 1; ; i++) {
            if (!hs.contains(i)) {
                return i * k;
            }
        }   
    }
}