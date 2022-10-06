package com.example.example.web.mappers;


import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Component
public class DateMapper {
    public OffsetDateTime convertOffsetDateTime(Timestamp ts) {
        return OffsetDateTime.now();
    }

    public Timestamp asTimestamp(OffsetDateTime offsetDateTime) {
        LocalDateTime localDateTime = offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();
        return Timestamp.valueOf(localDateTime);
    }
}
