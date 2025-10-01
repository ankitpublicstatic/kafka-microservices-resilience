package com.ankit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ankit.entity.LoanDO;

public interface LoanRepository extends JpaRepository<LoanDO, Long> {
}
