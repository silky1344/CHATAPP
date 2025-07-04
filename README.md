# CHATAPP
NAME- SILKY SHARMA 
DOMAIN NAME- JAVA PROGRAMMING
DURATION- 4 WEEKS 
MENTOR- NEELAM SANTOSH
COMPANY- CODTECH IT SOLUTIONS

CHAT SERVER
The Chat Server is a Java application that listens for incoming client connections on a specified port. It acts as a central hub where all client messages are received and then relayed to other connected clients. The server uses ServerSocket to listen for connections and Socket to communicate with each client. For handling multiple clients simultaneously, the server employs multithreading. Each connected client is handled by a separate thread, often implemented by extending the Thread class or using the Runnable interface.The server keeps track of all active client sockets, usually stored in a shared list or map. When a client sends a message, the server reads it through input streams, then broadcasts it to all other clients via output streams. This setup allows real-time communication among clients. Exception handling and synchronization are also essential to ensure the server handles disconnections and message broadcasting smoothly.

CHAT CLIENT
The Chat Client is a Java program that connects to the chat server using the server’s IP address and port. It uses the Socket class to establish the connection. After connecting, the client can send messages to the server, which then forwards the messages to all other connected clients.The client uses one thread to handle user input and send messages, and another thread to continuously listen for incoming messages from the server. This two-thread design ensures that message receiving does not block message sending and vice versa. Input from the user is often taken from the console using Scanner or BufferedReader, and output is displayed in the console as well.
This project is useful for learning socket programming, multithreading, and inter-process communication in Java. It's also a foundational step toward building more complex applications like messaging apps, customer support chatbots, or real-time multiplayer games.
A Java-based chat server and client system supports one-to-many messaging, private messaging, and even file transfers with more advanced implementations. Such systems can be extended with GUI components using Swing or JavaFX to make them more user-friendly.
