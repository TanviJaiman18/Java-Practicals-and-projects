🧮 Java RMI Calculator

A simple Java RMI (Remote Method Invocation) based Calculator project that demonstrates how a client can call methods running on a remote server.

📌 Project Overview

This project implements a basic calculator using Java RMI.

The client sends calculation requests to the RMI server, and the server performs the operations and returns the results.

✨ Operations Available
➕ Addition
➖ Subtraction
🛠️ Technologies Used
Java
Java RMI
Remote Interface
Client-Server Architecture
📂 Project Structure
Java-RMI-Calculator/
│
├── Calculator.java
├── Calculatorimpl.java
├── server.java
├── client.java
└── README.md
📄 File Description
File	Description
Calculator.java	Defines the remote methods
Calculatorimpl.java	Implements the calculator methods
server.java	Starts the RMI server and registers the object
client.java	Connects to the server and calls the methods
🔄 How It Works
        Client
          |
          | RMI Request
          ↓
     RMI Registry
          |
          ↓
       Server
          |
          ↓
   Calculatorimpl
          |
          ↓
      Result
The Calculator interface extends Remote.
Calculatorimpl implements the remote methods.
The server creates the calculator object.
The server registers the object using Naming.rebind().
The client finds the remote object using Naming.lookup().
The client calls add() and subtract() remotely.
The server performs the calculation and returns the result.
▶️ How to Run
Step 1: Compile the Java Files

Open the terminal in the project folder and run:

javac *.java
Step 2: Start the RMI Registry

Open a terminal and run:

rmiregistry

Keep this terminal running.

Step 3: Start the Server

Open another terminal and run:

java server

You should see:

RMI server started...
Step 4: Run the Client

Open another terminal and run:

java client
💻 Sample Output
Addition = 30
substraction =10
🎯 Learning Objectives

This project helps in understanding:

Java RMI
Remote interfaces
Client-server communication
RMI Registry
Remote method invocation
Exception handling using RemoteException
🚀 Future Improvements

The project can be extended by adding:

Multiplication
Division
Modulus
A graphical user interface (GUI)
Better exception handling
More calculator operations
👩‍💻 Author

Tanvi Jaiman
