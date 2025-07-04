import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.print("Enter your name: ");
        String name = keyboard.readLine();
        out.println(name);

        // Thread to read messages from server
        new Thread(() -> {
            String message;
            try {
                while ((message = in.readLine()) != null) {
                    System.out.println(message);
                }
            } catch (IOException e) {
                System.out.println("Connection closed.");
            }
        }).start();

        // Sending messages to server
        String userInput;
        while ((userInput = keyboard.readLine()) != null) {
            out.println(userInput);
        }

        socket.close();
    }
}
