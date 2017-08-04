package crackinginterview.linked_list;
//Use HashSet to record the values have occurred
import java.util.HashSet;

public class removeDups {
	static void remove_dups_1(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while(n != null) {
			if(set.contains(n.data)) {
				//should not move previous
				previous.next = n.next;
			}
			else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	static void remove_dups_2(LinkedListNode n) {
		//no buffer
		while(n != null) {
			LinkedListNode runner = n;
			while (runner.next != null) {
				if(runner.next.data == n.data)
					runner.next = runner.next.next;
				else
					runner = runner.next;
			}
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListNode n1 = new LinkedListNode(1);
		LinkedListNode n2 = new LinkedListNode(2);
		LinkedListNode n3 = new LinkedListNode(2);
		LinkedListNode n4 = new LinkedListNode(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		remove_dups_2(n1);
		System.out.println(n1.data);
		System.out.println(n1.next.data);
		System.out.println(n1.next.next.data);
		System.out.println(n1.next.next.next.data);
		
		// TODO Auto-generated method stub

	}

}

