package state;

import enums.Direction;
import models.Elevator;
import models.Request;

public class MovingUpState implements ElevatorState{


    @Override
    public void move(Elevator elevator) {

    }

    @Override
    public void addRequest(Elevator elevator, Request request) {

    }

    @Override
    public Direction getDirection() {
        return Direction.UP;
    }
}
