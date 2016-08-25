package pack1;

public interface QueueInterface<E>
{
	boolean add(E o);
	boolean offer(E o);

	E peek();
	E element();

	E poll();
	E remove();

	boolean empty();

	int size();
	E get(int x);
}