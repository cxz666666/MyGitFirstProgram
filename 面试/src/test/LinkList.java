package test;

public class LinkList {
	public static void main(String[] args) {
		Node node = new Node();
		node.num = 1;
		node.num = 3;
		node.num = 5;
		node.num = 7;
		node.num = 9;
		System.out.println("最后一个节点为：" + node.getLastNode(node));
	}
}

class Node {
	int num;
	Node nextNode;

	public Node getLastNode(Node firstNode) {
		if (firstNode == null)
			return null;
		Node lastNode = null;
		while (firstNode != null) {
			lastNode = firstNode;
			firstNode = firstNode.nextNode;
		}
		return lastNode;
	}
}
