package Cracking;
public class linked<Integer> {
	
	private int data;
	//pointer to the next node
	private linked<Integer> head;
	private linked<Integer> nextNode;
	
	public linked(int data) {
		this.data = data;

		nextNode = null;
	}
	
	
	public int getData() {
		return data;
	}

	//set data to something
	public void setData(int data) {
		this.data = data;
	}
	
	public linked<Integer> getNextNode(){
		return nextNode;
	}

	//Helper to add data
	public void setNextNode(linked<Integer> nextNode) {
		this.nextNode = nextNode;
	}

	//add data to linkedList
	public void addNode(int data){


		linked<Integer> new_node = new linked<>(data);

	}
	
	@Override
	public String toString() {
		return ("Node { data=" + data+ "}");
	}
	
	public static void main(String[] args) {
		
		//Declare a linked class
		//linked<Integer> judas = new linked<Integer>(15);
	}
}
