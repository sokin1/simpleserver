package com.jkk.study.server.model.account;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.Instant;

@AllArgsConstructor
@Builder
public class Account {
    private int id;

    private String accId;

    private Instant createdAt;

    private String accType;
}
