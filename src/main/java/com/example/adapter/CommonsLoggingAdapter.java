package com.example.adapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

class CommonsLoggingAdapter implements MyLogger {
    private final Log commonsLog;

    public CommonsLoggingAdapter(Class<?> clazz) {
        this.commonsLog = LogFactory.getLog(clazz);
    }

    @Override
    public void info(String msg) {
        commonsLog.info(msg);
    }

    @Override
    public void error(String msg) {
        commonsLog.error(msg);
    }
}