package com.pack.bluemaple.app.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pack.bluemaple.app.model.model;
import com.pack.bluemaple.app.userdao.UserDao;

public class Service {

	public void activity(model m) throws Exception {
		// TODO Auto-generated method stub
		// System.out.println(m.toString());
		UserDao u = new UserDao();
		// u.connection();
		u.insert(m);

	}

	public ArrayList<model> activity1() throws ClassNotFoundException,
			Exception {
		// TODO Auto-generated method stub
		// System.out.println("the value is");
		UserDao u1 = new UserDao();
		return u1.list();

	}

	public void activity2(model m) throws ClassNotFoundException, SQLException {
		UserDao u2 = new UserDao();
		u2.update(m);
		// TODO Auto-generated method stub

	}

	public void activity3(model m) throws ClassNotFoundException, SQLException {
		UserDao u3 = new UserDao();
		u3.delete(m);
		// TODO Auto-generated method stub

	}

	

}
