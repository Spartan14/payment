package payment;

import java.util.ArrayList;
import java.util.List;

public class LoginDao {
	ArrayList<Login>log=new ArrayList<Login>();;
	public List<Login> getLogin()
	{
		Login l=new Login();
		l.setPassword("capgemini");
		l.setUserName("shristi");
		log.add(l);
		return log;
	}
	public List<Login> getLogin(String n,String p)
	{
		Login l2=new Login();
		l2.setPassword(n);
		l2.setUserName(p);
		log.add(l2);
		System.out.println("Successfull");
		return log;
	}
}
