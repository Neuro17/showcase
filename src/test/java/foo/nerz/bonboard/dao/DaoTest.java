package foo.nerz.bonboard.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;









import foo.nerz.bonboard.BonbException;
import foo.nerz.bonboard.dao.imp.PostDaoImp;
import foo.nerz.bonboard.dao.imp.TipoPostDaoImp;
import foo.nerz.bonboard.entity.Authorities;
import foo.nerz.bonboard.entity.Comment;
import foo.nerz.bonboard.entity.GenderEnum;
import foo.nerz.bonboard.entity.Post;
import foo.nerz.bonboard.entity.TipoPost;
import foo.nerz.bonboard.entity.Users;

public class DaoTest {

	private static AbstractApplicationContext applicationContext;
	private static Log log = LogFactory.getLog(DaoTest.class);
	
	private static UserDao usersDao;
	private static AuthoritiesDao authDao;
	private static TipoPostDao tipopDao;
	private static PostDao postDao;
	private static CommentDao commentDao;
	
	@BeforeClass
	public static void createApplicationContext(){
		try {
			applicationContext = new ClassPathXmlApplicationContext(
			        new String[] {"root-context.xml"});
			
			usersDao=(UserDao)applicationContext.getBean("userDao");
			authDao=(AuthoritiesDao)applicationContext.getBean("authDao");
			tipopDao=(TipoPostDao)applicationContext.getBean("tipoPostDao");
			postDao=(PostDao)applicationContext.getBean("postDao");
			commentDao=(CommentDao)applicationContext.getBean("commentDao");
		}catch (Exception e) {
			log.error(e);
			Assert.assertNull(e);
		}
	}
	
	
//	@Test
//	public void testLinkDao(){
//		
//		if(usersDao.existUsername("prova"))usersDao.deleteUserByUsername("prova");
//		
//		Users u=new Users("prova", "password", true,"a");
//		
//		usersDao.addUser(u);
//		
//		assertTrue(usersDao.existUsername(u.getUsername()));
//		
//		linkDao.addLink(new Link("1","afafda",true, u));
//		
//		linkDao.addLink(new Link("2","aaaaa",true, u));
//		
//		linkDao.addLink(new Link("3","llll",true, u));
//		
//		linkDao.addLink(new Link("4","afafda",true, u));
//		
//		Authorities a=new Authorities(u, "PROVA");
//		
//		authDao.addAuth(a);
//		
//		assertTrue(authDao.existAuthByUser(u, "PROVA"));
//		
//		assertTrue(linkDao.getByUser(u).size()>2);
//		
//		List<Link> result= linkDao.getAll();
//		
//		assertTrue(result.size()>2);
//	
//		result=linkDao.findByUrl("3");
//		
//		assertTrue(result.size()==1);
//		
//		Link lin=linkDao.findByUrlTitle("3", "llll");
//		
//		assertNotNull(lin);
//		
//		linkDao.deleteByUrlTitle("3", "llll");
//		
//		lin=null;
//		
//		lin=linkDao.findByUrlTitle("3", "llll");
//		
//		assertNull(lin);
//		
//		linkDao.deleteByUrl("3");
//		
//		result=linkDao.findByUrl("3");
//		
//		assertTrue(result.size()==0);
//		
//		linkDao.deleteByUrl("1");
//		
//		linkDao.deleteByUrl("2");
//		
//		result= linkDao.getAll();
//		
////		assertTrue(result.size()==(size-4));
//		
//		authDao.deleteAuth(a);
//		
//		assertFalse(authDao.existAuthByUser(u, "PROVA"));
//		
//		usersDao.deleteUserByUsername(u.getUsername());
//		
//		assertFalse(usersDao.existUsername(u.getUsername()));
//		
//		//cascade double
//		
//		if(usersDao.existUsername("prova"))usersDao.deleteUserByUsername("prova");
//		
//		u=new Users("prova", "password", true,"a");
//		
//		usersDao.addUser(u);
//		
//		assertTrue(usersDao.existUsername(u.getUsername()));
//		
//		linkDao.addLink(new Link("1","afafda",true, u));
//		
//		linkDao.addLink(new Link("2","aaaaa",true, u));
//		
//		linkDao.addLink(new Link("3","llll",true, u));
//		
//		linkDao.addLink(new Link("4","afafda",true, u));
//		
//		a=new Authorities(u, "PROVA");
//		
//		authDao.addAuth(a);
//		
//		assertTrue(authDao.existAuthByUser(u, "PROVA"));
//		
//		usersDao.deleteUserByUsername("prova");
//		
//		assertFalse(usersDao.existUsername("prova"));
//		
//		assertFalse(authDao.existAuthByUser(u, "PROVA"));
//		
//		assertTrue(linkDao.getByUser(u).size()==0);
//		
//		if(usersDao.existUsername("prova"))usersDao.deleteUserByUsername("prova");
//		
//		u=new Users("prova", "password", true,"a");
//		
//		usersDao.addUser(u);
//		
//		assertTrue(usersDao.existUsername(u.getUsername()));
//		
//		u.setEmail(null);
//		
//		linkDao.addLink(new Link("1","afafda",true, u));
//		
//		assertTrue(linkDao.existUrl("1"));
//		
//		linkDao.deleteByUrl("1");
//		
//		Date data=new Date();
//		
//		linkDao.addLink(new Link("1","afafda",true, u, data));
//		
//		assertTrue(linkDao.existUrl("1"));
//		
//		linkDao.deleteByUrl("1");
//	}
	
	@Test
	public void testUser() throws BonbException{
		
		
		
		Users u=new Users("prova", "password", true,"a","a","a");
		
		if(!usersDao.existUsername("prova")){
			
			
			usersDao.addUser(u);
		}
		if(!usersDao.checkEnable(u.getUsername()))usersDao.enableLogicaly(u.getUsername());
		
		
		
		assertTrue(usersDao.existUsername(u.getUsername()));
		
		usersDao.deleteLogicaly(u.getUsername());
		
		assertFalse(usersDao.checkEnable(u.getUsername()));
		
		
		
	}
	
	
	@Test
	public void testAuth() throws BonbException{
		
		
		Users u=new Users("prova", "password", true,"a","a","a");
		if(!usersDao.existUsername("prova")){
			
			
			usersDao.addUser(u);
		}
		if(!usersDao.checkEnable(u.getUsername()))usersDao.enableLogicaly(u.getUsername());
		
//		usersDao.addUser(u);
		
		assertTrue(usersDao.existUsername(u.getUsername()));
		
		Authorities a=new Authorities(u, "PROVA");
		
		authDao.persist(a);
		
		assertTrue(authDao.existAuthByUser(u, "PROVA"));
		
		authDao.delete(a);
		
		assertFalse(authDao.existAuthByUser(u, "PROVA"));
		
		// cascade!!!
		
		if(usersDao.existUsername("prova"))usersDao.deleteUserByUsername("prova");
		
		u=new Users("prova", "password", true,"a","a","a");
		
		usersDao.addUser(u);
		
		assertTrue(usersDao.existUsername(u.getUsername()));
		
		a=new Authorities(u, "PROVA");
		
		authDao.persist(a);
		
		usersDao.deleteLogicaly(u.getUsername());
		
		assertFalse(usersDao.checkEnable(u.getUsername()));
		
//		assertFalse(authDao.existAuthByUser(u, "PROVA"));
		
	}
	
	
	@Test
	public void testTipoPost(){
		TipoPost p=tipopDao.findById(new Long(1));
		assertNotNull(p);
		System.out.println(p.getTipo());
	}
	
	@Test
	public void testPost() throws BonbException{
		TipoPost po=tipopDao.findById(new Long(1));
		Users u=new Users("prova", "password", true,"a","a","a");
		if(!usersDao.existUsername("prova")){
			
			
			usersDao.addUser(u);
		}
		if(!usersDao.checkEnable(u.getUsername()))usersDao.enableLogicaly(u.getUsername());
		assertTrue(usersDao.existUsername(u.getUsername()));
		Post p=new Post(po, "a", "a", "aaa", "aaa", u, new Date());
				
		
		Long i=postDao.save(p);
		
		assertNotNull(i);
		
		System.out.println(1);

		p=postDao.findById(i);
		
		System.out.println(p.toString());
		
		assertNotNull(p);
		
		postDao.delete(p);
		
		p=postDao.findById(i);
		
		assertNull(p);
		
		
		usersDao.deleteLogicaly(u.getUsername());
		
		assertFalse(usersDao.checkEnable(u.getUsername()));
	}
	
	@Test
	public void testComm() throws BonbException{
		TipoPost po=tipopDao.findById(new Long(1));
		Users u=new Users("prova", "password", true,"a","a","a");
		if(!usersDao.existUsername("prova")){
			
		
			usersDao.addUser(u);
		}
		if(!usersDao.checkEnable(u.getUsername()))usersDao.enableLogicaly(u.getUsername());
		assertTrue(usersDao.existUsername(u.getUsername()));
		Post p=new Post(po, "a", "a", "aaa", "aaa", u, new Date());
				
		Long i=postDao.save(p);
		
		assertNotNull(i);
		
		System.out.println(1);
		
		Comment comm=new Comment(p, "sss", u, new Date());
		
		Long in=commentDao.save(comm);
		
		comm=commentDao.findById(in);
		
		assertNotNull(comm);
		
		System.out.println(comm.getIdComment());
		
		commentDao.delete(commentDao.findById(in));
		
		comm=commentDao.findById(in);
		
		assertNull(comm);

		p=postDao.findById(i);
		
		System.out.println(p.toString());
		
		assertNotNull(p);
		
		postDao.delete(postDao.findById(i));
		
		p=postDao.findById(i);
		
		assertNull(p);
		
		
		
		usersDao.deleteLogicaly(u.getUsername());
		
		assertFalse(usersDao.checkEnable(u.getUsername()));
	}
	
	
	@Test
	public void testFunctionUser() throws BonbException{
		
		
		Users u=new Users("prova", "password", true,"a","a","a");
		if(!usersDao.existUsername("prova")){
			
		
			usersDao.addUser(u);
		}
		if(!usersDao.checkEnable(u.getUsername()))usersDao.enableLogicaly(u.getUsername());
		assertTrue(usersDao.existUsername(u.getUsername()));
		
		assertTrue(usersDao.existMail("a"));
		
		usersDao.changePass("prova", "b");
		
		u=usersDao.findById("prova");
		
//		System.out.println(u.getPassword());
		
		assertEquals(new String("b"), u.getPassword());

		usersDao.deleteLogicaly(u.getUsername());
		
		assertFalse(usersDao.checkEnable(u.getUsername()));
		
	}
	
	@Test
	public void testFunctionPost() throws BonbException{
		
		TipoPost po=tipopDao.findById(new Long(1));
		Users u=new Users("prova", "password", true,"a","a","a");
		if(!usersDao.existUsername("prova")){
			
		
			usersDao.addUser(u);
		}
		if(!usersDao.checkEnable(u.getUsername()))usersDao.enableLogicaly(u.getUsername());
		assertTrue(usersDao.existUsername(u.getUsername()));
		Post p=new Post(po, "àa", "aè", "aòaa", "aaùa", u, new Date());
		for(int i =0;i<5;i++)
		postDao.save(p);
		
		
		System.out.println(postDao.getCountByType(1));
		
		
		List<Post> pop=postDao.listAllPage(0, 10);
		
		for(Post cur:pop ){
			System.out.println(cur.getTime());
		}
		
		
		usersDao.deleteLogicaly(u.getUsername());
		
		assertFalse(usersDao.checkEnable(u.getUsername()));
	}
	
	
	@Test
	public void userRoutine() throws BonbException{
		//inserimento
		
		Users u=new Users("prova1", "password", true,"a","a","a");
		
		if(!usersDao.existUsername("prova1")){
			
		
			usersDao.addUser(u);
		}
		usersDao.deleteLogicaly("prova1");
		
		//disabilitao
		
		assertFalse(usersDao.checkEnable("prova1"));
		
		
		
		if(!usersDao.checkEnable(u.getUsername()))usersDao.enableLogicaly(u.getUsername());
		
		//abilitato
		
		assertTrue(usersDao.checkEnable("prova1"));
		
		//assegno l'autorizzazione
		
		Authorities a=new Authorities(u, "PROVA");
		
		if(authDao.existAuthByUser(u, "PROVA")){
			a=authDao.getFirstByUsername(u.getUsername());
			authDao.delete(a);
			System.out.println("AAAAAAA LA BECCA");
		}
		
		
		Long ID=authDao.save(a);
		a.setId_auth(ID);
		
		assertTrue(authDao.existAuthByUser(u, "PROVA"));
		
		// cancella utente(fisicamente) controlla che cancelli anche Auth
		
		usersDao.delete(u);
		
		assertFalse(usersDao.existUsername("prova1"));
		
		assertFalse(authDao.existAuthByUser(u, "PROVA"));
		
		//controlla che salvi sia user che auth
		
		
		List<Authorities> au= new ArrayList<Authorities>();
		au.add(a);
		u.setAuth(au);
		
		
		usersDao.save(u);
		
		assertTrue(usersDao.existUsername("prova1"));
		
		assertTrue(authDao.existAuthByUser(u, "PROVA"));
		
		//checkmail
		
		assertTrue(usersDao.existMail("a"));
		
		assertFalse(usersDao.existMail("aa"));
		
		//checkusername
		
		assertTrue(usersDao.existUsername("prova1"));
		
		assertFalse(usersDao.existUsername("prova2"));
		
		usersDao.delete(u);
		
		assertFalse(authDao.existAuthByUser(u, "PROVA"));
		
		
	}
	
	@Test
	public void testCountComments(){
		
		List<Post> p=postDao.get10PostPaged(1, 1);
		
		for(Post c:p){
			System.out.println(c.getIdPost());
			System.out.println(c.getCountComments());
		}
	}
		
		@Test
	public void genderTest() throws BonbException{
		
		Users u=new Users("prova1", "password", true,"a","a","a",GenderEnum.F );
		
		usersDao.addUser(u);

	}
		@Test
		public void testAuthhh(){
			Authorities a = authDao.listAll().get(0);

			System.out.println("AAAAAAA "+a.getUsers().getUsername());
			a.setAuthority("ROLE_TEST");
			authDao.saveOrUpdate(a);
		}
	
}
