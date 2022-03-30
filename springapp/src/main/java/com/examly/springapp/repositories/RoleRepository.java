package com.examly.springapp.repositories;

import com.examly.springapp.models.Role;
import com.examly.springapp.models.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
  
	Optional<Role> findByName(ERole name);
}
