package com.BikkadIT.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User,Integer>{

}
