
public class ChildLinkedList {
	private Child first;
	
	
	/**
	 * Class constructor
	 */
	public ChildLinkedList() {
		this.first = null;
	}
	
	
	/**
	 * Check if the linked list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return this.first == null;
	}
	
	
	/**
	 * Insert first child into the linked list
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public void insertFirst(String firstName, String lastName, int age) {
		Child newChild = new Child(firstName, lastName, age);
		newChild.next = this.first;
		this.first = newChild;
	}
	
	
	/**
	 * Delete first child from the linked list
	 * @return
	 */
	public Child deleteFirst() {
		Child temp = this.first;
		this.first = this.first.next;
		return temp;
	}
	
	
	/**
	 * Display all the children in the linked list
	 */
	public void displayChildren() {
		Child currentChild = this.first;
		while(currentChild != null) {
			System.out.println("Full names: "+currentChild.getFullName()+" Age: "+currentChild.getAge());
			currentChild = currentChild.next;
		}
	}
}
