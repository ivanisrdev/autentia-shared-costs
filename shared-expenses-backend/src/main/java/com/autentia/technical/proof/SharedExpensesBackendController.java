package com.autentia.technical.proof;

import io.micronaut.http.annotation.*;

@Controller("/sharedExpensesBackend")
public class SharedExpensesBackendController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response";
    }
}