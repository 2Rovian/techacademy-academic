package com.techacademy.academic_service.adapters.out.repositories;

import com.techacademy.academic_service.adapters.out.entities.JpaGradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaGradeRepository extends JpaRepository<JpaGradeEntity, Long> {
    List<JpaGradeEntity> findByStudentId(Long id);
    List<JpaGradeEntity> findByStudentIdAndSubject(Long id, String subject);
}
