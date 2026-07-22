class Solution {
     public static void solve(int[] candidates,int target,int index,List<List<Integer>> ans,List<Integer>output,int count,int k){
        if(count>k) return; // number of candidates shuold be equal to k if not possible return
        if(count==k && target==0){
            ans.add(new ArrayList<>(output));
            return; 
        }
        if(index>=candidates.length) return;
        if(target<0) return;
        output.add(candidates[index]);
        solve(candidates,target-candidates[index],index+1,ans,output,count+1,k); // count ++
        output.remove(output.size()-1);
        while(index+1<candidates.length && candidates[index]==candidates[index+1]){ // may include or not because i have created candidates where no duplicates are present
            index++;
        }
        solve(candidates,target,index+1,ans,output,count,k);
       
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int[]candidates = {1,2,3,4,5,6,7,8,9};
        int count =0;
        int target=n;
        int index=0;
        solve(candidates,target,index,ans,output,count,k);
        return ans;
    }
}
