package com.scaler.repositories;

import com.scaler.models.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TicketRepository {
    private Map<Long, Ticket> ticketMap = new HashMap<>();
    private Long ticketId = 0L;

    public Ticket save(Ticket ticket) {
        if (ticket.getId() == null) {
            ticketId++;
            ticket.setId(ticketId);
            ticketMap.put(ticket.getId(), ticket);
        } else {
            ticketMap.put(ticket.getId(), ticket);
        }

        return ticket;
    }

    public Optional<Ticket> findById(Long id) {
        return null;
    }
}
