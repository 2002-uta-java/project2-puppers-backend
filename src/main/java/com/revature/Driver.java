package com.revature;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;

import com.revature.dao.DogDao;
import com.revature.dao.OwnerDao;
import com.revature.model.Dog;
import com.revature.model.Owner;
import com.revature.services.OwnerService;

public class Driver {
	OwnerService s = new OwnerService();
	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	OwnerDao ownerDao = (OwnerDao) ac.getBean("ownerDaoImpl");
	DogDao dogDao = (DogDao) ac.getBean("dogDaoImpl");
	
//	
//	Owner o = new Owner();
//	o.setFirstName("Jay");
//	o.setLastName("Boucher");
//	o.setEmail("jay@gmail.com");
//	o.setPassword("password");
//	o.setAddress("110 abc lane");
//	o.setPostalCode("75019");
//	
//	ownerDao.createOwner(o);
//	
//	Owner o1 = ownerDao.getById(1);
//	System.out.println(o1);
	
		String email = "jay@gmail.com";
		String password ="password";
		Owner o1 = new Owner();
		List<Owner> owners = ownerDao.getAllOwner();
		for(Owner o : owners) {
			if(o.getEmail() != null && o.getEmail().equals(email)) {
				if (o.getPassword() != null && o.getPassword().equals(password)) {
				 o1 =o;
				 System.out.println(o1);
			}
				
			}
			
		}

	
//	Dog d = new Dog();
//	d.setName("Max");
//	d.setAge(1);
//	d.setBreed("Husky");
//	d.setDogSize("large");
//	d.setDogStatus("Taken");
//	d.setGender("Female");
//	d.setImageUrl("url");
//	d.setProfileComment("Sad");
//	d.setWeight(100);
//	d.setOwnerId(ownerDao.getById(1));
//	
//	dogDao.createDog(d);
//	
//	Dog d1 = dogDao.getById(1);
//	System.out.println(d1);

//	List<Dog> d1 = dogDao.getAllDog();
//	System.out.println(d1);

	}

}
