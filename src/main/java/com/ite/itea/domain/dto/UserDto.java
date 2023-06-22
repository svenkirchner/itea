package com.ite.itea.domain.dto;

import java.util.List;

public record UserDto(String firstname, String lastname, List<String> purchasedItems) {

    public String formatUserToString() {
        return firstname() + " " + lastname();
    }
}