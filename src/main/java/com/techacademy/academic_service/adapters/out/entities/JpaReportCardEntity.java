package com.techacademy.academic_service.adapters.out.entities;

import com.techacademy.academic_service.domain.Grade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_report_cards")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JpaReportCardEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Long studentId;
    private String studentName;
    private List<Grade> grades;
    private BigDecimal average;
    private String status;

}
