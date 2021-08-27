package com.sansoft.checkpoint.service;

import com.sansoft.checkpoint.model.WorkingDay;
import com.sansoft.checkpoint.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {


    JourneyRepository journeyRepository;

    @Autowired
    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public WorkingDay saveJourney(WorkingDay workingDay){
        return journeyRepository.save(workingDay);
    }

    public List<WorkingDay> findAll(){
        return journeyRepository.findAll();
    }

    public Optional<WorkingDay> getById(Long idJourney) {
        return journeyRepository.findById(idJourney);
    }

    public WorkingDay updateJourney(WorkingDay workingDay){
        return journeyRepository.save(workingDay);
    }

    public void deleteJourney(Long idJourney) {
        journeyRepository.deleteById(idJourney);
    }
}
