package tree;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }
 

public class BalancedBinaryTee {

	public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    } 
    
    public int height(TreeNode root) {
        if(root==null)return 0;
        
        int l= height(root.left);
        int r= height(root.right);
        
        if(l==-1 ||r==-1 || Math.abs(l-r)>1)return -1;
        
        return 1+Math.max(l,r);
    }
	
}
