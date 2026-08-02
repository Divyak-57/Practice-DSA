class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),i);
        }
        int td =0;
        for(int i=0;i<t.length();i++){
            int idx = m.get(t.charAt(i));
            td +=Math.abs(idx-i);
        }
        return td;
    }
}
