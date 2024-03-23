import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Chat poslužitelj je aktivan i osluškuje na adresi: " + serverSocket.getInetAddress().getHostAddress() + ", portu: " + serverSocket.getLocalPort());


            Socket clientSocket = serverSocket.accept();

            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);


            String message = input.readLine();


            String filteredMessage = filterMessage(message);


            output.println(filteredMessage);

 
            clientSocket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String filterMessage(String message) {

        String[] bannedWords = {"psovka1", "psovka2", "psovka3", "uvreda1", "uvreda2", "uvreda3"};
        for (String word : bannedWords) {
            message = message.replaceAll(word, new String(new char[word.length()]).replace('\0', '*'));
        }
        return message;
    }
}
