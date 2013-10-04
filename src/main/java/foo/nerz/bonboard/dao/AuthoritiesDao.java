package foo.nerz.bonboard.dao;



import foo.nerz.bonboard.entity.Authorities;
import foo.nerz.bonboard.entity.Users;
import foo.nerz.bonboard.util.GenericDao;

/**
 * @author Fabio
 *
 */
public interface AuthoritiesDao extends GenericDao<Authorities,Long> {

	/**
	 * Necessary because generic save return long as id (in this case the id is composed by 2 attribute)
	 * @param a
	 */
	public void saveA(Authorities a);

	public abstract boolean existAuthByUser(Users u, String auth);
	
	public void changeAuthUser(String username);
	
	public Authorities getFirstByUsername(String username);

}