package com.cy.data_structure.linkedlist;

public class ReverseLinkedList {
	/**
	 * 递归反转，这个是从最后一个开始反转
	 * @param head
	 * @return
	 */
	public static Node reverse(Node head) {
		if(null == head || null == head.getNext()) {
			return head;
		}
		
		Node nn = reverse(head.getNext());
		
		head.getNext().setNext(head);
		head.setNext(null);
		return nn;
	}
	
	/**
	 * 非递归反转链表
	 * @param head
	 * @return
	 */
	public static Node reverse1(Node head) {
		if(null == head) {
			return null;
		}
		
		Node temp = head.getNext();
		Node index = head.getNext();
		
		Node pre = head;
		pre.setNext(null);
		
		
		while(null != index) {
			temp = index.getNext();
			index.setNext(pre);
			pre = index;
			index = temp;
		}
		
		return pre;
	}
	
	public static void main(String[] args) {
		Node head = new Node("a", null);
		Node head1 = new Node("b", null);
		Node head2 = new Node("c", null);
		Node head3 = new Node("d", null);
		
		head.setNext(head1);
		head1.setNext(head2);
		head2.setNext(head3);
		
		
		Node h = reverse1(head);
		
		
		while(null != h) {
			System.out.print(h.getData() + " --> ");
			h = h.getNext();
		}
	}
}
