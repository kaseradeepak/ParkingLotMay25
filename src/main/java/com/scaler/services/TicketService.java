package com.scaler.services;

import com.scaler.exceptions.GateNotFoundException;
import com.scaler.models.*;
import com.scaler.repositories.GateRepository;
import com.scaler.repositories.VehicleRepository;
import com.scaler.strategy.ParkingSpotAssignStrategyType;
import com.scaler.strategy.ParkingSpotAssignmentStrategy;

import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket generateTicket(Long gateId,
                                 String vehicleNumber,
                                 String userName,
                                 VehicleType vehicleType,
                                 ParkingSpotAssignStrategyType strategyType) throws GateNotFoundException {
        /*
        1. Get the gate object from the DB.
        2. If gateId is invalid, throw an exception.
        3. Check if the vehicle is present in the DB or not.
        4. If yes, good else store the vehicle object in the DB.
        5. Assign the parking spot.
        6. Generate the ticket.
         */

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            //Invalid gateId.
            throw new GateNotFoundException("Gate with id: " + gateId + " not found.");
        }
        Gate gate = optionalGate.get();

        Optional<Vehicle> optionalVehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);

        Vehicle vehicle = null;
        if (optionalVehicle.isEmpty()) {
            //Create the vehicle object and save it into the DB.
            vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(userName);

            vehicle = vehicleRepository.save(vehicle);
        } else {
            vehicle = optionalVehicle.get();
        }

        ParkingSpot parkingSpot =


    }

}
