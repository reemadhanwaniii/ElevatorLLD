package models;

import Observer.ElevatorObserver;
import enums.Direction;
import state.ElevatorState;
import state.IdleState;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Elevator {
  private final int id;
  private ElevatorState state;
  private AtomicInteger floorNo;
  private boolean isRunning;

  private final TreeSet<Integer> upRequests;
  private final TreeSet<Integer> downRequests;

  private final List<ElevatorObserver> observers;

  public Elevator(int id) {
      this.id = id;
      this.state = new IdleState();
      this.floorNo = new AtomicInteger(0);
      this.isRunning = false;
      this.upRequests = new TreeSet<>();
      this.downRequests = new TreeSet<>((a,b)->b-a);
      this.observers = new ArrayList<>();
  }

//  getters-setters

    public int getId() {
      return this.id;
    }

    public int getFloor() {
      return floorNo.get();
    }

    public Direction getDirection() {
      return this.state.getDirection();
    }

    public TreeSet<Integer> getUpRequest() {
      return this.upRequests;
    }

    public TreeSet<Integer> getDownRequest() {
      return this.downRequests;
    }

    public boolean isRunning(){
      return this.isRunning;
    }

    public void stopElevator(){
      this.isRunning = false;
    }

    public void setFloor(int floorNo) {
      this.floorNo.set(floorNo);
    }

    public void setState(ElevatorState state) {
     this.state = state;
    }
}
