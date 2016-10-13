
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
    	//System.out.println("start");
        
    	File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] splited = line.split("\\s+");
            
            int end=Integer.valueOf(splited[2]);
            int fizz=Integer.valueOf(splited[0]);
            int buzz=Integer.valueOf(splited[1]);
            
            for(int i=1;!(i> end) ;i++){
            	if(i%fizz==0){
            		System.out.print('F');
            	}
            	
            	if(i%buzz==0){
            		System.out.print('B');
            	}
            	
            	if((i%fizz!=0)&&(i%buzz!=0)){
            		System.out.print(i);
            	}
            	
            	if(!(i==end)){
            		System.out.print(' ');
            	}
            }
            
            System.out.println();
        }
    }
}
