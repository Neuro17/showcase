package foo.nerz.bonboard.dao;

import java.util.List;

import foo.nerz.bonboard.entity.Post;
import foo.nerz.bonboard.util.GenericDao;



public interface PostDao extends GenericDao<Post,Long> {

	public int getCountByType(int tipo);

	public List<Post> get10PostPaged(int tipo,int page);
	
	
	
}