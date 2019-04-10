package com.operr;

/*
 * Design an int type singly linkedlist class, and then implement some functions below using the self designed class.
 * Can not use Java built in List interface
	1. Append an element into the linkedlist
	2. Remove the tail element from a linkedlist
	3. Remove all element in the linkedlist that is great than a target value
*/

public class CustomLinks {
	
	Node head; // head of list 
	 
    public CustomLinks() {    	
    	
    }
	
    // Method to insert a new node 
    public CustomLinks append(int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (this.head == null) { 
            this.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = this.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return this; 
    }
    
    //Remove item
    public CustomLinks removeLast() {
    	
    	// Store head node 
        Node currNode = this.head, prev = null;   	
    	
        while (currNode.next != null) { 
        	prev = currNode;
        	currNode = currNode.next; 
        }
        
        prev.next = currNode.next; 
        
    	return this;
    }
    
    //Remove all
    public CustomLinks removeAll() {
    	
    	Node currNode = this.head;
    	while (currNode.next != null) { 
    		removeLast(); 
        }
    	this.head = null;
    	
    	return this;
    }
    
    // Method to print the LinkedList. 
    public static void printList(CustomLinks list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList
        if(currNode != null) {
        	while (currNode != null) { 
                // Print the data at current node 
                System.out.print(currNode.data + " "); 
       
                // Go to next node 
                currNode = currNode.next;
            } 
        }
        else {
        	System.out.print("No data "); 
        }
        
    } 

}
