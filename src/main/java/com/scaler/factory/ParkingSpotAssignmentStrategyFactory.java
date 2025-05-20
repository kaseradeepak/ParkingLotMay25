package com.scaler.factory;

import com.scaler.strategy.NearestParkingSpotAssignmentStrategy;
import com.scaler.strategy.ParkingSpotAssignStrategyType;
import com.scaler.strategy.ParkingSpotAssignmentStrategy;
import com.scaler.strategy.RandomParkingSpotAssignmentStrategy;

public class ParkingSpotAssignmentStrategyFactory {
    public static ParkingSpotAssignmentStrategy getParkingSpotAssignStrategy(
            ParkingSpotAssignStrategyType spotAssignStrategyType) {
        if (spotAssignStrategyType.equals(ParkingSpotAssignStrategyType.RANDOM)) {
            return new RandomParkingSpotAssignmentStrategy();
        } else if (spotAssignStrategyType.equals(ParkingSpotAssignStrategyType.NEAREST)) {
            return new NearestParkingSpotAssignmentStrategy();
        }

        return null;
    }
}
