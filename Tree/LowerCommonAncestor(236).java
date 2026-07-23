// taking extra space in this approach
class Solution {
    public boolean getpath(TreeNode root,TreeNode n,List<TreeNode> path){
        if(root==null) return false; // no value is there
        path.add(root); // add root in the path
        if(root==n) return true; // got expected value
        if(getpath(root.left,n,path)||getpath(root.right,n,path)) return true; //return early if found in left subtree 
        path.remove(path.size()-1); // backtrack
        return false; // if not found
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();
        getpath(root,p,path1);
        getpath(root,q,path2);
        int i=0;
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i) != path2.get(i)) break;
        }
        TreeNode lowestCommonAncestor = path1.get(i-1);
        return lowestCommonAncestor;
    }
}


// no extra space is needed in this approach
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q) return root;
        TreeNode l = lowestCommonAncestor(root.left,p,q); // find in leftsubtree
        TreeNode r = lowestCommonAncestor(root.right,p,q); // find in right subtree
        if(r==null) return l; // get in leftsubtree return left
        if(l==null) return r; // get in rightsubtree return right
        return root; // otherwise root
    }
}
