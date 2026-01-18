package com.techacademy.academic_service.adapters.in.controllers;

import com.techacademy.academic_service.application.services.GradeService;
import com.techacademy.academic_service.domain.entities.Grade;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grades")
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Grade>> getGradesByStudentId(@PathVariable Long id) {
        return ResponseEntity.ok(gradeService.getAllGradesByStudentId(id));
    }

    @PostMapping
    public ResponseEntity<Grade> postGrade(@RequestBody Grade grade) {
        return ResponseEntity.ok(gradeService.saveGrade(grade));
    }

    @GetMapping
    public ResponseEntity<List<Grade>> getGradesByStudentIdAndSubject(@RequestParam Long id, @RequestParam String subject){
        return ResponseEntity.ok(gradeService.getAllGradesByStudentIdAndSubject(id, subject));
    }
}
