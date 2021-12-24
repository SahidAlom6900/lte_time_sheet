package com.technoelevate.ess_lte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technoelevate.ess_lte.dto.TimeSheet;

public interface TimeSheetRepository extends JpaRepository<TimeSheet, Integer> {
	TimeSheet findByTimeSheetId(int timeSheetId);
}
