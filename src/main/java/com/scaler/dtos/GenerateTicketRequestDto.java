package com.scaler.dtos;

import com.scaler.models.VehicleType;
import com.scaler.strategy.ParkingSpotAssignStrategyType;
import com.scaler.strategy.ParkingSpotAssignmentStrategy;

public class GenerateTicketRequestDto {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private Long gateId;
    private String userName;
    private ParkingSpotAssignStrategyType spotAssignStrategyType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public ParkingSpotAssignStrategyType getSpotAssignStrategyType() {
        return spotAssignStrategyType;
    }

    public void setSpotAssignStrategyType(ParkingSpotAssignStrategyType spotAssignStrategyType) {
        this.spotAssignStrategyType = spotAssignStrategyType;
    }
}
