package com.capgemini.spring_intro.dto;

public class DtoMapper {

    public static User mapToUser(UserDto userDto){
        return new User(userDto.firstName(),userDto.lastName());
    }

    public static UserDto mapToUserDto(User user){
        return new UserDto(user.getFirstName(), user.getLastName());
    }
}
