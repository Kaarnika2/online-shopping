package net.kc.shoppingbackend.dao;

import java.util.List;

import net.kc.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	boolean add(Category category);
	
	List<Category> list();
	Category get(int id);
	
	
}
