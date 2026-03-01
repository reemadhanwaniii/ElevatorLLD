# Elevator Design

### Objective : Design and implement an Elevator System that can handle multiple requests, move between floors, and manage direction


## Functional Requirements:

- 3 elevator cars shall server building with upto 15 floors. The number of floors shall be configurable or scalable we can accomodate more number of floors.
- elevator can move in UP,DOWN direction or it is idle.
- doors shall open when it is idle not in motion state.
- we have internal and external display.
- internal display shows movement direction and floor
- external display shows movement direction
- control panel : 1. external 2. internal
- internal control panel have floor buttons and door actions buttons.
- external control panel have direction button and external panel should be present on every floor.
- Each elevator shall have a capacity of 8 peoples maximum 680kg weight allowed.
- Dispatcher Service : multiple strategies of movement shall be decided at runtime.
   for example : SCAN, LOOK , FIFO.

## Non-functional Requirements: 

- The design should follow object-oriented approach with clear seperation of concern.
- The code should be modular and extendable.
- The dispatch strategy/movement strategy should be swappable at runtime without modifying code logic.
- Well defined states and transition of states.
