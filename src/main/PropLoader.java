package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;


public class PropLoader {

    public static void getProperty(Properties appProps, String pathToProps) {
        String rootPath = "";
        String appConfigPath;

        rootPath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();

        appConfigPath = rootPath + pathToProps;
        try {
            appProps.load(new FileInputStream(appConfigPath));
        } catch (IOException e) {
            System.out.println("Error: Something wrong");
        }
    }
}
