
public interface DStack {
    /** 
     * is empty?
     */
    public boolean isEmpty();

    /**
     * push the element on the top of stack
     */
    public void push(double d);

    /**
     * pop
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     */
    public double pop();

    /**
     * peek
     * @throws EmptyStackException if stack is empty
     */
    public double peek();
}
