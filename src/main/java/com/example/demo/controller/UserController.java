package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

        private final String USER_URL = "jsonplaceholder.typicode.com/users";
        private final String POSTS_URL = "jsonplaceholder.typicode.com/posts";

        RestTemplate restTemplate = new RestTemplate();

        public List<Map<String,Object>> getUsersSortedByPostsNos() {

            List<Map<String, Object>> users = Arrays.asList(restTemplate.getForObject(USER_URL, Map[].class));

            List<Map<String, Object>> posts = Arrays.asList(restTemplate.getForObject(POSTS_URL, Map[].class));

            Map<Integer, Long> postCountMap = posts.stream().collect(Collectors.groupingBy(s -> (Integer) s.get("userId"),
                    Collectors.counting()));

            List<Map<String, Object>> sortedUsers = users.stream().peek(user -> {
                int userId = (Integer) user.get("id");
                user.put("totalPosts", postCountMap.getOrDefault(userId, 0L));
            }).sorted((u1, u2) -> Long.compare(
                    (Long) u2.get("totalPosts"),
                    (Long) u1.get("totalPosts")
            )).collect(Collectors.toUnmodifiableList());

            return  sortedUsers;
        }



}
