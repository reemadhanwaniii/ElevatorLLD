package state;

import enums.Direction;
import models.Elevator;
import models.Request;

public class IdleState implements ElevatorState{


    @Override
    public void move(Elevator elevator) {
        if(!elevator.getUpRequest().isEmpty()) {
            elevator.setState(new MovingUpState());
        }else if(!elevator.getDownRequest().isEmpty()) {
            elevator.setState(new MovingDownState());
        }
//        else stay idle
    }

    @Override
    public void addRequest(Elevator elevator, Request request) {
            if(request.getTargetFloor() > elevator.getFloor()) {
                elevator.getUpRequest().add(request.getTargetFloor());
            }else if(request.getTargetFloor() < elevator.getFloor()) {
                elevator.getDownRequest().add(request.getTargetFloor());
            }
//            else if request is for current floor then door would open
    }

    @Override
    public Direction getDirection() {
        return Direction.IDLE;
    }
}
