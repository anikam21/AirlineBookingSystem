# ✈️ Flight Booking System

##  Overview
The **Flight Booking System** is a Java-based console application that simulates an airline ticket booking system.  
It allows passengers to book flights, applies discounts based on membership status, and displays available flights.

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

---
## 📊 Sample Output
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
