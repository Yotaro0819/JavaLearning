package com.dailycodework.buynowdotcom.service.user;

import com.dailycodework.buynowdotcom.model.User;
import com.dailycodework.buynowdotcom.request.CreateUserRequest;
import com.dailycodework.buynowdotcom.request.UpdateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;
    @Override
    public User createUser(CreateUserRequest request) {
        return null;
    }

    @Override
    public User updateUser(UpdateUserRequest request, Long userId) {
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }
}
