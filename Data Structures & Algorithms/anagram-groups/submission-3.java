class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            int[] arr = new int[26];

            for(char c : s.toCharArray()){
                arr[c - 'a']++;
            }

            res.putIfAbsent(Arrays.toString(arr), new ArrayList<>());

            res.get(Arrays.toString(arr)).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
