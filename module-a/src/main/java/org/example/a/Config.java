package org.example.a;

import java.util.concurrent.ConcurrentHashMap;

public class Config {
    private static final java.util.Map<String, String> config = new ConcurrentHashMap<>();

    public static String get(String key) {
        return config.get(key);
    }

    public static void set(String key, String value) {
        config.put(key, value);
    }
}
