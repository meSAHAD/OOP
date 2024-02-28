
public class ElevatorDemo {
    public static void main(String[] args) {
        
        Elevator elevator = new Elevator();

        State openState = new DoorIsOpen();
        State closeState = new DoorIsClosed();
        
        elevator.setState(openState);
        elevator.getState().doAction();
        elevator.setState(closeState);
        elevator.getState().doAction();
    }
}


