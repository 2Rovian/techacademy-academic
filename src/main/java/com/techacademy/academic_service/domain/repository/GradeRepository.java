package com.techacademy.academic_service.domain.repository;

import com.techacademy.academic_service.domain.entities.Grade;

import java.util.List;

public interface GradeRepository {
    Grade save(Grade grade);
    List<Grade> findByStudentId(Long id);
    List<Grade> findByStudentIdAndSubject(Long id, String subject);
}
