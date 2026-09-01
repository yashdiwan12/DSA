class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(candidates);
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return new ArrayList<>(res);
    }

    private void backtrack(HashSet<List<Integer>> res, List<Integer> tempList, int[] candidates, int remain, int start){
        if(remain < 0) return;
        if(remain == 0) res.add(new ArrayList<>(tempList));

        else{
            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i - 1]){
                    continue;
                }
                if(candidates[i] > remain){
                    break;
                }
                tempList.add(candidates[i]);
                backtrack(res, tempList, candidates, remain - candidates[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}