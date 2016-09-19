
import java.util.EmptyStackException;

public class ListStack implements DStack {

	private Node first;

	/**
	 * Constructs an empty list stack
	 */
	public ListStack() {
		first = null;
	}

	/**
	 * Adds the element to the top of stack
	 * 
	 * @param value
	 *            the value to be added to the top of stack
	 */
	public void push(double value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.next = first;
		first = newNode;
	}

	/**
	 * Removes the element from the top of the stack
	 * 
	 * @return the value at the top of the stack
	 */
	public double pop() {
		if (first == null) {
			throw new EmptyStackException();
		}
		double value = first.data;
		first = first.next;
		return value;
	}

	/**
	 * Checks if the stack is empty
	 * 
	 * @return true or false
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * Inner node class that create nodes to store the values
	 */
	class Node {
		public Double data;
		public Node next;
	}

	/**
	 * Looks at the top element without having to remove it.
	 * 
	 * @return the value on the top of the stack
	 */
	public double peek() {
		return first.data;

	}

}
