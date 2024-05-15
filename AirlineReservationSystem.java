//******************************* Importing required libararies *********************************
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//******************************* Passenger Class ***********************************************
class Passenger {
    private String name;
    private int age;
    private String passportNumber;
    
    //*************************** Passenger function *********************************************
    public Passenger(String name, int age, String passportNumber) {
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Passport Number: " + passportNumber;
    }
}


//****************************** Flight Class ***************************************
class Flight {
    private String flightNumber;
    private String destination;
    private int availableSeats;
    private List<Passenger> passengers;

    //*************************** Flight function ***********************************
    public Flight(String flightNumber, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.passengers = new ArrayList<>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    //*************************** Sheet Booking function *******************************
    public boolean bookSeat(Passenger passenger) {
        if (availableSeats > 0) {
            passengers.add(passenger);
            availableSeats--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flight Number: " + flightNumber + ", Destination: " + destination + ", Available Seats: " + availableSeats;
    }
}

//******************************** Airline Reservation Function ***************************
public class AirlineReservationSystem {
    private static List<Flight> flights = new ArrayList<>();

    //***************************** Main Function *****************************************
    public static void main(String[] args) {
        initializeFlights();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Airline Reservation System Menu:");
            System.out.println("1. For List Available Flights");
            System.out.println("2. For Book a Flight");
            System.out.println("3. For Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    listAvailableFlights();
                    break;
                case 2:
                    bookAFlight(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    //*********************** Some Flights Initilization **************************
    private static void initializeFlights() {
        flights.add(new Flight("F1001", "Mubmai", 150));
        flights.add(new Flight("F1002", "Delhi", 200));
        flights.add(new Flight("F1003", "Bangkok", 120));
        flights.add(new Flight("F1004", "New York", 100));
        flights.add(new Flight("F1005", "Dubai", 250));
        flights.add(new Flight("F1006", "Singapur", 190));
        flights.add(new Flight("F1007", "Malasia", 110));
        flights.add(new Flight("F1008", "Los Angeles", 120));
        flights.add(new Flight("F1009", "Californiya", 140));
        flights.add(new Flight("F1010", "Maldives", 200));
        flights.add(new Flight("F1011", "Korea", 90));
        flights.add(new Flight("F1012", "Chicago", 170));
    }

    //********************** List of Available Flights **********************
    private static void listAvailableFlights() {
        System.out.println("Available Flights:");
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    //***************************** Privately Flight Booking Function *********************
    private static void bookAFlight(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your passport number: ");
        String passportNumber = scanner.nextLine();
        System.out.print("Enter the flight number you want to book: ");
        String flightNumber = scanner.nextLine();
        Flight selectedFlight = null;
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                selectedFlight = flight;
                break;
            }
        }
        if (selectedFlight != null) {
            Passenger passenger = new Passenger(name, age, passportNumber);
            if (selectedFlight.bookSeat(passenger)) {
                System.out.println("Your Seat booked successfully!");
            } else {
                System.out.println("Sorry, The flight is already fully booked.");
            }
        } else {
            System.out.println("Invalid flight Number. Please enter the valid flight number.");
        }
    }
}