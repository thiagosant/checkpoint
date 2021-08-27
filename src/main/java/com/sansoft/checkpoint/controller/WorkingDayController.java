package com.sansoft.checkpoint.controller;

import com.sansoft.checkpoint.model.WorkingDay;
import com.sansoft.checkpoint.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/journey")
public class WorkingDayController {

    @Autowired
    JourneyService journeyService;

    @PostMapping
    public WorkingDay createJourney(@RequestBody WorkingDay workingDay){
        return journeyService.saveJourney(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getJourneyList(){
        return journeyService.findAll();
    }


    @GetMapping("/{idJourney}")
    public ResponseEntity<WorkingDay> getJourneyById(@PathVariable("idJoruney") Long idJourney) {
        return ResponseEntity.ok(journeyService.getById(idJourney).orElseThrow(() -> new NoSuchElementException("Journey not found.")));
    }

    @PutMapping
    public WorkingDay updateJourney(@RequestBody WorkingDay workingDay){
        return journeyService.updateJourney(workingDay);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            journeyService.deleteJourney(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkingDay>) ResponseEntity.ok();
    }

}
