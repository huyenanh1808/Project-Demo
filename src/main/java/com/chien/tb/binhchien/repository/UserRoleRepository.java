package com.chien.tb.binhchien.repository;

import com.chien.tb.binhchien.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRoleRepository extends JpaRepository<UserRole, UUID> {
}
