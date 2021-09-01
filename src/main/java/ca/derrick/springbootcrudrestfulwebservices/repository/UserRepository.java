package ca.derrick.springbootcrudrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ca.derrick.springbootcrudrestfulwebservices.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
