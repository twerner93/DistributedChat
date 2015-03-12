package dhbw.verteiltesysteme.distributedchat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

    private List<Socket> connections = new ArrayList<Socket>();

    public ChatServer(int port) throws IOException {
        ServerSocket server = new ServerSocket(port);

        while(true) {
            Socket client;
            try {
                client = server.accept();
                handleConnection(client);
            } catch (IOException e) {
                
            }
        }
    }

    private synchronized void sendToAll(String msg, Socket fromClient) {
        for (Socket client : connections) {
            // TODO print message
        }
    }

    private void handleConnection(Socket client) {
        this.sendToAll("Someone joined the chat", client);

        connections.add(client);
    }
}
