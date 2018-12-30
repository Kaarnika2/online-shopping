package net.kc.shoppingbackend.dao;

import java.util.List;

import net.kc.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();
	Category get(int id);
	
	
}
