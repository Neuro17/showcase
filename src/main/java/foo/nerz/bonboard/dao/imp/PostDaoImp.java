package foo.nerz.bonboard.dao.imp;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.transaction.annotation.Transactional;

import foo.nerz.bonboard.dao.PostDao;
import foo.nerz.bonboard.entity.Post;
import foo.nerz.bonboard.util.GenericDaoImp;

public class PostDaoImp extends GenericDaoImp<Post, Long> implements PostDao {

	
	
//	@Transactional
//	public int savePost(Post p){
//		int id = (Integer)getSessionFactory().getCurrentSession().save(p);
//		return id;
//	}
//	
//	@Transactional
//	public Post getById(int id){
//		return (Post) getSessionFactory().getCurrentSession().get(Post.class, id);
//	}
//	
//	@Transactional
//	public void deletById(int id){
//		getSessionFactory().getCurrentSession().delete(this.getById(id));
//	}
	
	/* (non-Javadoc)
	 * @see foo.nerz.bonboard.dao.imp.PostDao#getCountByType(int)
	 */
	
	@Transactional
	public int getCountByType(int tipo){
		BigInteger count = (BigInteger) getSessionFactory().getCurrentSession().createSQLQuery("select count(*) from posts where id_tipo= "+tipo).uniqueResult();
		return count.intValue();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Post> get10PostPaged(int tipo,int page){
		int count=this.getCountByType(tipo);
		List<Post> p ;
		if((page-1)*10<count){
			if((count-((page-1)*10))<10){
				Query q=getSessionFactory().getCurrentSession().createQuery("From Post where Id_tipo="+tipo+" order by Time ");
				q.setMaxResults(count-((page-1)*10));
				q.setFirstResult((page-1)*10);
				p=q.list();
				return addCommentNumber(p);
			}else{
				Query q=getSessionFactory().getCurrentSession().createQuery("From Post where Id_tipo="+tipo+" order by Time desc");
				q.setMaxResults(10);
				q.setFirstResult((page-1)*10);
				p=q.list();
				return addCommentNumber(p);
			}
		}else return null;
		
	}
	
	@Transactional
	public List<Post> addCommentNumber(List<Post> post){
		SQLQuery query=getSessionFactory().getCurrentSession().createSQLQuery("select p.id_post as post,count(c.id_comment) AS count from posts p left join comments c on c.id_post= p.id_post group by c.id_post order by p.time");
		@SuppressWarnings("rawtypes")
		List records =query.list();
		@SuppressWarnings("rawtypes")
		Iterator iterator = records.iterator();
		HashMap<Integer, Integer> cur=new HashMap<Integer, Integer>();
		while (iterator.hasNext())
		{
			Object[] row = (Object[])iterator.next();
			Integer id=(Integer)row[0];
			BigInteger count=(BigInteger)row[1];
			cur.put(id.intValue(),count.intValue());
		}
		int index=0;
		for (Post current: post){
//			System.out.println(cur.get(current.getIdPost().intValue()));
			post.get(index).setCountComments(cur.get(current.getIdPost().intValue()));
			index++;
		}
		return post;
	}
	
}
