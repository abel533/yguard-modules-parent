package org.example.c.util;

public class FileUtil {
    public static void checkCode() {

    }

    public static String getSuffix(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    public static String getPrefix(String fileName) {
        return fileName.substring(0, fileName.lastIndexOf("."));
    }

    public static String getFileName(String fileName) {
        return fileName.substring(fileName.lastIndexOf("/") + 1);
    }

    public static String getFileNameNoSuffix(String fileName) {
        return fileName.substring(fileName.lastIndexOf("/") + 1, fileName.lastIndexOf("."));
    }

    public static String getFilePath(String fileName) {
        return fileName.substring(0, fileName.lastIndexOf("/"));
    }
}
