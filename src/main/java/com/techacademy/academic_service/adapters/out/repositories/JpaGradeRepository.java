package com.techacademy.academic_service.adapters.out.repositories;

import com.techacademy.academic_service.adapters.out.entities.JpaGradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaGradeRepository extends JpaRepository<JpaGradeEntity, Long> {
}
