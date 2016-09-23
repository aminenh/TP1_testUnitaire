package test;

import static org.junit.Assert.*;
import item.Item;
import item.ItemsSortedList;
import item.ItemsSortedList2;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestIsSortedList {
	
	ArrayList <Item> list0, list1, list2;
	ItemsSortedList items0, items1, items2;
	
	@Before
	public void setUp() throws Exception {
		list0 = new ArrayList<Item>();
		items0 = new ItemsSortedList(list0);
		
		list1 = new ArrayList<Item>();
		list1.add(new Item("guitar",100));
		list1.add(new Item("tofu",5));
		list1.add(new Item("byciclette",350));
		list1.add(new Item("jeans",30));
		list1.add(new Item("tshirt",20));
		items1 = new ItemsSortedList(list1);
		
		list2 = new ArrayList<Item>();
		list2.add(new Item("tofu",5));
		list2.add(new Item("tshirt",20));
		list2.add(new Item("jeans",30));
		list2.add(new Item("guitar",100));
		list2.add(new Item("byciclette",350));
		items2 = new ItemsSortedList(list2);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testEmptTab(){
		assertNotNull(items0.getPanierList());
	}

	@Test
	public void testNotSorted() {
		assertNotNull(items1.getPanierList());
	}
	
	@Test
	public void testSorted() {
		assertNotNull(items2.getPanierList());
	}
	
	
}
