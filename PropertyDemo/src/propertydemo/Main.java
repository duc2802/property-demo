/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package propertydemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import propertydemo.properties.Config;

/**
 *
 * @author duchuynh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {       
        System.out.println(Config.getParameter("last.name"));
    }
}
