package com.example.demo.user.controller.port;

import com.example.demo.user.domain.User;
import com.example.demo.user.domain.dto.UserCreate;
import com.example.demo.user.domain.dto.UserUpdate;

public interface UserUpdateService {

    User update(long id, UserUpdate userUpdate);

    void login(long id);

    void verifyEmail(long id, String certificationCode);
}
