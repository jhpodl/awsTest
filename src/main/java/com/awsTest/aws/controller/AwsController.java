package com.awsTest.aws.controller;

import com.awsTest.aws.dto.AwsResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AwsController {

    @GetMapping("/test")
    public ResponseEntity<AwsResponseDto> testAwsResponse()
    {
        return ResponseEntity.ok(
                AwsResponseDto.builder()
                        .awsTitle("my Test Aws Response Dto : ")
                        .awsContents("{contents : test contents}")
                        .build()
        );
    }
}
