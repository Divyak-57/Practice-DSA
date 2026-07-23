class Solution {
    public void solve(String s, int i, StringBuilder op, List<String> ans){
        if(i>=s.length()){
           ans.add(op.toString());
            return;
        }
        op.append(s.charAt(i));
        solve(s,i+1,op,ans);
        op.deleteCharAt(op.length()-1);
        solve(s,i+1,op,ans);
        
    }
    public List<String> powerSet(String s) {
        List<String> ans = new ArrayList<>();
        StringBuilder op = new StringBuilder();
        solve(s,0,op,ans);
        Collections.sort(ans);
        return ans;
        
    }
}
