package com.ftgrl.auctionProject.repository;

import java.util.Optional;

import com.ftgrl.auctionProject.models.ERole;
import com.ftgrl.auctionProject.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
