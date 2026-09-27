package basic_chize;

import java.util.Scanner;

class AirTicketManagement {

    static class Ticket {
        String passengerName;
        String source;
        String destination;
        String flightNo;
        int seatNo;

        Ticket(String passengerName, String source, String destination,
               String flightNo, int seatNo) {
            this.passengerName = passengerName;
            this.source = source;
            this.destination = destination;
            this.flightNo = flightNo;
            this.seatNo = seatNo;
        }

        void display() {
            System.out.println("Passenger Name : " + passengerName);
            System.out.println("From           : " + source);
            System.out.println("To             : " + destination);
            System.out.println("Flight Number  : " + flightNo);
            System.out.println("Seat Number    : " + seatNo);
            System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ticket[] tickets = new Ticket[100];
        int count = 0;

        while (true) {

            System.out.println("\n===== AIR TICKET MANAGEMENT SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter Passenger Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Source: ");
                String source = sc.nextLine();

                System.out.print("Enter Destination: ");
                String destination = sc.nextLine();

                System.out.print("Enter Flight Number: ");
                String flightNo = sc.nextLine();

                System.out.print("Enter Seat Number: ");
                int seatNo = sc.nextInt();
                sc.nextLine();

                tickets[count] = new Ticket(
                        name, source, destination, flightNo, seatNo
                );

                count++;

                System.out.println("Ticket booked successfully!");

            } else if (choice == 2) {

                if (count == 0) {
                    System.out.println("No tickets available.");
                } else {

                    System.out.println("\n===== BOOKED TICKETS =====");

                    for (int i = 0; i < count; i++) {
                        tickets[i].display();
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter Passenger Name to Search: ");
                String searchName = sc.nextLine();

                boolean found = false;

                for (int i = 0; i < count; i++) {

                    if (tickets[i].passengerName.equalsIgnoreCase(searchName)) {
                        tickets[i].display();
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Ticket not found.");
                }

            } else if (choice == 4) {

                System.out.println("Thank you for using Air Ticket Management System!");
                break;

            } else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}


