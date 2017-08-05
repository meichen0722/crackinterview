package crack_interview.linked_list;
//runner
public class returnKthtoLast {
	static int kth_to_last(LinkedListNode n, int k) {
		if (n == null)
			return -1;
		LinkedListNode runner = n;
		for (int i=0;i<k;i++) {
			if (runner.next != null) 
				runner = runner.next;
			else
				return -1;
		}
		while (runner.next != null) {
			n = n.next;
			runner = runner.next;
		}
		return n.data;
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
		System.out.println(kth_to_last(n1,2));
	}

}
