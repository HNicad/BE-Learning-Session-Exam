package com.nijad.msflight.client;

import com.nijad.msflight.model.FlightDto;
import feign.HeaderMap;
import feign.Headers;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;


@FeignClient(name = "flightFeignClient", url = "https://flight-data4.p.rapidapi.com/get_airline_flights?airline=SIA")
public interface FlightFeignClient {
    @GetMapping
    List<FlightDto> getAll(@RequestHeader("x-rapidapi-host") String a, @RequestHeader("x-rapidapi-key") String b);
}
