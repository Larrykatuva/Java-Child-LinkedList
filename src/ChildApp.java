
public class ChildApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildLinkedList cll = new ChildLinkedList();
		
		cll.insertFirst("Ian", "Mumo", 3);
		cll.insertFirst("Beti", "Mutinda", 8);
		cll.insertFirst("Sheillah", "Ndanu", 5);
		cll.insertFirst("Grace", "Ndanu", 7);
		
		cll.displayChildren();
		
		cll.deleteFirst();
		System.out.println("");
		
		cll.displayChildren();
		

	}

}
