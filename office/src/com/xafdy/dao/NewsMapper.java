package com.xafdy.dao;

import com.xafdy.model.News;
import java.util.List;

public interface NewsMapper {
	void saveEntity(News news);
	
	List<News> searchEntity();
	
	void deleteEntity(Integer id);
	
	void updateEntity(News news);
	
	News getEntityById(Integer id);
}