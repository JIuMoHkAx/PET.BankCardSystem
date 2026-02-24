package com.mypetproj.cardmng.util.hash;

import com.mypetproj.cardmng.security.SecurityProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

@Service
@Component
public class HashProvider {

    private final SecurityProperties securityProperties;

    public HashProvider(SecurityProperties securityProperties) {
        this.securityProperties = securityProperties;
    }

    public String hashCardNumber(String rawCardNumber) {
        return hashString(normalizeCardNumber(rawCardNumber) + securityProperties.getServerSalt());
    }

    private String hashString(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 не поддерживается", e);
        }
    }

    private static String normalizeCardNumber(String s) {
        if (s == null) return null;
        return s.replaceAll("\\D", "");
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        } return result.toString();
    }
}
