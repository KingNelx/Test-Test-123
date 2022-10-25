package crudbe.Repository;

import crudbe.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository <User, Long> {

     // @Query
    // get all user that age is > 21

   // @Query
    // get all user that age is below 21
}
