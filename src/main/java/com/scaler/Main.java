package com.scaler;

import com.scaler.controllers.TicketController;
import com.scaler.dtos.GenerateTicketRequestDto;
import com.scaler.exceptions.GateNotFoundException;
import com.scaler.models.Ticket;
import com.scaler.models.VehicleType;
import com.scaler.repositories.GateRepository;
import com.scaler.repositories.TicketRepository;
import com.scaler.repositories.VehicleRepository;
import com.scaler.services.TicketService;
import com.scaler.strategy.ParkingSpotAssignStrategyType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws GateNotFoundException {
        GenerateTicketRequestDto requestDto = new GenerateTicketRequestDto();
        requestDto.setGateId(123L);
        requestDto.setVehicleNumber("KA01X1234");
        requestDto.setUserName("Abhishek");
        requestDto.setVehicleType(VehicleType.SUV);
        requestDto.setSpotAssignStrategyType(ParkingSpotAssignStrategyType.NEAREST);

        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        Ticket ticket = ticketController.generateTicket(requestDto).getTicket();
    }
}