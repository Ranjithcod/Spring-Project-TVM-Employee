package com.task.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.task.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

	@Query(value = "SELECT u.userid, u.userfirstname, u.usersecondname, u.useremail, u.userphone, "
			+ "a.addressid, a.doorno, a.street, a.city, a.state "
			+ "FROM users u LEFT JOIN users_address a ON u.userid = a.usersid "
			+ "WHERE u.userid = :userid", nativeQuery = true)
	public List<Users> getUsersAddress(@Param("userid") Integer userid);

	//get by userfirstname
	@Query(value = "SELECT u.userid,u.userfirstname,u.usersecondname,u.useremail,u.userphone,"
			+ "a.addressid,a.doorno,a.street,a.city,a.state FROM users u LEFT JOIN users_address"
			+ " a ON u.userid=a.usersid WHERE u.userfirstname = :userfirstname", nativeQuery = true)
	public List<Users> getUserName(@Param("userfirstname") String userfirstname);

	//get by techname 
	@Query(value = "SELECT u.userid, u.userfirstname, u.usersecondname, u.useremail, u.userphone, "
			+ "b.projectid, b.projectname, a.techid, a.techname " + "FROM users u "
			+ "LEFT JOIN employee_technolgy_details a ON u.userid = a.userid "
			+ "LEFT JOIN employee_project_details b ON u.userid = b.userid "
			+ "WHERE a.techname = :techname", nativeQuery = true)
	public List<Users> getUsersByTechnology(@Param("techname") String techname);

    
	//get by project id
	@Query(value = "SELECT u.userid, u.userfirstname, u.usersecondname, u.useremail, u.userphone, "
			+ "b.projectid, b.projectname, a.techid, a.techname " + "FROM users u "
			+ "LEFT JOIN employee_technolgy_details a ON u.userid = a.userid "
			+ "LEFT JOIN employee_project_details b ON u.userid = b.userid "
			+ "WHERE b.projectid = :projectid", nativeQuery = true)
	public List<Users> getUsersByProject(@Param("projectid") Integer projectid);
	
	@Query(value = "SELECT u.userid, u.userfirstname, u.usersecondname, u.useremail, u.userphone, "
			+ "b.projectid, b.projectname, a.techid, a.techname " + "FROM users u "
			+ "LEFT JOIN employee_technolgy_details a ON u.userid = a.userid "
			+ "LEFT JOIN employee_project_details b ON u.userid = b.userid "
			+ "WHERE b.projectname = :projectname", nativeQuery = true)
	public List<Users> getByProjectName(@Param("projectname") String projectname);


}
