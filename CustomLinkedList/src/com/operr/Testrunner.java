package com.operr;

public class Testrunner {

	public static void main(String[] args) {
		
		/* Start with the empty list. */
		CustomLinks list = new CustomLinks(); 
  
        // Create List by insert the values 
        list = list.append(1); 
        list = list.append(2); 
        list = list.append(3); 
        list = list.append(4); 
        list = list.append(5); 
        list = list.append(6); 
        list = list.append(7);
        list = list.append(8); 
  
        // Print the LinkedList 
        CustomLinks.printList(list);
        
        System.out.println("");
        System.out.println("    -------------------------   "); 
        
        list = list.removeLast();
        CustomLinks.printList(list);
        
        System.out.println("");
        System.out.println("    -------------------------   "); 
        
        list = list.removeAll();
        CustomLinks.printList(list);
	}
	

}
