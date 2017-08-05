package crack_interview.linked_list;
//requirement: head is not provided! Cannot know the prev node
//replace current node with next node, then delete next node == delete current node
public class deleteMiddleNode {
//	static void delete_node(LinkedListNode head, LinkedListNode delete) {
//		LinkedListNode n = head;
//		while(n.next != null) {
//			if (n.next == delete) {
//				n.next = delete.next;
//				return;
//			}
//			n = n.next;
//		}
//	}
	static boolean delete_node(LinkedListNode delete) {
		if (delete == null || delete.next == null)
			return false;
		delete.data = delete.next.data;
		delete.next = delete.next.next;
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(2);
		LinkedListNode n3 = new LinkedListNode(3);
		LinkedListNode n4 = new LinkedListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		delete_node(n2);
		System.out.println(n1.next.data);
	}

}
