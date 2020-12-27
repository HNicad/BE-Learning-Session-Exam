package com.nijad.msflight.service;

import com.nijad.msflight.dao.entity.Flight;
import com.nijad.msflight.dao.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightServiceImpl implements FlightService {
    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> saveAll(List<Flight> flights) {
        return flightRepository.saveAll(flights);
    }

    @Override
    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public Flight findById(Long id) {
        return flightRepository.findById(1L).orElseThrow(()->new RuntimeException("NOT FOUND"));
    }

    @Override
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
         flightRepository.deleteById(id);
    }

    @Override
    public List<Flight> findByDeparture(String departure) {
        return flightRepository.findByDeparture(departure);
    }
}
