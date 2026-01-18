package com.techacademy.academic_service.adapters.out.entities;

import com.techacademy.academic_service.domain.entities.Grade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_grades")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JpaGradeEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Long studentId;
    private String subject;
    private BigDecimal value;

    public JpaGradeEntity(Grade grade) {
        this.id = grade.getId();
        this.studentId = grade.getStudentId();
        this.subject = grade.getSubject();
        this.value = grade.getValue();
    }
}
