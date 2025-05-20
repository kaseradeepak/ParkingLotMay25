package com.scaler.repositories;

import com.scaler.models.Vehicle;

import javax.swing.tree.VariableHeightLayoutCache;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    private Map<Long, Vehicle> vehicleMap = new HashMap<>();
    private Long vehicleId = 0L;

    public Vehicle save(Vehicle vehicle) {
        return null;
    }

    public Optional<Vehicle> findById(Long vehicleId) {
        return null;
    }

    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber) {
        for (Vehicle vehicle : vehicleMap.values()) {
            if (vehicle.getVehicleNumber().equals(vehicleNumber)) {
                return Optional.of(vehicle);
            }
        }

        return Optional.empty();
    }
}
