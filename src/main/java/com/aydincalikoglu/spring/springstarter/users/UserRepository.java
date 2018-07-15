package com.aydincalikoglu.spring.springstarter.users;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
