import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Unesite poruku: ");
            String message = scanner.nextLine();

            byte[] sendData = message.getBytes();

            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
            int serverPort = 12345;

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            String filteredMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());

            System.out.println("Poslužitelj: " + filteredMessage);

            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
