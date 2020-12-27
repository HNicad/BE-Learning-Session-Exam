package com.nijad.msflight.client;

import com.nijad.msflight.client.FlightFeignClient;
import com.nijad.msflight.model.FlightDto;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {
    private final FlightFeignClient flightFeignClient;

    public ClientService(FlightFeignClient flightFeignClient) {
        this.flightFeignClient = flightFeignClient;
    }
    public List<FlightDto> getAll(){
        List<FlightDto> flightDtos = flightFeignClient.getAll("flight-data4.p.rapidapi.com","eb78ffe261msh28cf652b9674bacp13705ejsn3d39cff30c06");
        return flightDtos;
    }
}
