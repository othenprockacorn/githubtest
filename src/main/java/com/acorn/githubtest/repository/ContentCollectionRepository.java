package com.acorn.githubtest.repository;

import com.acorn.githubtest.model.Content;
import com.acorn.githubtest.model.SaType;
import com.acorn.githubtest.model.Status;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll(){
        return contentList;
    }


    public Optional<Content> findByID(Integer id){
        return contentList.stream().filter( c-> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        Content content = new Content(
                1,
                "First Service Auth",
                "First Service Auth",
                Status.PROC,
                SaType.REQUEST,
                LocalDateTime.now(),
                null,
                ""
        );

        contentList.add(content);
    }

}
