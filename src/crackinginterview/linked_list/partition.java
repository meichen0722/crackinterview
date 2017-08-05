package crack_interview.linked_list;
//append to a linkedlist: 
//keep track of tail, 
//tail.next = new_tail, tail = new_tail
public class partition {
	static LinkedListNode partition_fn(LinkedListNode n, int x) {
		LinkedListNode smallhead = null;
		LinkedListNode smalltail = null;
		LinkedListNode largehead = null;
		LinkedListNode largetail = null;
		while(n != null) {
			if (n.data < x) {
				if (smallhead == null) {
					smallhead = n;
					smalltail = n;
				}
				else {
					smalltail.next = n;
					smalltail = n; //update tail
				}
			}
			else {
				if (largehead == null) {
						largehead = n;
						largetail = n;
					}
					else {
						largetail.next = n;
						largetail = n;
					}
			}
			n = n.next;
		}
		smalltail.next = largehead;
		return smallhead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(4);
		LinkedListNode n3 = new LinkedListNode(3);
		LinkedListNode n4 = new LinkedListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		LinkedListNode newhead = partition_fn(n1, 3);
		System.out.println(newhead.data);
		System.out.println(newhead.next.data);
		System.out.println(newhead.next.next.data);
		System.out.println(newhead.next.next.next.data);
	}

}
