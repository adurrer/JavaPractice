
public class LinkedList {
	//A linked list contains Nodes that are linked together by knowing the next node after the head node
	//If there there are no nodes currently, make sure to create a head node
	//Else make sure to append the next to the end of the list
	
	private Node head;
	private int nodecounter;
	
	//Create a list with a head node that has no content in it and sets the nodecounter to 0
	public LinkedList(){
		head = new Node(0);
		nodecounter = 0;
	}
	
	//Link list functionalities, add, delete, update node, size of list
	
	//adding a node with data
	public void add(int data){
		//Check to see if there are nodes available
		//If so traverse to the end of the linked list and append it to the last available node
		//else make it the head node
		Node temp = new Node(data);
		Node current = head;
		
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(temp);
		nodecounter++;
	}
	
	//adding a node without data
	public void add(){
		//Check to see if there are nodes available
		//If so traverse to the end of the linked list and append it to the last available node
		//else make it the head node
		Node temp = new Node(0);
		Node current = head;
		
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(temp);
		nodecounter++;
	}
	
	//add a node at a certain location
	public void add(int data, int index){
		Node temp = new Node(data);
		Node current = head;
		
		for(int i = 1; i < nodecounter && current.getNext() != null; i++){
			current = current.getNext();
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		nodecounter++;
	}
	
	//get a certain node in the list
	public int getData(int index){
		if(index <= 0){
			return 0;
		}
		
		
		Node current = head.getNext();
		for(int i = 1; i <index; i++){
			if(current.getNext() == null){
				return 0;
			}
			current = current.getNext(); 
		}
		
		return current.getData();
	}
	
	//remove a certain node in the list
	public void remove(int index){
		if(index <= 0 || index > getSize()){
			return;
		}
		
		Node current = head;
		for(int i = 1; i<index; i++){
			if(current.getNext() == null){
				return;
			}
			current= current.getNext();
		}
		current.setNext(current.getNext().getNext());
		nodecounter--;
	}
	
	//get the list's size
	public int getSize(){
		return nodecounter;
	}
}
