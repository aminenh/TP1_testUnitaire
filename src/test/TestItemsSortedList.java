package test;

import static org.junit.Assert.*;
import item.Item;
import item.ItemsSortedList;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestItemsSortedList {
	
	ArrayList <Item> list1, list2;
	ItemsSortedList items1, items2;
	
	@Before
	public void setUp() throws Exception {
		list1 = new ArrayList<Item>();
		list1.add(new Item("tofu",5));
		list1.add(new Item("tshirt",20));
		list1.add(new Item("jeans",30));
		list1.add(new Item("guitar",100));
		list1.add(new Item("byciclette",350));
		items1 = new ItemsSortedList(list1);
		
		list2 = new ArrayList<Item>();
		int b=0;
		for (int i=0; i<30; i++){
			b=b+10;
			list2.add(new Item("acarien",b));
		}
		items2 = new ItemsSortedList(list2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPremierElem() {
		assertTrue("tableau court",items1.isPresentArticle(new Item("tofu",5)));
		assertTrue("tableau long",items2.isPresentArticle(new Item("acarien",10)));
	}

	@Ignore
	public void testDernierElem() {
		assertTrue(items1.isPresentArticle(new Item("byciclette",350)));
		assertTrue("tableau long",items2.isPresentArticle(new Item("acarien",300)));
	}
	
	@Ignore
	public void testElemPair() {
		assertTrue(items1.isPresentArticle(new Item("jeans",30)));
		assertTrue("tableau long",items2.isPresentArticle(new Item("acarien",150)));
	}
	
	@Ignore
	public void testElemImpair() {
		assertTrue(items1.isPresentArticle(new Item("guitar",100)));
		assertTrue("tableau long",items2.isPresentArticle(new Item("acarien",200)));
	}
	
	@Ignore
	public void testErreurNom() {
		assertFalse(items1.isPresentArticle(new Item("jeanne",30)));
		assertFalse("tableau long",items2.isPresentArticle(new Item("acarienne",150)));
	}
	
	@Ignore
	public void testErreurPrix() {
		assertFalse(items1.isPresentArticle(new Item("guitar",150)));
		assertFalse("tableau long",items2.isPresentArticle(new Item("acarien",205)));
	}
}