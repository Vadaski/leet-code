package tencent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class BFS {
	public void bfSearch(Tree<Integer> node,int v) {
		LinkedList<Tree<Integer>> queue = new LinkedList<>();
		HashSet<Tree<Integer>> visited = new HashSet<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			final Tree<Integer> currentNode = queue.pop();
			boolean isVisited = !visited.add(currentNode);
			if(!isVisited) {System.out.println(currentNode.data);
			for (Tree<Integer> tree : currentNode.children) {
				queue.add(tree);
				}
			}
		}
	}
}

class Tree<T>{
	T data;
	ArrayList<Tree<T>> children;
}