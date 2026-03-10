import java.util.ArrayList;


/* 
 * This is a hasty implementation of SortedIntList so I could use it in the Inheritance/Delegation classes. 
 * Does not have all features yet
*/


public class SortedIntList extends AbstractIntList {
	
	private ArrayList<Integer> elements;
	
	
	public SortedIntList() {  // Constructor
		elements = new ArrayList<Integer>();
	}
	
	
	@Override
	public boolean add(int num) {
		return elements.add(num);
	}

	@Override
	public int get(int index) {
		return elements.get(index);
	}

	@Override
	public boolean remove(int num) {
		return elements.remove((Integer) num);  // TODO: don't know if this works yet. We are removing by object, not index
	}

	@Override
	public boolean removeAll(IntegerList list) {
		// TODO: probably use a getAll() method
		return false;
	}

	@Override
	public int size() {
		return elements.size();
	}
	
	
	
}
