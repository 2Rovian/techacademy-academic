package com.techacademy.academic_service.adapters.out.repositories;

import com.techacademy.academic_service.adapters.out.entities.JpaReportCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaReportCardRepository extends JpaRepository<JpaReportCardEntity, Long> {
}
