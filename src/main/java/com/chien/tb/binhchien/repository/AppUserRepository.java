package com.chien.tb.binhchien.repository;

import com.chien.tb.binhchien.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AppUserRepository extends JpaRepository<AppUser, UUID> {

}
