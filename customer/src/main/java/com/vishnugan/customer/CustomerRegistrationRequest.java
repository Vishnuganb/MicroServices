package com.vishnugan.customer;

public record CustomerRegistrationRequest(String firstName,
                                          String lastName,
                                          String email
) {}
