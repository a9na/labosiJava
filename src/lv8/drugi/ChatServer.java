import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatServer {
    public static void main(String[] args) {
        try {

            DatagramSocket serverSocket = new DatagramSocket(12345);
            System.out.println("Chat poslužitelj je aktivan.");

            byte[] receiveData = new byte[1024];

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());

                String filteredMessage = filterMessage(message);

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                byte[] sendData = filteredMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
            }
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
