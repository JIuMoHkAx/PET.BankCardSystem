package com.mypetproj.cardmng.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.security")
@Data
public class SecurityProperties {
    private String serverSalt;
}
