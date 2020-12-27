package com.nijad.msflight.scheduler;

import com.nijad.msflight.client.FlightFeignClient;
import com.nijad.msflight.dao.entity.Flight;
import com.nijad.msflight.mapper.FlightMapper;
import com.nijad.msflight.model.FlightDto;
import com.nijad.msflight.service.FlightService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlightScheduler {
    private final FlightFeignClient flightFeignClient;
    private final FlightService flightService;

    public FlightScheduler(FlightFeignClient flightFeignClient, FlightService flightService) {
        this.flightFeignClient = flightFeignClient;
        this.flightService = flightService;
    }

    @Scheduled(cron = "0 0/10 * * * ?")
    void retreive(){
        List<FlightDto> flightDtos = flightFeignClient.getAll("flight-data4.p.rapidapi.com","eb78ffe261msh28cf652b9674bacp13705ejsn3d39cff30c06");
        flightService.saveAll(flightDtos.stream().map(FlightMapper.INSTANCE::flightDtoToFlight).collect(Collectors.toList()));
    }
}
