package com.worash.singly_linked_list;

import com.worash.singly_linked_list.SinglyLinkedList.Node;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		try {

			list.push(23);
			list.push(20);
			list.push(10);
			list.push(10);
			list.unshift(66);
			list.unshift(88);
			Node head = list.getFirst();
			Node tail = list.getLast();
//		Node node = list.pop();
//		Node node = list.shift();
//		boolean value = list.isEmpty();
//		boolean addFlag = list.add(2, 50);
//		boolean removeFlag  = list.remove(2);
//		boolean updateFlag = list.set(3, 60);

		
			System.out.println("--- before reverse ---- ");
			System.out.println("Head => " + head.value);
			System.out.println("Tail => " + tail.value);
			list.printList();
			// reverse 
			list.reverse();
			System.out.println("--- after reverse ---- ");
			System.out.println("Head => " + list.getFirst().value);
			System.out.println("Tail => " + list.getLast().value);
			list.printList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
