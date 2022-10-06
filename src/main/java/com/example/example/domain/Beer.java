package com.example.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Slf4j
public class Beer {
    private UUID id;
    private String name;
    private String style;
    private Long upc;

    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
