package com.software.censo.repository;

import com.software.censo.model.CensoUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CensoUserRepository extends JpaRepository<CensoUser, Long> {

}
