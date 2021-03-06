package linkedlist;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Node {

	Node next;
	int data;

	Node(int data) {
		this.data = data;

	}

}

public class LinkedList {
	public  Node head;

	public  void addData(LinkedList list,int data) {

		Node newNode = new Node(data);
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node temp = list.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	public  void printList(LinkedList list) {
		// Iterator it=((Object) list).iterator();
		Node temp = list.head;
		while (temp != null) {
			System.out.print(temp.data + "----");
			temp = temp.next;
		}
		System.out.println("");
	}

	public static void main(String... strings) {
		System.out.println("Hellooooo");
		LinkedList list = new LinkedList();
		list.addData(list,2);
		list.addData(list,4);
		list.addData(list,24);
		System.out.println("Inserting");
		list.printList(list);

		list.remove(4);
		System.out.println("");
		System.out.println("Deleting");
		list.printList(list);
		System.out.println("Deleting 2");
		list.remove(2);
		list.printList(list);
		System.out.println("Inserting");
		list.addData(list,12);
		list.addData(list,42);
		list.addData(list,25);
		list.printList(list);

	}

	public  void remove(int i) {
		// TODO Auto-generated method stub

		Node temp = head;
		if (head.data == i) {
			head = head.next;
		} else {
			while (temp.next != null) {
				if (temp.next.data == i) {
					Node temp1 = temp.next.next;
					temp.next = temp1;
				}
				temp = temp.next;
			}
		}

	}

}
