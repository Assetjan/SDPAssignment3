package com.example.adapter;

public class Main {
    private static final MyLogger logger = new CommonsLoggingAdapter(Main.class);

    public static void main(String[] args) {
        logger.info("Запуск");
        logger.error("Ошибка");
    }
}
