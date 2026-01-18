package com.techacademy.academic_service.adapters.in.controllers;


import com.techacademy.academic_service.application.services.ReportCardService;
import com.techacademy.academic_service.domain.entities.ReportCard;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("report-cards")
public class ReportCardController {
    private final ReportCardService reportCardService;
    public ReportCardController(ReportCardService reportCardService) {
        this.reportCardService = reportCardService;
    }

    @GetMapping(value = "/studentId")
    public ResponseEntity<ReportCard> getReportCard(@PathVariable Long studentId, @RequestParam String studentName){
        return ResponseEntity.ok(reportCardService.generate(studentId, studentName));
    }
}
