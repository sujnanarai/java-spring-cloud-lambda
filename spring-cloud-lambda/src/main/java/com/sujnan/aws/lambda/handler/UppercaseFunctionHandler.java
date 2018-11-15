package com.sujnan.aws.lambda.handler;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.sujnan.aws.lambda.domain.UppercaseRequest;
import com.sujnan.aws.lambda.domain.UppercaseResponse;

public class UppercaseFunctionHandler extends SpringBootRequestHandler<UppercaseRequest, UppercaseResponse> {

}
