package learn.com.letskodeit.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created By Bhavesh
 */
public class LoadProperty {
    String projectPath = System.getProperty("user.dir");
    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key){
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }



}
