lass Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(true){
            if(root.val < p.val && root.val < q.val) root = root.right;
            else if(root.val > p.val && root.val > q.val) root = root.left;
            else return root;
        }
    }
}



//TC : O(n), height of the tree in worst case --> O(logn) if the tree is sckewed 
// Sc : O(1), no extra space --> O(n) Stcak Space in recursive solution 