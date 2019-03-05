package tencent;
import java.util.HashSet;

public class DFS {
	public void dfsSearch(Tree<Integer> node,HashSet<Tree<Integer>> visited){
		visited.add(node);
		//process node
		System.out.println(node.data);
		for (Tree<Integer> tree : node.children) {
			if(!visited.contains(tree)) 
				dfsSearch(tree, visited);
		}
	}
}
