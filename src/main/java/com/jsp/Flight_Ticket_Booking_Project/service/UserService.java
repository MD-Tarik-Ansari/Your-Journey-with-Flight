package com.jsp.Flight_Ticket_Booking_Project.service;

import java.util.List;

import com.jsp.Flight_Ticket_Booking_Project.dao.UserDao;
import com.jsp.Flight_Ticket_Booking_Project.dto.User;

public class UserService 
{
    UserDao dao=new UserDao();
    
    /* 
	 * save user details
	 * 
	 */
    
    public User saveUser(User user)
    {
    	return dao.saveUser(user);
    }
    
    /* 
	 * getAll user
	 * 
	 */
    
    public List<User> getAllUser()
    {
    	return dao.getAllUser();
    }
    
    /* 
	 * get user by email
	 * 
	 */
    
    public User getUserByEmail(String userEmail)
    {
    	return dao.getUserByEmail(userEmail);
    }
}
