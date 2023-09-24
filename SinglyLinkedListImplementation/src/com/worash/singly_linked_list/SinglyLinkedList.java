package com.worash.singly_linked_list;

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	private int length;

	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	public void printList() {
		if (this.head == null) {
			System.out.println("the list is empty, please add some");
		}
		Node temp = this.head;
		System.out.println("the length of the list is " + this.length);
		while (temp != null) {
			System.out.println("Node is vale is " + temp.value);
			temp = temp.next;
		}

	}

	
	/*
	 * push  => Add node at the end of the singly linked list. 
	 * 
	 * Example: List: 1->2->3->4->5->NULL, value: 6 
	 *  Output: List: 1->2->3->4->5->6->NULL
	 *  Note:  the method return the added  node.
	 *   Example: 
	 *   node ={
	 *  value = 6
	 *  next = null
	 *  }
	 */

	public Node push(int value) {
		Node newNode = new Node(value);
		if (this.head == null) {
			this.head = newNode;
			this.tail = this.head;
		} else {
			Node temp = this.tail;
			temp.next = newNode;
			this.tail = newNode;
		}
		this.length++;

		return newNode;
	}

	/*
	 * pop => Remove the last node from the  singly linked list. 
	 * 
	 * Example: List: 1->2->3->4->5->NULL
	 *  Output: List: 1->2->3->4->NULL
	 *  Note:  the method return the removed  node.
	 *   Example: 
	 *   node ={
	 *  value = 5
	 *  next = null
	 *  }
	 */
	public Node pop() {
		if (this.head == null) {
			return null;
		} else if (this.length == 1) {
			this.head = null;
			this.tail = null;
			this.length = 0;
			return this.head;
		} else {
			Node current = this.head;
			Node newTail = current;
			while (current.next != null) {
				newTail = current;
				current = current.next;
			}

			this.tail = newTail;
			this.tail.next = null;
			this.length--;
			return current;
		}

	}


	/*
	 * unshift => Add node at the beginning of the list singly linked list. 
	 * 
	 * Example: List: 1->2->3->4->5->NULL, value: 6 
	 *  Output: List: 6->1->2->3->4->5->NULL
	 *  Note:  the method return the added  node.
	 *   Example: 
	 *   node ={
	 *  value = 6
	 *  next = {
	 *  value =1 
	 *  next = ..
	 *  }
	 */
	public Node unshift(int value) {
		Node newNode = new Node(value);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;

		} else {
			newNode.next = this.head;
			this.head = newNode;
		}
		this.length++;
		return newNode;

	}

	/*
	 * shift => Remove  the fist node from the singly linked list. 
	 * 
	 * Example: List: 1->2->3->4->5->NULL
	 *  Output: List: 2->3->4->5->NULL
	 *  Note:  the method return the removed  node.
	 *   Example: 
	 *   node ={
	 *  value = 1
	 *  next = {
	 *  value =2
	 *  next  = ..
	 *  }
	 */
	public Node shift() {
		if (this.head == null) {
			return null;
		}
		Node temp = this.head;
		if (this.length == 1) {
			this.head = null;
			this.tail = null;
			this.length = 0;
		} else {

			this.head = temp.next;
			this.length--;
		}

		return temp;
	}
	
	/*
	 * getSize => return the length of the list singly linked list. 
	 * 
	 * Example: List: 1->2->3->4->5->NULL
	 *  Output: 5
	 */
	public int getSize() {
		return this.length;
	}


	/*
	 *  getFirst => return the first node (head) from the singly linked list
	 * Example: List: 1->2->3->4->5->NULL
	 *  Output: List: node ={
	 *  value = 1
	 *  next = {
	 *  value =2
	 *  next  = ..
	 *  }
	 */

	public Node getFirst() {
		return this.head;
	}

	
	/*
	 *   getLast => return the last node (tail) from the  singly linked list
	 * Example: List: 1->2->3->4->5->NULL
	 *  Output: List: node ={
	 *  value = 5
	 *   next = null
	 *  }
	 */
	public Node getLast() {
		return this.tail;
	}
	/*  isEmpty() => return if the list is not empty, return true if the list has no data

	 * get => return the node at specific index singly linked list. 
	 * 
	 * Example:  Input =>  List: 1->2->3->4->5->NULL, 
	 *  Output=> false
	Input =>  List: null 
	 *  Output=> true
	 */
	
	public boolean isEmpty() {
		 if(this.length > 0) {
			 return false;
		 }
		return true;
		
	}
	
	/*
	 * get => return the node at specific index singly linked list. 
	 * 
	 * Example:  Input =>  List: 1->2->3->4->5->NULL, find value at index  one(1) lie indexing start from zero (0)
	 *  Output=> List: 2
	 *  Note:  the method return the node found.
	 *   Example: 
	 *   node ={
	 *  value = 2
	 *  next = {
	 *  value =3
	 *  next  = ..
	 *  }
	 */
	public Node get(int index) {

		if (index < 0 || index >= this.length) {
			throw new IndexOutOfBoundsException("No node at: " + index);
		}
		int count = 0;
		Node current = this.head;
		while (count != index) {
			current = current.next;
			count++;

		}

		return current;
	}

	
	/*
	 * set => update the value of the node at specific index singly linked list. 
	 * 
	 * Example:  Input =>  List: 1->2->3->4->5->NULL, example: update value at index  one(1) with value  10, lie indexing start from zero (0)
	 *  Output=> List: 1->10->3->4->5->NULL,
	 *  Note:  the method return boolean
	 */
	public boolean set(int index, int value) {

		Node node = this.get(index);
		if (node != null) {
			node.value = value;
			return true;
		}
		return false;
	}

	/*
	 * add => insert node at specific index singly linked list. 
	 * 
	 * Example:  Input =>  List: 1->2->3->4->5->NULL, example: update value at index  one(1) with value  10, lie indexing start from zero (0)
	 *  Output=> List: 1->10->2->3->4->5->NULL,
	 *  Note:  the method return boolean
	 */
	public boolean add(int index, int value) {

		if (index < 0 || index > this.length) {
			return false;
		}

		else if (index == 0) {
			this.unshift(value);
			return true;
		} else if (index == this.length) {
			this.push(value);
			return true;
		} else {
			Node newNode = new Node(value);
			Node prevNode = this.get(index - 1);
			newNode.next = prevNode.next;
			prevNode.next = newNode;
			this.length++;
			return true;
		}
	}


	/*
	 * remove => delete node at specific index singly linked list. 
	 * 
	 * Example:  Input =>  List: 1->2->3->4->5->NULL, example: update value at index  one(1), lie indexing start from zero (0)
	 *  Output=> List: 1->3->4->5->NULL,
	 *  Note:  the method return boolean
	 */
	public boolean remove(int index) {
		if (index < 0 || index >= this.length || this.length == 0) {
			return false;
		} else if (index == 0) {
			this.shift();
			return true;
		} else if (index == this.length - 1) {
			this.pop();
			return true;
		} else {
			Node prevNode = this.get(index - 1);
			Node temp = prevNode.next;
			prevNode.next = temp.next;
			temp = null;
			this.length--;
			return true;
		}

	}

	/*
	 * Reverse a singly linked list. Example: Input: 1->2->3->4->5->NULL Output:
	 * 5->4->3->2->1->NULL
	 */

	public boolean  reverse() {
		if(this.length ==  0 || this.length ==  1) {
			System.out.println("The list can not be revesable");
			return false;
		}
		Node  temp  = this.head;
		this.head = this.tail;
		this.tail   = temp;
		Node  after  = null;
		Node  prev  = null;
		for(int i  = 0; i< this.length;  i++) {
			after  = temp.next;
			temp.next = prev;
			prev = temp;
			temp = after;
		}
		return true;
		
	}


	
}
