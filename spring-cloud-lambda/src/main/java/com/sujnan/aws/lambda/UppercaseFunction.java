package com.sujnan.aws.lambda;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.sujnan.aws.lambda.domain.UppercaseRequest;
import com.sujnan.aws.lambda.domain.UppercaseResponse;
import com.sujnan.aws.lambda.service.UppercaseService;

@Component("uppercaseFunction")
public class UppercaseFunction implements Function<UppercaseRequest, UppercaseResponse> {
	private final UppercaseService uppercaseService;
	
	
	public UppercaseFunction(final UppercaseService uppercaseService) {
        this.uppercaseService = uppercaseService;
    }
	
	@Override
    public UppercaseResponse apply(final UppercaseRequest uppercaseRequest) {
        final UppercaseResponse result = new UppercaseResponse();

        result.setResult(uppercaseService.uppercase(uppercaseRequest.getInput()));

        return result;
    }
}
