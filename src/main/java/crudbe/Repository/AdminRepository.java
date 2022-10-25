package crudbe.Repository;

import crudbe.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdminRepository extends JpaRepository <Admin, Long> {
    // @Query
}
