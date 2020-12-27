package com.nijad.msflight.dao.repository;


import com.nijad.msflight.dao.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight,Long> {
    List<Flight> findByDeparture(String departure);
}
