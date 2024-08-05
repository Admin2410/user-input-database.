package com.slr.springboot.Repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Repository.UserRepo;
import com.demo.model.SystemUser;

@Service
public interface  User_Controller  {

	String newUser(SystemUser systemUser);

	List<SystemUser> users();

}
