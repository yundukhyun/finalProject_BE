package com.hanghae.finalProject.rest.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor
public class SignupRequestDto {

    @Size(min = 5, max = 10)
    @Pattern (regexp="^(?=.*?[0-9])(?=.*?[a-z]).{5,10}$")
    private String username;


    @Size(min = 8, max = 15)
    @Pattern (regexp="^.(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$")
    private String password;
    @NotBlank
    private String passwordCheck;
    @NotBlank
    private String nickname;

}
