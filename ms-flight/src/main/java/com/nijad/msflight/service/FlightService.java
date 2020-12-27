package com.nijad.msflight.service;


import com.nijad.msflight.dao.entity.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> saveAll(List<Flight> flights);
    Flight save(Flight flight);
    Flight findById(Long id);
    List<Flight> findAll();
    void deleteById(Long id);
    List<Flight> findByDeparture(String departure);
}
