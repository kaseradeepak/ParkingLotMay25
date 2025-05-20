package com.scaler.repositories;

import com.scaler.models.Gate;
import com.scaler.models.Operator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//In Memory DB -> List or pr
public class GateRepository {
    private Map<Long, Gate> gateMap = new HashMap<>();
    private Long gateId = 0L;

    public Gate save(Gate gate) {
        //update + insert
        if (gate.getId() == null) {
            //insert
            gateId++;
            gate.setId(gateId);
            gateMap.put(gateId, gate);
        } else {
            //update
            gateMap.put(gate.getId(), gate);
        }

        return gate;
    }

    public Optional<Gate> findById(Long gateId) {
        if (gateMap.containsKey(gateId)) {
            return Optional.of(gateMap.get(gateId));
        }
        return Optional.empty();
    }
}
