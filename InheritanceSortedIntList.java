
/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// Note: keeps track of ATTEMPTS, not successful insertions.


public class InheritanceSortedIntList extends SortedIntList {
	// Write your implementation below with API documentation
	
	private int totalAdded;
	
	
	public InheritanceSortedIntList() {
		totalAdded = 0;
	}
	
	
	public boolean add(int newElement) {
		totalAdded++;
		return super.add(newElement);
	}
	
	public boolean addAll(IntegerList newElements) {
		totalAdded += newElements.size();
		return super.addAll(newElements);
	}
	
	
	public int getTotalAdded() {
		return totalAdded;
	}
}