package net.baryshev.firstspringboot.repository;

import net.baryshev.firstspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}