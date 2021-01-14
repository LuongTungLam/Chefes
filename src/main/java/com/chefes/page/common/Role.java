package com.chefes.page.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Roles {
    @JsonProperty("ADMIN")
    ADMIN,
    @JsonProperty("SUBADMIN")
    SUBADMIN,
    @JsonProperty("USER")
    USER;
}
