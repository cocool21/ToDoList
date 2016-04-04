package processor;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.DBUtil;
import model.Listuser;


public class ProcessUser {
private int userId;
private String userName;
private String userPassword;
public int UserLogin(String name,String password){
	EntityManager em=DBUtil.getEmFactory().createEntityManager();
	String qString="SELECT * FROM Listuser  where username = "+name+" AND userpassword = "+password;
	TypedQuery<Listuser> q=em.createQuery(qString, Listuser.class);
	List<Listuser> users;
	Listuser user;
	long count;
	try{
		users=q.getResultList();
		if(users==null||users.isEmpty()){
			user=null;
			userId=0;
			}else{
			user=users.get(0);
			count=user.getId();
			userId=(int)count;
			}
		}finally{
			em.close();
		} 
	    
		return userId;
}
}


