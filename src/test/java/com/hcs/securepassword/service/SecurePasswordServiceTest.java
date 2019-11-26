package com.hcs.securepassword.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SecurePasswordServiceTest {

    private ObjectMapper mapper = new ObjectMapper();
    @Autowired
    private SecurePasswordService securePasswordService;
}