import java.util.HashMap;

public class ObjectsList {

	private static class LinkedNode {
		Object data;
		LinkedNode next, previous = null;

		LinkedNode(Object data) { this.data = data; }
	}

	private LinkedNode head, tail = null;
	private HashMap<Integer, LinkedNode> indices = new HashMap<>();
	private int length = 0;

	public void append(Object data) {
		if(head == null) {
			head = tail = new LinkedNode(data);
		} else {
			tail.next = new LinkedNode(data);
			tail = tail.next;
		}
		indices.put(length,tail);
		this.length++;
	}

	public Object peek() {
		if (tail != null) return tail.data;
		return null;
	}

	public void printData() {
		if (head != null) {
			LinkedNode traversalNode = head;
			while (traversalNode != null) {
				System.out.println(traversalNode.data);
				traversalNode = traversalNode.next;
			}
		}
	}

	public Object get(Integer index) {
		return indices.get(index).data;
	}
	public int getLength() { return this.length; }
}
