package com.sansoft.checkpoint.repository;

import com.sansoft.checkpoint.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<WorkingDay, Long> {
}
