import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class startDocker {
    @Test
    public void startFile() throws IOException {
      //  Runtime runtime=Runtime.getRuntime();
       // runtime.exec("sh command.sh");

       //String []command={"docker-compose","-f","docker-compose.yml","up"};
        ProcessBuilder processBuilder=new ProcessBuilder(new String[]{"sh","command.sh"});
        processBuilder.directory();

        try {
            Process process = processBuilder.start();

           BufferedReader reader=new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            while((line = reader.readLine())!=null){
System.out.println(line);
           }}
        catch (Exception e){
            e.printStackTrace();
        }






    }




}
