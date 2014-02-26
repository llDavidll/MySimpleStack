package dcll.dler.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

public class MySimpleStack implements SimpleStack {

	private Stack<Item> mStack;

	public MySimpleStack() {

		mStack = new Stack<Item>();
	}

	@Override
	public boolean isEmpty() {

		return mStack.isEmpty();
	}

	@Override
	public int getSize() {

		return mStack.size();
	}

	@Override
	public void push(Item item) {

		mStack.push(item);
	}

	@Override
	public Item peek() throws EmptyStackException {

		return mStack.peek();
	}

	@Override
	public Item pop() throws EmptyStackException {

		return mStack.pop();
	}
	
	public String trololo(){
		
		return "TROLOLO";
	}

}
