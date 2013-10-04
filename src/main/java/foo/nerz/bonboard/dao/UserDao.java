package foo.nerz.bonboard.dao;



import java.util.List;

import foo.nerz.bonboard.BonbException;
import foo.nerz.bonboard.entity.Users;
import foo.nerz.bonboard.util.GenericDao;

public interface UserDao extends GenericDao<Users,String>  {

	public void addUser(Users u) throws BonbException;

	public boolean existUsername(String username);

	public void deleteUserByUsername(String username)
			throws BonbException;

	public boolean existMail(String mail);

//	public abstract Users getUserByUsername(String username);
	
	public boolean checkEnable(String username);
	
	public void deleteLogicaly(String username);
	
	public void enableLogicaly(String username);

	public void changePass(String username, String pass);
	
	public List<Users> getUsersEnabled();

}