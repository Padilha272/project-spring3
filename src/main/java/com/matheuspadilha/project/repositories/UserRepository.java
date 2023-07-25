package com.matheuspadilha.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheuspadilha.project.entities.User;

@Repository
/*the Annotation @Repository is optional in this case, because
 * UserRepository extends the JpaRepository  */
public interface UserRepository extends JpaRepository<User,Long>{

}
