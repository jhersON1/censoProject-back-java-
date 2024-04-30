package com.software.censo.repository;

import com.software.censo.model.CensoUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CensoUserRepository extends JpaRepository<CensoUser, UUID> {
    Optional<CensoUser> findByEmail(String email);
}
