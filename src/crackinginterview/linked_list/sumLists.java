package crack_interview.linked_list;

public class sumLists {
	static LinkedListNode sum_lists(LinkedListNode n1, LinkedListNode n2) {
		LinkedListNode newhead = null;
		LinkedListNode cur = newhead;
		int sum = 0;
		int carry = 0 ;
		while (n1 != null && n2 != null) {
			carry = 0;
			sum = (n1.data + n2.data + carry)%10;
			if (sum >=10)
				carry = 1;
			if (cur == null)
				cur = new LinkedListNode(sum);
			else 
				cur.next = new LinkedListNode(sum);
				cur = cur.next;
			n1 = n1.next;
			n2 = n2.next;
		}
//		while (n1 != null) {
//			n.next = new LinkedListNode(n1.data);
//			n1 = n1.next;
//		}
//		while (n2 != null) {
//			n.next = new LinkedListNode(n2.data);
//			n2 = n2.next;
//		}
		return newhead;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(2);
		LinkedListNode n3 = new LinkedListNode(3);
		LinkedListNode m1 = new LinkedListNode(4);
		LinkedListNode m2 = new LinkedListNode(5);
		LinkedListNode m3 = new LinkedListNode(6);
		n1.next = n2;
		n2.next = n3;
		m1.next = m2;
		m2.next = m3;
		LinkedListNode newhead = sum_lists(n1,m1);
		System.out.println(newhead.data);
		System.out.println(newhead.next.data);
		System.out.println(newhead.next.next.data);
	}

}
