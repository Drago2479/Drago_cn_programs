import java.io.*;  
import java.net.*;  
class ChatServer_3B{ 
    public static void main(String[] args) throws Exception { 
        ServerSocket ss = new ServerSocket(4000); 
        System.out.println("Server started"); 
        try (Socket s = ss.accept(); 
             BufferedReader in = new BufferedReader(new 
InputStreamReader(s.getInputStream())); 
             PrintWriter out = new PrintWriter(s.getOutputStream(), true); 
             BufferedReader kb = new BufferedReader(new InputStreamReader(System.in))) { 
            System.out.println("client connected"); 
            String msg; 
            while (!(msg = in.readLine()).equals("end")) { 
                System.out.println("Server: " + msg); 
                System.out.print("Message to Client: "); 
                out.println(kb.readLine()); 
            } 
            System.out.println("Client Disconnected"); 
        } 
    } 
} 