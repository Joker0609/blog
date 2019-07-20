package com.personal.blog.base.utils;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author weizp
 */
@Slf4j
public class Printer {

    private static final Logger log = LoggerFactory.getLogger(Printer.class);

    public static void info(String message) {
        log.info(message);
    }

    public static void debug(String message) {
        log.debug(message);
    }

    public static void warn(String message) {
        log.warn(message);
    }

    public static void error(String message) {
        log.error(message);
    }

    public static void error(String message, Throwable t) {
        log.error(message, t);
    }

    public static void error(Throwable t) {
        log.error(t.getMessage(), t);
    }
}
