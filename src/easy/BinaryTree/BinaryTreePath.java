package easy.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
	  public List<String> binaryTreePaths(TreeNode root) {
	        ArrayList<String> al=new ArrayList<>();
	       if(root!=null) treePath(root,"",al);
	        return al;
	    }
	    public static void treePath(TreeNode root, String str,ArrayList<String> al){
	        if(root.left!=null) treePath(root.left,str+root.val+"->",al);
	        if(root.right!=null) treePath(root.right,str+root.val+"->",al);
	        if(root.left==null&&root.right==null) al.add(str+root.val);
	    
	}
}
