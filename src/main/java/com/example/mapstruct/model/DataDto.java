package com.example.mapstruct.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class DataDto {

    private String testName;

    private String testEmail;

    private String testBirth;

    private int testAge;

}
