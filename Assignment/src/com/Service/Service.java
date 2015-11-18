package com.Service;

//import java.util.List;

import java.util.ArrayList;

import com.Controller.List;
import com.Model.User;
import com.UserDao.UserDao;
import com.pack.Process;

public class Service {

	public void signup(User u) {
		// TODO Auto-generated method stub 
		//UserDao
		UserDao ua=new UserDao();
		 ua.register(u);
	}

	public void update(User u) {
		// TODO Auto-generated method stub
		UserDao ua=new UserDao();
		ua.update(u);
		
	}

	public void delete(User u) {
		// TODO Auto-generated method stub
		UserDao ua=new UserDao();
		ua.delete(u);
		
	}

	public ArrayList<User> list() {
		// TODO Auto-generated method stub
		UserDao ua=new UserDao();
		return ua.list();
		//System.out.println("haii");
		 
	}

	public void Adduser(User u1) {
		// TODO Auto-generated method stub
		UserDao ua=new UserDao();
		ua.adduser(u1);
		
	}

	/*public int Login(User u) {
		// TODO Auto-generated method stub
		Process p=new Process();
		  return p.login(u);
	}*/

}
