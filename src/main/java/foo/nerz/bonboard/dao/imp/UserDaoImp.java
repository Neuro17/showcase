package foo.nerz.bonboard.dao.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import foo.nerz.bonboard.BonbException;
import foo.nerz.bonboard.dao.UserDao;
import foo.nerz.bonboard.entity.Users;
import foo.nerz.bonboard.util.GenericDaoImp;

public class UserDaoImp extends GenericDaoImp<Users, String> implements UserDao {
	
	
	
	
	
	/* (non-Javadoc)
	 * @see foo.nerz.bonboard.dao.imp.UserDao#addUser(foo.nerz.bonboard.entity.Users)
	 */
	@Override
	@Transactional
	public void addUser(Users u) throws BonbException{
		if(!existUsername(u.getUsername())){	
			getSessionFactory().getCurrentSession().save(u);
		}else{
			log.error("User ("+u.getUsername()+") alredy exists");
			throw new BonbException("User ("+u.getUsername()+") alredy exists");
		}
	}
	
	/* (non-Javadoc)
	 * @see foo.nerz.bonboard.dao.imp.UserDao#existUsername(java.lang.String)
	 */
	@Override
	@Transactional
	public boolean existUsername(String username){
		Query query;
		query=getSessionFactory().getCurrentSession().createQuery("From Users where Username=:username");
		query.setParameter("username", username);
		List<Users> result=query.list();
		if(result.size()>0)return true;
		else return false;
	}
	
	/* (non-Javadoc)
	 * @see foo.nerz.bonboard.dao.imp.UserDao#deleteUserByUsername(java.lang.String)
	 */
	@Override
	@Transactional
	public void deleteUserByUsername(String username) throws BonbException{
		if(existUsername(username)){
			Query query;
			query=getSessionFactory().getCurrentSession().createQuery("From Users where Username=:username");
			query.setParameter("username", username);
			List<Users> result=query.list();
			Users u=result.get(0);
			getSessionFactory().getCurrentSession().delete(u);
		}else{
			log.error("User ("+username+") don't exist and you traying to delete it");
			throw new BonbException("User ("+username+") don't exist and you traying to delete it");
		}
	}

	/* (non-Javadoc)
	 * @see foo.nerz.bonboard.dao.imp.UserDao#existMail(java.lang.String)
	 */
	@Override
	@Transactional
	public boolean existMail(String mail) {
		Query query;
		query=getSessionFactory().getCurrentSession().createQuery("From Users where Email=:mail");
		query.setParameter("mail", mail);
		List<Users> result=query.list();
		if(result.size()>0)return true;
		else return false;
	}
	
	/* (non-Javadoc)
	 * @see foo.nerz.bonboard.dao.imp.UserDao#getUserByUsername(java.lang.String)
	 */
//	@Override
//	@Transactional
//	public Users getUserByUsername(String username){
//		Users us=(Users) getSessionFactory().getCurrentSession().get(Users.class, username);	
//		return us;
//	}
	
	/* (non-Javadoc)
	 * @see foo.nerz.bonboard.dao.imp.UserDao#changePass(java.lang.String, java.lang.String)
	 */
	@Override
	@Transactional
	public void changePass(String username,String pass){
		Users u=this.findById(username);
		u.setPassword(pass);
		getSessionFactory().getCurrentSession().save(u);
	}

	@Override
	@Transactional
	public boolean checkEnable(String username) {		
		return findById(username).isEnabled();
	}

	@Override
	@Transactional
	public void deleteLogicaly(String username) {
		if(existUsername(username)&&checkEnable(username)){
			Users u=findById(username);
			u.setEnabled(false);
			update(u);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Users> getUsersEnabled() {
		
		return getSessionFactory().getCurrentSession().createQuery("From Users where Enabled= True").list();
		
		
	}

	@Override
	@Transactional
	public void enableLogicaly(String username) {
		if(existUsername(username)&&!checkEnable(username)){
			Users u=findById(username);
			u.setEnabled(true);
			update(u);
		}
		
	}
	
	

}
