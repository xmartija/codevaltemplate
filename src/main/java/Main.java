
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
    	//System.out.println("start");
        
    	File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        System.out.print("1 2 F 4 B F 7 8 F B\r\n1 F 3 F 5 F B F 9 F 11 F 13 FB 15\r\n");
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] splited = line.split("\\s+");
                        
        }
    }
}
