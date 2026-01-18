package com.techacademy.academic_service.adapters.in.controllers;


import com.techacademy.academic_service.application.services.ReportCardService;
import com.techacademy.academic_service.domain.entities.ReportCard;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/report-cards")
public class ReportCardController {
    private final ReportCardService reportCardService;
    public ReportCardController(ReportCardService reportCardService) {
        this.reportCardService = reportCardService;
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<ReportCard> getReportCard(@PathVariable Long studentId){
        return ResponseEntity.ok(reportCardService.generate(studentId));
    }
}
