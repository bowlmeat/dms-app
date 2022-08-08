package com.example.dmsapp.controller;

import com.example.dmsapp.common.R;
import com.example.dmsapp.entity.Post;
import com.example.dmsapp.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
@Slf4j
public class PostController {
    @Autowired
    private PostService postService;

    /**
     * 新增帖子
     */
    @PostMapping
    public R<String> save(@RequestBody Post post) {
        log.info(post.toString());

        postService.save(post);

        return R.success("新增帖子成功");
    }

}
