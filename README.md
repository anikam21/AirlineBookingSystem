# ✈️ Flight Booking System

##  Overview
This **Flight Booking System** is a Java-based console application that allows passengers to book airline tickets,  
applies different discount policies based on membership status, and prevents overbooking.  

This project was built using **Java**, leveraging **Object-Oriented Programming (OOP) principles**, including:  
- **Encapsulation** – Private attributes with getter and setter methods.  
- **Inheritance** – The `Passenger` superclass with `Member` and `NonMember` subclasses.  
- **Polymorphism** – The `applyDiscount()` method is overridden in each subclass.  
- **Abstraction** – `Passenger` is an abstract class requiring subclasses to define `applyDiscount()`.  

### 🔍 **Testing Approach**
This project includes **unit tests using JUnit** to validate key functionalities.  
Some of the key tests implemented:
- **Flight Class Tests:**
  - Ensures a **flight cannot be created** with the same origin and destination.
  - Verifies that **booking a seat decreases available seats**.
- **Passenger & Discount Tests:**
  - Tests that **Members receive the correct discount** based on membership years.
  - Ensures that **NonMembers over 65 get a 10% discount**.
- **Integration Tests:**
  - Simulates the **full booking process** and verifies final ticket prices.

JUnit was used to verify that methods function correctly and **edge cases (like overbooking) are handled properly**.
---

##  Features
-  **Flight Management** – Create and display flights.
-  **Ticket Booking** – Allows passengers to book available flights.
-  **Discount Application** –  
  - **Members:**  
    - **6+ years** → **50% discount**  
    - **1-5 years** → **10% discount**  
  - **Non-Members:**  
    - **Age > 65** → **10% discount**
-  **Handles Full Flights** – Prevents overbooking.
-  **JUnit Tests** – Ensures correct functionality.


##  Sample Output
```sh
Available flights from Chicago to Houston:
Flight 2003, Chicago to Houston, 09/10/2023 2:00 pm, original price: $300.00

Attempting to book: Member Info: Name: Alice, Age: 22, Years of Membership: 6 on Flight 2003
Booking successful.
Final Ticket Price: $150.00

Attempting to book: Member Info: Name: Bob, Age: 24, Years of Membership: 4 on Flight 2003
Booking successful.
Final Ticket Price: $270.00

Attempting to book: Member Info: Name: Charlie, Age: 26, Years of Membership: 0 on Flight 2003
Booking failed. No seats available.

Booked Tickets:
Ticket #1: Passenger: Alice, Flight 2003, Chicago to Houston, 09/10/2023 2:00 pm, Original Price: $300.00, Final Price: $150.00
Ticket #2: Passenger: Bob, Flight 2003, Chicago to Houston, 09/10/2023 2:00 pm, Original Price: $300.00, Final Price: $270.00

```
---
##  Lessons Learned & Challenges

###  What Was Learned:
- **Object-Oriented Programming (OOP)**  
  - Applied **inheritance** with `Passenger`, `Member`, and `NonMember` classes.  
  - Used **polymorphism** to apply different discounts dynamically.  
  - Implemented **encapsulation** by keeping attributes `private` and using getters/setters.  

- **Java Collections & Data Structures**  
  - Used an **array (`Flight[]`)** to store flights.  
  - Used an **`ArrayList<Ticket>`** to manage booked tickets dynamically.  

- **Exception Handling & Validation**  
  - Prevented invalid flights where `origin == destination`.  
  - Ensured a **flight cannot be overbooked** (booking fails if `numberOfSeatsLeft == 0`).  

- **JUnit Testing**  
  - Created unit tests for the `Flight` class to check constructor validation and seat booking behavior.  
  - Verified **discount logic** in tests to ensure correct pricing.  

---

### ⚠Challenges Faced:

1. **Managing Ticket Numbers**  
   - **Issue:** Each ticket needed a **unique ticket number**, but it had to be assigned dynamically.  
   - **Solution:** Used a **static counter (`numTickets`)** in `Ticket.java` to automatically generate **incremental ticket numbers**.  

2. **Applying Discounts Correctly**  
   - **Issue:** Discounts weren’t initially applied properly because `applyDiscount()` wasn’t called before creating the ticket.  
   - **Solution:** Made sure to call `applyDiscount(flight.getOriginalPrice())` inside `Manager.bookSeat()`.  

3. **Handling Flight Overbooking**  
   - **Issue:** The system originally allowed more passengers to book than available seats.  
   - **Solution:** Checked `numberOfSeatsLeft > 0` before booking a seat and displayed `"Booking failed. No seats available."` when necessary.  

4. **Formatting Output Properly**  
   - **Issue:** The ticket output was unclear when printing the final ticket price.  
   - **Solution:** Improved **`toString()` formatting** in `Ticket.java` and added `"Final Ticket Price: $"` print statements after each booking.  

---

##  Future Learning Goals:
- Learn how to **integrate a database (MySQL)** for persistent flight and booking storage.  
- Implement a **GUI (JavaFX or Swing)** for a better user experience.  
- Expand the system to support **cancellations and refunds**.  
