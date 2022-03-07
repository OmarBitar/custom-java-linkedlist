public class ObjectsList {

	class LinkedNode {
		Object data;
		LinkedNode next, previous = null;

		LinkedNode(Object data) { this.data = data; }
	}
	LinkedNode head, tail = null;
	private int length = 0;

	public void append(Object data) {
		if(head == null) {
			head = tail = new LinkedNode(data);
		} else {
			tail.next = new LinkedNode(data);
			tail = tail.next;
		}
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

	public int getLength() { return this.length; }
}
