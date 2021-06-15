package binarySearchTree;

import java.awt.List;
import java.util.ArrayList;

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


public class BalanceBST {
	
	ArrayList<TreeNode> list = new ArrayList();
	
	public TreeNode balanceBST(TreeNode root) {
		helper(root);
		if(list.size()==0)return null;
		
		return recursive(0,list.size()-1);
	}
	
	private void helper(TreeNode root) {
		if(root==null)return;
		
		helper(root.left);
		list.add(root);
		helper(root.right);
		root.left=null;
		root.right=null;
	}

	private TreeNode recursive(int si, int ei) {
		if(si>ei) return null;
		
		int mid=si+(ei-si)/2;
		TreeNode root = list.get(mid);
		root.left=recursive(si, mid-1);
		root.right = recursive(mid+1, ei);
		return root;
	}

	

}
