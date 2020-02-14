package com.techstream.springbootkafkaconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {

    private Long userId;

    private String userName;

    private String mobile;

    private String email;

}
