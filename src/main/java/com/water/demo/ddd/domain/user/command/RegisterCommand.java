package com.water.demo.ddd.domain.user.command;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterCommand {
    @NotBlank
    private String email;
    @NotBlank
    private String policyNumber;
}
