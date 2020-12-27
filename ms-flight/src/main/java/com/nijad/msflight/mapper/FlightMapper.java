package com.nijad.msflight.mapper;

import com.nijad.msflight.dao.entity.Flight;
import com.nijad.msflight.model.FlightDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FlightMapper {
    FlightMapper INSTANCE = Mappers.getMapper(FlightMapper.class);
    @Mappings({
            @Mapping(target = "airline", source = "flightDto.airline"),
            @Mapping(target = "altitude",source = "flightDto.altitude"),
            @Mapping(target = "arrival",source = "flightDto.arrival"),
            @Mapping(target = "departure",source = "flightDto.departure"),
            @Mapping(target = "flight",source = "flightDto.flight"),
            @Mapping(target = "latitude",source = "flightDto.latitude"),
            @Mapping(target = "longitude",source = "flightDto.longitude"),
            @Mapping(target = "registration",source = "flightDto.registration"),
            @Mapping(target = "source",source = "flightDto.source"),
            @Mapping(target = "station",source = "flightDto.station"),
            @Mapping(target = "type",source = "flightDto.type")
    })
    Flight flightDtoToFlight(FlightDto flightDto);



}
