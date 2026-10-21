🔌 Java Server-Client Socket Programming

A simple Java Socket Programming project that demonstrates communication between a Server and a Client using TCP sockets.

The client connects to the server through a specific port, sends a message, and receives a response from the server.

🚀 Features
🔗 Establishes a connection between Server and Client
📡 Uses TCP Socket communication
💬 Client sends a message to the Server
📩 Server receives and displays the message
↩️ Server sends a response back to the Client
🖥️ Displays communication messages in the console
🔒 Closes the connection after communication
🛠️ Technologies Used
Java
Socket Programming
TCP/IP
ServerSocket
Socket
BufferedReader
PrintWriter
InputStream / OutputStream
📂 Project Structure
Java-Server-Client/
│
├── Server.java
├── client.java
└── README.md
🔄 How the Project Works

The project follows a simple communication process:

        SERVER
          │
          │  Waits for connection
          ▼
     ServerSocket
          │
          │
       Connect
          ▲
          │
        CLIENT
          │
          │ "Hello Server"
          ▼
        SERVER
          │
          │ "Hello Client"
          ▼
        CLIENT
Communication Flow
The Server starts first.
The server creates a ServerSocket on port 5000.
The server waits for a client using accept().
The Client connects to localhost on port 5000.
The client sends "Hello Server".
The server receives the message.
The server sends "Hello Client" as a response.
The client receives and displays the response.
Both connections are closed.
💻 Server Code

The Server.java program creates a server and waits for a client connection.

Important classes used:

ServerSocket
Socket
BufferedReader
PrintWriter

The server listens on:

Port: 5000
Host: localhost
💻 Client Code

The client.java program connects to the server using:

Socket socket = new Socket("localhost", 5000);

It sends:

Hello Server

and receives:

Hello Client
▶️ How to Run the Project
Step 1: Open the Project

Open the project in VS Code, IntelliJ IDEA, Eclipse, or any Java IDE.

Step 2: Compile the Files

Open the terminal in the project folder and run:

javac -d . Server.java client.java
Step 3: Start the Server

Run the server first:

java serverclient.Server

You should see:

Server started...
Waiting for client...
Step 4: Start the Client

Open another terminal and run:

java serverclient.client

The client should display:

Connected to server.
Server says: Hello Client
Connection closed.

The server will display:

Server started...
Waiting for client...
Client connected.
Client says: Hello Server
Connection closed.
📌 Sample Output
Server Output
Server started...
Waiting for client...
Client connected.
Client says: Hello Server
Connection closed.
Client Output
Connected to server.
Server says: Hello Client
Connection closed.
📚 Concepts Demonstrated
1. ServerSocket

ServerSocket is used by the server to listen for incoming client connections.

ServerSocket ServerSocket = new ServerSocket(5000);
2. Socket

Socket is used to establish communication between the client and server.

Socket socket = new Socket("localhost", 5000);
3. BufferedReader

Used to read messages received through the socket.

BufferedReader input =
    new BufferedReader(
        new InputStreamReader(socket.getInputStream()));
4. PrintWriter

Used to send messages through the socket.

PrintWriter output =
    new PrintWriter(socket.getOutputStream(), true);
🎯 Learning Outcomes

By completing this project, you can understand:

Basics of Java networking
Client-server architecture
TCP socket communication
ServerSocket and Socket
Input and output streams
Sending and receiving messages
Exception handling using IOException
🔮 Future Improvements

This basic project can be extended by adding:

💬 Two-way continuous chat
👥 Multiple clients
📨 User-entered messages
🧵 Multithreading for multiple clients
🔐 Secure communication
🖥️ GUI-based chat application
📁 File transfer between client and server
⭐ Project Highlights

Java + Socket Programming + TCP + Client-Server Communication

This project is useful for understanding the fundamentals of network programming in Java.

👩‍💻 Author

Java Server-Client Socket Programming Project

Built using Java TCP Socket Programming.
