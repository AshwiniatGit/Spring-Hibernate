package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Login;
import com.cts.product.dao.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO loginDAO;

	@Override

	@Transactional(readOnly = true, propagation=Propagation.SUPPORTS)
	public int authenticateUser(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.authenticateUser(login);
	}
	
	
}
