package state;

import enums.Direction;
import models.Elevator;
import models.Request;

public class MovingDownState implements ElevatorState{


    @Override
    public void move(Elevator elevator) {
        if(elevator.getDownRequest().isEmpty()){
            elevator.setState(new IdleState());
            return;
        }
        Integer nextFloor = elevator.getDownRequest().first();
        elevator.setFloor(elevator.getFloor()-1);
        if(nextFloor == elevator.getFloor()) {
            System.out.println("Elevator  :" + elevator.getId()+ "Stopped at :" + elevator.getFloor());
            elevator.getDownRequest().pollFirst();
        }
        if(elevator.getDownRequest().isEmpty()) {
            elevator.setState(new IdleState());
        }
    }

    @Override
    public void addRequest(Elevator elevator, Request request) {

    }

    @Override
    public Direction getDirection() {
        return Direction.DOWN;
    }
}
