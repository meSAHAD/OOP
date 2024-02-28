
public interface State {
    public void doAction();
}

public class DoorIsClosed implements State {
    @Override
    public void doAction() {
        System.out.println("Elevator Door is CLOSED. It will now move!");
    }
}

public class DoorIsOpen implements State {
    @Override
    public void doAction() {
        System.out.println("Elevator Door is OPEN. It will not move!");
    }
}

public class Elevator {
    private State state;// private State field

    public Elevator() {// constructor
        System.out.println("Elevator is ready!!");
    }

    // getter and setter for Elevator
    public State getState() {
        return state;
    }

public void setState(State state){
this.state = state;
}
}

