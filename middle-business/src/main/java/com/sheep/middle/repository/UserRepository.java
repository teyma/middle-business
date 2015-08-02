package com.sheep.middle.repository;

import com.sheep.middle.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tristan on 02/08/2015.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
