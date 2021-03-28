package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // In this class we will implement the repeated steps of reading


    //1# - Create the object of Properties
    private static Properties properties =new Properties();

    static {// get the path for open file
        try {
            FileInputStream file= new FileInputStream("configuration.properties");
            // #3 -// #3 -load the opened file into properties object
            properties.load(file);

            // closing the file in JVM Memory
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 4# - Use the object to read from the configuration.properties
    public static String getProperty(String keyWord){

        return properties.getProperty(keyWord);
    }

}




