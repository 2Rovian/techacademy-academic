package com.techacademy.academic_service.adapters.out.repositories;

import com.techacademy.academic_service.adapters.out.entities.JpaGradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaGradeRepository extends JpaRepository<JpaGradeEntity, Long> {
    List<JpaGradeEntity> findByStudentId(Long id);
    List<JpaGradeEntity> findByStudentIdAndSubject(Long id, String subject);
}
