package com.awsTest.aws.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AwsResponseDto {
    private String awsTitle;
    private String awsContents;

}