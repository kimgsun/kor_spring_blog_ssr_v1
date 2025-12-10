package org.example.demo_ssr_v1_1.utils;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDateUtil {
    // 정적 메서드 (기능) 시간 포맷터 기능 1개
    public static void timeStampFormat(Timestamp timestamp) {
        LocalDateTime localDateTime = timestamp.toLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = localDateTime.format(formatter);
    }
}
