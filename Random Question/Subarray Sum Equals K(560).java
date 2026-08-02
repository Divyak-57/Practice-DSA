class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int cs =0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            cs +=nums[i];
            if(m.containsKey(cs-k)){
                cnt+=m.get(cs-k);
            }
            m.put(cs, m.getOrDefault(cs, 0) + 1);
            
        }
        return cnt;
    }
}
