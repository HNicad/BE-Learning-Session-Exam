package com.nijad.msflight.controller;

import com.nijad.msflight.dao.entity.Flight;

import com.nijad.msflight.service.FlightService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> findById(@PathVariable Long id){
        try{
            return new ResponseEntity<> (flightService.findById(id), HttpStatus.OK);
        }
        catch(RuntimeException ex){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping
    public  ResponseEntity< List<Flight> > findAll(){
        return new ResponseEntity<> (flightService.findAll(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Flight> save(@RequestBody Flight flight){
        return new ResponseEntity<>(flightService.save(flight),HttpStatus.CREATED) ;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletById(@RequestParam Long id){
        flightService.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("/{departure}")
    public  ResponseEntity< List<Flight> >  getByDeparture(@RequestParam String deprture){
        return new ResponseEntity<>(flightService.findByDeparture(deprture),HttpStatus.OK) ;
    }

}
