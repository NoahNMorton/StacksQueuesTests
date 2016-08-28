/*
*Author: Noah Morton
*Date created: 8/28/16, 12:56 PM
*Part of project: StackTester
*/

import java.util.ArrayList;

public class Stack<E> implements StackInterface<E> {

    private ArrayList<E> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }


    @Override
    public E push(E o) {
        stack.add(o);
        return o;
    }

    @Override
    public E peek() {
        return stack.get(0);
    }

    @Override
    public E pop() {
        return stack.remove(0);
    }

    @Override
    public boolean empty() {
        return stack.size()==0;
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public E get(int x) {
        return stack.get(x);
    }
}
