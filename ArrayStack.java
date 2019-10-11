import java.util.Arrays;

@SuppressWarnings("unchecked")

public class ArrayStack<T> implements Stack<T>{

	protected int top = -1;
	protected int bottom = 0;
	protected T[] array;

	public ArrayStack(){
		T[] array = (T[]) new Object[10];
		top = -1;
	}
	public void push(T item){
		if (top==array.length-1)
			growArray();
		top++;
		array[top] = item;

	}
	public T pop() throws Exception{
		if (empty())
			throw new Exception("Stack is empty");
		return array[bottom--];
	}
	public T peek() throws Exception{
		if (empty()){
			throw new Exception("Stack is empty");
		}
		else{
			return array[top];
		}
	}
	public boolean empty(){
		return (top == -1);
	}
	public void growArray(){
		array = Arrays.copyOfRange(array, 0, array.length+1);
	}





}