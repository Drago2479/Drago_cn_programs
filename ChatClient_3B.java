import java.io.*;  
import java.net.*;  
class ChatClient_3B{ 
    public static void main(String[] args) throws Exception { 
        try (Socket s = new Socket(InetAddress.getLocalHost(), 4000); 
             BufferedReader in = new BufferedReader(new 
InputStreamReader(s.getInputStream())); 
             PrintWriter out = new PrintWriter(s.getOutputStream(), true); 
             BufferedReader kb = new BufferedReader(new InputStreamReader(System.in))) { 
            System.out.println("Type \"end\" to quit"); 
            String msg; 
            while (true) { 
                System.out.print("Message to Server: "); 
                msg = kb.readLine(); 
                out.println(msg); 
                if (msg.equals("end")) break; 
                System.out.println("Client: " + in.readLine()); 
            } 
        } 
    } 
}