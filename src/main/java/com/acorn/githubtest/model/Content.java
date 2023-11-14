package com.acorn.githubtest.model;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        SaType contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url){
}
