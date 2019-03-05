package tencent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

	
	 public List<List<Integer>> levelOrder(TreeNode root){
	        LinkedList<TreeNode> queue = new LinkedList();
	        List<List<Integer>> res = new ArrayList<>();
	        if(root==null) return res;
	        queue.add(root);
	        while(!queue.isEmpty()){
	            ArrayList<Integer> currentLevel = new ArrayList();
	            int range = queue.size();
	            for(int i = 0; i < range; i++){
	                TreeNode node = queue.pop();
	                currentLevel.add(node.val);
	                if(node.left!=null)queue.add(node.left);
	                if(node.right!=null)queue.add(node.right);
	            }
	            res.add(currentLevel);
	        }
	        return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
