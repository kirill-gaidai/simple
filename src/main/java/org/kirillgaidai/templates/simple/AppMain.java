package org.kirillgaidai.templates.simple;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppMain {

    final private static Logger LOGGER = LogManager.getLogger(AppMain.class);

    public static void main(String[] args) {
        AppClass appClass = new AppClass();
        LOGGER.info(appClass.getMessage());
    }

}
