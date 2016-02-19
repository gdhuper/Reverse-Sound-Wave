
//import java.util.Arrays;
import java.util.EmptyStackException;

public class GArrayStack<T> implements DStack {
	private int top; // variable to keep track of top element
	int size = 10;
	Object[] stack;

	/**
	 * Construct an array stack with initial size 10
	 */
	public GArrayStack() {
		
		stack = new Object[size];
		top = -1;
	}

	/**
	 * Resizes the array stack if it is full
	 * 
	 * @param newSize
	 *            new size of the array stack
	 */
	public void resize(int newSize) {
		Object[] temp = new Object[newSize];
		for (int i = 0; i < stack.length; i++) {
			temp[i] = stack[i];
		}
		stack = temp;
		size = stack.length;
	}

	/**
	 * Adds a value to the top of the stack
	 * 
	 * @value the value to be added to the top
	 */
	public void push(double value) {

		if (top + 1 == stack.length) {
			resize(stack.length * 2);

		}
		top++;
		stack[top] = value;

	}

	/**
	 * Removes element from the top of the stack
	 * 
	 * @return the value on the top
	 */
	public double pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			
			Object value = stack[--top];
			return (double) value;
		}
	}

	/**
	 * Checks if the stack if empty or not
	 * 
	 * @return true if stack is empty and false if it is not
	 */
	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * Looks at the object on the top of stack without removing it.
	 * 
	 * @return the value at the top
	 */
	public double peek() {
		if (top == -1) {
			throw new EmptyStackException();

		}

		return (double) stack[top];
	}

}