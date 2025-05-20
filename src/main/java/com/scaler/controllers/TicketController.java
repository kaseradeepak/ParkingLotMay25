package com.scaler.controllers;

import com.scaler.dtos.GenerateTicketRequestDto;
import com.scaler.dtos.GenerateTicketResponseDto;
import com.scaler.dtos.ResponseStatus;
import com.scaler.exceptions.GateNotFoundException;
import com.scaler.models.Ticket;
import com.scaler.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto) throws GateNotFoundException {

        Ticket ticket = ticketService.generateTicket(
                requestDto.getGateId(),
                requestDto.getVehicleNumber(),
                requestDto.getUserName(),
                requestDto.getVehicleType(),
                requestDto.getSpotAssignStrategyType()
        );

        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);

        return responseDto;
    }
}
