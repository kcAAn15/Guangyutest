package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import bin.Guangyu;

public class GuangyuTest {
	private Guangyu gy;
	@Before
	public void setUp() throws Exception {
	  gy = new Guangyu();
	}

	@Test
	public void testRun1() {
		
		assertEquals(0, gy.run(""));
	}
	
	@Test
	public void testRun2() {
		
		assertEquals(1, gy.run("a"));
	}
	
	@Test
	public void testRun3() {
		
		assertEquals(3, gy.run("abcab"));
	}
	
	@Test
	public void testRun4() {
		
		assertEquals(4, gy.run("abbcdaddsa"));
	}
	
	@Test
	public void testRun5() {
		
		assertEquals(3, gy.run("bbbbbbbbbbbbbbbbbbbbbacbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"));
	}
}
