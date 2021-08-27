package com.sansoft.checkpoint.repository;

import com.sansoft.checkpoint.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayRepository extends JpaRepository<WorkingDay, Long> {
}
