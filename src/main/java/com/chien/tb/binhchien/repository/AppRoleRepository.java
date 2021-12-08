package com.chien.tb.binhchien.repository;

import com.chien.tb.binhchien.domain.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppRoleRepository extends JpaRepository<AppRole, UUID> {
    boolean existsAppRoleByRoleName(String roleName);
}
