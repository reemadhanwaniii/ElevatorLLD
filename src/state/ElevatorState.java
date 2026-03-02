package state;

import enums.Direction;

public interface ElevatorState {
    void move();
    void addRequest();
    Direction getDirection();
}
