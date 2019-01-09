package net.kc.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kc.shoppingbackend.dao.CategoryDAO;
import net.kc.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kc.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");	
	}

	
/*	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Laptop");
		category.setDescription("This is some description for Laptop!");
		category.setImageURL("CAT_105.png");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
	
	
	}
    */

/*	@Test
	public void testGetCategory() {
		
		category = categoryDAO.get(3);
		
		
		assertEquals("Successfully fetched a single category from the table!","Mobile Phones",category.getName());
		
		
	}
	*/
	
/*  @Test
	public void testUpdateCategory() {
		
		category = categoryDAO.get(3);
		
		category.setName("Phone");
		
		assertEquals("Successfully updated a single category in the table!",true,categoryDAO.update(category));
		
		
	}
	*/
	
/*	@Test
	public void testDeleteCategory() {
		
		category = categoryDAO.get(3);
		assertEquals("Successfully deleted a single category in the table!",true,categoryDAO.delete(category));
		
		
	}
	*/
	
	@Test
	public void testListCategory() {
		
		category = categoryDAO.get(3);
		assertEquals("Successfully fetched the list of category from the table!",3,categoryDAO.list().size());
		
		
	}
	
	
}
