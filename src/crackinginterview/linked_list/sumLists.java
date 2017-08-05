package crackinginterview.linked_list;
//recursive
public class sumLists {
	static LinkedListNode sum_lists_recursive(LinkedListNode n1, LinkedListNode n2, int carry) {
		if (n1 == null && n2 == null && carry == 0)
			return null;
		int value = carry;
		if (n1 != null)
			value += n1.data;
		if (n2 != null)
			value += n2.data;
		if (value>=10) {
			carry = 1;
			value = value%10;
		}
		else
			carry = 0;
		LinkedListNode n = new LinkedListNode(value);
		n.next = sum_lists_recursive(n1==null?null:n1.next, n2==null?null:n2.next, carry);
		return n;
	}
	
	static LinkedListNode sum_lists(LinkedListNode n1, LinkedListNode n2) {
		LinkedListNode dummy = new LinkedListNode(0);
		LinkedListNode cur = null;
		int sum = 0;
		int carry = 0;
		while (n1 != null && n2 != null) {
			sum = (n1.data + n2.data + carry)%10;
			if (n1.data + n2.data + carry >=10)
				carry = 1;
			else
				carry = 0;
			if (cur == null) {
				cur = new LinkedListNode(sum);
				dummy.next = cur;
			}
			else {
				cur.next = new LinkedListNode(sum);
				cur = cur.next;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		while (n1 != null) {
			cur.next = new LinkedListNode(n1.data + carry);
			n1 = n1.next;
			carry = 0;
		}
		while (n2 != null) {
			cur.next = new LinkedListNode(n2.data + carry);
			n2 = n2.next;
			carry = 0;
		}
		if(carry != 0) {
			cur.next = new LinkedListNode(carry);
		}
		return dummy;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode n1 = new LinkedListNode(7);
		LinkedListNode n2 = new LinkedListNode(2);
		LinkedListNode n3 = new LinkedListNode(3);
		LinkedListNode m1 = new LinkedListNode(4);
		LinkedListNode m2 = new LinkedListNode(5);
		LinkedListNode m3 = new LinkedListNode(6);
		LinkedListNode m4 = new LinkedListNode(7);
		n1.next = n2;
		n2.next = n3;
		m1.next = m2;
		m2.next = m3;
		m3.next = m4;
//		LinkedListNode newhead = sum_lists(n1,m1);
//		System.out.println(newhead.next.data);
//		System.out.println(newhead.next.next.data);
//		System.out.println(newhead.next.next.next.data);
//		System.out.println(newhead.next.next.next.next.data);
		LinkedListNode newhead = sum_lists_recursive(n1,m1,0);
		System.out.println(newhead.data);
		System.out.println(newhead.next.data);
		System.out.println(newhead.next.next.data);
		System.out.println(newhead.next.next.next.data);
	}

}
