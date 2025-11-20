import java.io.*; 
import java.net.*; 
public class Experiment_2{ 
    public static void main(String[] args) { 
        String website = "https://www.gstatic.com/webp/gallery/1.jpg"; 
        String fileName = "test_image.jpg"; 
        try (InputStream in = new URL(website).openStream(); 
             OutputStream out = new FileOutputStream(fileName)) { 
            System.out.println("Downloading File From: " + website); 
            byte[] buffer = new byte[2048]; 
            int bytesRead; 
            while ((bytesRead = in.read(buffer)) != -1) { 
                out.write(buffer, 0, bytesRead); 
            } 
            System.out.println("Download complete."); 
        } catch (IOException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
}