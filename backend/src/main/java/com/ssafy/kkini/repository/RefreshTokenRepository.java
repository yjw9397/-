package com.ssafy.kkini.repository;

import com.ssafy.kkini.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Integer> {
    RefreshToken findByUserId(int userId);
    RefreshToken findByRefreshToken(String refreshToken);
}
