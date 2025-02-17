package com.sha.spring_boot_book_seller.security.jwt;

import com.sha.spring_boot_book_seller.security.UserPrincipal;
import org.springframework.security.core.Authentication;
import jakarta.servlet.http.HttpServletRequest;

public interface IJwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}
