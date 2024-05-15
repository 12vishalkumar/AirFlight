# Airline Reservation System

## Overview
  <p align="justify">This Airline Reservation System is a simple console-based application built in Java. It allows users to interact with the system through a menu to list flights, book seats, and exit the program. The system manages flight details and passenger bookings.</p>  

## Features
- **List Available Flights**: Displays all available flights along with their details such as flight number, destination, and available seats.
- **Book a Flight**: Allows a user to book a seat on a flight by providing personal details and selecting a flight based on its number.
- **Dynamic Update of Seat Availability**: Updates the number of available seats as bookings are made.
- **Exit the System**: Allows the user to exit the program.

## How to Run the System
To run this Airline Reservation System, follow these steps:

1. **Ensure Java is installed**:
   - You need Java installed on your computer to compile and run this application. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) if it's not already installed.

2. **Download the source code**:
   - Download the source files to your local machine.

3. **Compile the Program**:
   - Open your terminal or command prompt.
   - Navigate to the directory where the files are stored.
   - Compile the code using the following command:
     ```bash
     javac AirlineReservationSystem.java
     ```

4. **Run the Compiled Program**:
   - Run the program with the following command:
     ```bash
     java AirlineReservationSystem
     ```

## Classes Used

### `Passenger`
- **Attributes**: Name, Age, Passport Number
- **Methods**:
  - `getName()`: Returns the passenger's name.
  - `toString()`: Provides a string representation of the passenger details.

### `Flight`
- **Attributes**: Flight Number, Destination, Available Seats, List of Passengers
- **Methods**:
  - `getFlightNumber()`, `getDestination()`, `getAvailableSeats()`: Return respective flight details.
  - `getPassengers()`: Returns a list of all passengers booked on the flight.
  - `bookSeat(Passenger passenger)`: Attempts to book a seat for a passenger and updates seat availability.

### `AirlineReservationSystem`
- Implements the main method and user interaction loop.
- Handles initialization of flights and user commands.

## Future Enhancements
- Adding more complex features like cancellation of bookings.
- Implementing a graphical user interface using Java Swing or JavaFX.
- Extending functionality to include different classes of service (economy, business, first class).
- Integration with a database for persistent storage of flight and passenger data.

## Conclusion
<p align="justify">This Java-based Airline Reservation System demonstrates basic principles of object-oriented programming and user interaction in a console application. It provides a foundational framework that can be expanded with additional features and user interface improvements.</p>
