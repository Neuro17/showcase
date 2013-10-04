package foo.nerz.bonboard.dao.imp;


import java.util.List;

import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import foo.nerz.bonboard.dao.AuthoritiesDao;
import foo.nerz.bonboard.entity.Authorities;
import foo.nerz.bonboard.entity.Users;
import foo.nerz.bonboard.util.GenericDaoImp;

public class AuthoritiesDaoImp extends GenericDaoImp<Authorities, Long> implements AuthoritiesDao {

	
	

	
	/* (non-Javadoc)
	 * @see foo.nerz.bonboard.dao.imp.AuthoritiesDao#existAuthByUser(foo.nerz.bonboard.entity.Users, java.lang.String)
	 */
	@Override
	@Transactional
	public boolean existAuthByUser(Users u, String auth){
		
		List<Authorities> b=null;
		Query query;
		query=getSessionFactory().getCurrentSession().createQuery("From Authorities where Username=:username");
		query.setParameter("username", u.getUsername());
		b=(List<Authorities>)query.list();
		if(b!=null && b.size()>0){
			for (Authorities current : b){
				if(current.getAuthority().compareTo(auth)==0) return true;
			}
		}
		return false;
	}

	@Override
	@Transactional
	public void saveA(Authorities a) {
		 getSessionFactory().getCurrentSession().save(a);		
	}

	@Override
	@Transactional
	public void changeAuthUser(String username) {
		Query query;
		query=getSessionFactory().getCurrentSession().createQuery("From Authorities where Username=:username");
		query.setParameter("username", username);
		Authorities a=(Authorities) query.list().get(0);
		log.debug(a.getAuthority());
		if(a.getAuthority().compareTo("ROLE_USER")==0){
			a.setAuthority("ROLE_ADMIN");
			log.debug(a.getAuthority());
		}
		else 
			a.setAuthority("ROLE_USER");
		this.update(a);
//		this.saveA(a);
//		this.saveOrUpdate(a);
	}

	@Override
	@Transactional
	public Authorities getFirstByUsername(String username) {
		List<Authorities> b=null;
		Query query;
		query=getSessionFactory().getCurrentSession().createQuery("From Authorities where Username=:username");
		query.setParameter("username",username);
		b=(List<Authorities>)query.list();
		if(b!=null && b.size()>0){
			return b.get(0);
		}
		return null;
	}
	
}
