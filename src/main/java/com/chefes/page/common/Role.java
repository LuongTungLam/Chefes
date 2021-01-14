package com.chefes.page.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Role {
    @JsonProperty("Admin")
    Admin,
    @JsonProperty("User")
    User;
}
