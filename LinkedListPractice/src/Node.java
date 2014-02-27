//Author: Andrew Durrer
//Date: 2/26/2014
public class Node {
	//A not contains the next node it is linked and data elements
	Node next;
	//using int for simplicity
	int data;
	
	//2 constructors for node, one with a next node and one without
	
	//With next Node available
	public Node(Node next, int data){
		this.next = next;
		this.data = data;
	}
	
	//Without next Node
	public Node(int data){
		this.next = null;
		this.data = data;
	}
	
	
	//Be able to get the data from the current node
	public int getData(){
		return data;
	}
	
	
	//Be able to get the next node
	public Node getNext(){
		return next;
	}
	
	//Be able to set the data in the node
	public void setData(int data){
		this.data = data;
	}
	
	//Be able to set the next node
	public void setNext(Node next){
		this.next = next;
	}
}
