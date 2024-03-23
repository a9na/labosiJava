import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

    public static void main(String[] args) {
        try {

            Socket socket = new Socket("127.0.0.1", 12345);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Unesite poruku: ");
            String message = reader.readLine();

            output.println(message);

            String response = input.readLine();
            System.out.println("Poslužitelj: " + response);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
