package com.example.demo.repository;

import static org.assertj.core.api.Assertions.*;

import com.example.demo.model.UserStatus;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @DisplayName("UserRepository가 제대로 연결되었다")
    @Test
    void test(){
    // given
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail("test@test.com");
        userEntity.setAddress("Seoul");
        userEntity.setNickname("kok202");
        userEntity.setStatus(UserStatus.ACTIVE);
        userEntity.setCertificationCode("1234");

    // when
        UserEntity result = userRepository.save(userEntity);

        // then
        assertThat(result.getId()).isNotNull();
    }

}
