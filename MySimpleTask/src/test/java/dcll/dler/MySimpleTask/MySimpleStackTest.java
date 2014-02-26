package dcll.dler.MySimpleTask;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dcll.dler.MySimpleStack.Item;
import dcll.dler.MySimpleStack.MySimpleStack;
import dcll.dler.MySimpleStack.SimpleStack;

public class MySimpleStackTest {

	SimpleStack mStack;
	
	@Before
	public void setup(){
		
		mStack = new MySimpleStack();
	}
	
	@Test
	public void test() {
	
		assertTrue(mStack.isEmpty());
		
		mStack.push(new Item(1));
		
		assertFalse(mStack.isEmpty());
		
		mStack.push(new Item(2));
		
		assertEquals(2, mStack.getSize());
		
		assertEquals(2, mStack.pop().getValue());
		
		assertEquals(1, mStack.getSize());
		
		assertEquals(1, mStack.peek().getValue());
		
		assertEquals("TROLOLO", mStack.trololo());
	}

}
