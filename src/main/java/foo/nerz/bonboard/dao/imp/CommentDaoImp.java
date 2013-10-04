package foo.nerz.bonboard.dao.imp;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import foo.nerz.bonboard.dao.CommentDao;
import foo.nerz.bonboard.entity.Comment;
import foo.nerz.bonboard.util.GenericDaoImp;



public class CommentDaoImp extends GenericDaoImp<Comment, Long> implements CommentDao {

	
	
//	@Transactional
//	public int saveComment(Comment p){
//		int id = (Integer)sessionFactory.getCurrentSession().save(p);
//		return id;
//	}
//	
//	@Transactional
//	public Comment getById(int id){
//		return (Comment) sessionFactory.getCurrentSession().get(Comment.class, id);
//	}
//	
//	@Transactional
//	public void deletById(int id){
//		sessionFactory.getCurrentSession().delete(this.getById(id));
//	}
	
}
