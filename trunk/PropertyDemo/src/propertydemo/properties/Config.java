/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package propertydemo.properties;

/**
 *
 * @author duchuynh
 */
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import org.apache.log4j.Logger;

public class Config {
    public static Logger log = Logger.getLogger(Config.class);
    public static Properties properties;
    static {
         try {
            URL url = Config.class.getResource("config.properties");
            FileInputStream in = new FileInputStream(url.getPath());
            properties = new Properties();
            properties.load(in);
        } catch (Exception ex) {
            log.error("Exception : " + ex.getMessage());
        }
    }
    public static String getParameter(String key){
        return properties.getProperty(key);
    }
}
