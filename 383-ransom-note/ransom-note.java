class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            have.put(c, have.getOrDefault(c, 0) + 1);
        }
        for(char key : need.keySet()){
            int neededCount = need.get(key);
            int haveCount = have.getOrDefault(key, 0);

            if(haveCount < neededCount){
                return false;
            }
        }
        return true;
    }
}