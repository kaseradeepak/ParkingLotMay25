package com.scaler.strategy;

import com.scaler.models.ParkingSpot;
import com.scaler.models.Vehicle;

public interface ParkingSpotAssignmentStrategy {
    ParkingSpot assignParkingSpot(Vehicle vehicle);
}
