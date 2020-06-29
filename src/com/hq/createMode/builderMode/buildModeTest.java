package com.hq.createMode.builderMode;

public class buildModeTest {
    public static void main(String[] args) {
        User build = User.builder()
                .age(18)
                .username("zhangsan")
                .password("111111")
                .sex("male")
                .build();
        System.out.println(build.toString());
    }
}
