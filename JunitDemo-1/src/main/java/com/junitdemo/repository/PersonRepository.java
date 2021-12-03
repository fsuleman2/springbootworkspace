package com.junitdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.junitdemo.model.Person;

@Repository
//doa
public interface PersonRepository extends JpaRepository<Person, Integer>{
	
}









//@Query("SELECT CASE WHEN COUNT(S) > 0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.personId = :id")
//Boolean isPersonExistById(Integer id); //return true if that person exist 

//@component  - sterotype annotations -> @controller @Service @Repository
//select * from persontable where id = 1;
//findById