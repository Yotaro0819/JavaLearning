package com.dailycodework.buynowdotcom.service.user;

import com.dailycodework.buynowdotcom.dtos.ProductDto;
import com.dailycodework.buynowdotcom.dtos.UserDto;
import com.dailycodework.buynowdotcom.model.Product;
import com.dailycodework.buynowdotcom.model.User;
import com.dailycodework.buynowdotcom.request.CreateUserRequest;
import com.dailycodework.buynowdotcom.request.UpdateUserRequest;

import java.util.List;

public interface IUserService {
    User createUser(CreateUserRequest request);
    User updateUser(UpdateUserRequest request, Long userId);
    User getUserById(Long userId);
    void deleteUser(Long userId);

    List<UserDto> getConvertedUsers(List<User> users);

    UserDto convertToDto(User user);
}
