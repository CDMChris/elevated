import java.util.Scanner;
import java.util.ArrayList;
public class Elevator {
    private int floor;
    ArrayList<Passenger> listOfPassengers = new ArrayList<>();
    public Elevator(int floor){
        this.floor = floor;
    }

    public int getFloor(){
        return this.floor;
    }
    public void setFloor(int floor){
        this.floor = floor;
    }
    public void addPassenger(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name  = input.next();
        System.out.println("What floor would you like to got to?");
        int floor = input.nextInt();
        listOfPassengers.add(new Passenger(floor, name));
    }

    public void removePassenger(){
        for(int i = 0; i <= listOfPassengers.size(); i++){

        }
    }
}
