package com.techacademy.academic_service.adapters.out.repositories;

import com.techacademy.academic_service.adapters.out.entities.JpaGradeEntity;
import com.techacademy.academic_service.domain.entities.Grade;
import com.techacademy.academic_service.domain.repository.GradeRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class GradeRepositoryImpl implements GradeRepository {

    private final JpaGradeRepository jpaGradeRepository;

    public GradeRepositoryImpl(JpaGradeRepository jpaGradeRepository) {
        this.jpaGradeRepository = jpaGradeRepository;
    }
    @Override
    public Grade save(Grade grade) {
        JpaGradeEntity jpaGradeEntity = new JpaGradeEntity(grade);
        jpaGradeRepository.save(jpaGradeEntity);
        return grade;
    }

    @Override
    public List<Grade> findByStudentId(Long id) {
        List<JpaGradeEntity> jpaGradeEntities = jpaGradeRepository.findByStudentId(id);
        return jpaGradeEntities.stream().map(grade -> new Grade(
                grade.getId(),
                grade.getStudentId(),
                grade.getSubject(),
                grade.getValue()
        )).collect(Collectors.toList());
    }

    @Override
    public List<Grade> findByStudentIdAndSubject(Long id, String subject) {
        List<JpaGradeEntity> jpaGradeEntities = jpaGradeRepository.findByStudentIdAndSubject(id, subject);

        return jpaGradeEntities.stream().map(grade -> new Grade(
                grade.getId(),
                grade.getStudentId(),
                grade.getSubject(),
                grade.getValue()
        )).collect(Collectors.toList());
    }
}
