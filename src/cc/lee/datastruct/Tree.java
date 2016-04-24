package cc.lee.datastruct;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	public static void main(String[] args) {
		TreeNode<String> root = new TreeNode<String>("A");
		TreeNode<String> nodeB = new TreeNode<String>("B");
		TreeNode<String> nodeC = new TreeNode<String>("C");
		TreeNode<String> nodeD = new TreeNode<String>("D");
		TreeNode<String> nodeE = new TreeNode<String>("E");
		TreeNode<String> nodeF = new TreeNode<String>("F");
		TreeNode<String> nodeG = new TreeNode<String>("G");
		TreeNode<String> nodeH = new TreeNode<String>("H");
		TreeNode<String> nodeI = new TreeNode<String>("I");
		root.leftChild = nodeB;
		root.rightChild = nodeD;
		nodeB.rightChild = nodeC;
		nodeD.leftChild = nodeE;
		nodeD.rightChild = nodeF;
		nodeF.leftChild = nodeG;
		nodeF.rightChild = nodeI;
		nodeG.rightChild = nodeH;

		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		levelOrder(root);
	}

	/**
	 * 前序遍历二叉树
	 * 
	 * @param root
	 */
	public static void preOrder(TreeNode<String> root) {
		if (null == root)
			return;

		System.out.print(root.data);

		if (null != root.leftChild)
			preOrder(root.leftChild);

		if (null != root.rightChild)
			preOrder(root.rightChild);
	}

	/**
	 * 中序遍历二叉树
	 * 
	 * @param root
	 */
	public static void inOrder(TreeNode<String> root) {
		if (null == root)
			return;

		if (null != root.leftChild)
			inOrder(root.leftChild);

		System.out.print(root.data);

		if (null != root.rightChild)
			inOrder(root.rightChild);
	}

	/**
	 * 后续遍历二叉树
	 * 
	 * @param root
	 */
	public static void postOrder(TreeNode<String> root) {
		if (null == root)
			return;

		if (null != root.leftChild)
			postOrder(root.leftChild);

		if (null != root.rightChild)
			postOrder(root.rightChild);

		System.out.print(root.data);
	}

	/**
	 * 层序遍历二叉树
	 * 
	 * @param root
	 */
	public static void levelOrder(TreeNode<String> root) {
		if (null == root)
			return;
		Queue<TreeNode<String>> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode<String> temp = queue.poll();
			System.out.print(temp.data);
			if (temp.leftChild != null)
				queue.offer(temp.leftChild);

			if (temp.rightChild != null)
				queue.offer(temp.rightChild);
		}

		for (TreeNode<String> treeNode : queue) {
			System.out.print(treeNode.data);
		}
	}

	private static class TreeNode<T> {
		public T data;
		public TreeNode<T> leftChild;
		public TreeNode<T> rightChild;

		public TreeNode(T data) {
			this.data = data;
		}
	}
}
