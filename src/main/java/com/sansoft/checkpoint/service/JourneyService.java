package com.sansoft.checkpoint.service;

import com.sansoft.checkpoint.model.WorkingDay;
import com.sansoft.checkpoint.repository.DayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DayService {

    DayRepository dayRepository;

    @Autowired
    public DayService(DayRepository dayRepository) {
        this.dayRepository = dayRepository;
    }

    public WorkingDay save(WorkingDay workingDay){
        return dayRepository.save(workingDay);
    }
}
