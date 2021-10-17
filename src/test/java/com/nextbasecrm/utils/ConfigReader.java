package com.nextbasecrm.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();
    static{
        try{
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            file.close();
        } catch (IOException e){
            System.out.println("File not found in config.properties");
        }
    }

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}
