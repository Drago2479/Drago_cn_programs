import java.net.*; 
import java.io.*; 
public class EchoServer_3A{ 
    public static void main(String[] args) throws IOException { 
        try (ServerSocket serverSocket = new ServerSocket(1234)) { 
            System.out.println("server started. waiting for client..."); 
            try (Socket clientSocket = serverSocket.accept(); 
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); 
                 BufferedReader in = new BufferedReader(new 
InputStreamReader(clientSocket.getInputStream()))) { 
                System.out.println("client connected."); 
                out.println("hello from server!"); 
                System.out.println("client says: " + in.readLine()); 
            } 
        } 
    } 
}