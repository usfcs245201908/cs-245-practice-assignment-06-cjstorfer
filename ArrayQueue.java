import java.util.Arrays;

@SuppressWarnings("unchecked")

public class ArrayQueue<T> implements Queue<T>{

	protected T[] array;
	protected int front;
	protected int back;


	public ArrayQueue(){
		T[] array = (T[]) new Object[10];
		front = 0;
		back = -1;
	}

	public void enqueue(T item){
		if (back + 1==array.length)
			growArray();
		back++;
		array[back] = item;	
	}
	public T dequeue() throws Exception{
		if (empty())
			throw new Exception("Queue is empty.");
		T item = array[front];
		front++;
		return item;
	}
	public boolean empty(){
		return front>back;
	}
	public void growArray(){
		array = Arrays.copyOfRange(array, 0, array.length+1);
	}
}
