import java.net.*; 
import java.io.*; 
public class EchoClient_3A{ 
    public static void main(String[] args) throws IOException { 
        System.out.println("trying to connect..."); 
        try (Socket socket = new Socket("localhost", 1234); 
             BufferedReader in = new BufferedReader(new 
InputStreamReader(socket.getInputStream())); 
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) { 
            System.out.println("connected to server."); 
            System.out.println("server says: " + in.readLine()); 
            out.println("hello from client!"); 
        } 
    } 
}