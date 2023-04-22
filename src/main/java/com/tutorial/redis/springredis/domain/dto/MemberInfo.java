package com.tutorial.redis.springredis.domain.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberInfo {
    private String email;
    private String username;
}
