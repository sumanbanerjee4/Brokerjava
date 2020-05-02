package com.home.repo;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.home.model.Advertisement;



public interface MongoRepo extends MongoRepository<Advertisement, String>{

	List<Advertisement> findByPinCode(int pinCode);

	List<Advertisement> findByArea(String area);

	List<Advertisement> findByState(String state);

	void deleteByName(String name);

	//@Query(value="{'course.dateOfFulfillment':'null'}",fields="{'empno': 1, 'course':1}")
	//public List<Employees>  findCourseCompletionDetails();


}
