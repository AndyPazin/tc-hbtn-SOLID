import java.io.IOException;
import java.util.logging.FileHandler;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.logging.SimpleFormatter;

public class LoggerInFile {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("MyLog");

        try {
        FileHandler fileHandler = new FileHandler("logs.txt", true);

        logger.addHandler(fileHandler);

        SimpleFormatter simpleFormatter = new SimpleFormatter();

        fileHandler.setFormatter(simpleFormatter);

        logger.info("Log test");

        logger.info("Hi In the main class test");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error during log file setup", e); // Log do erro de setup
        }

    }

}