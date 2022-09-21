package com.my.j_spring.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class HelloResponseDtoTest {

    @Test
    public void 롬복_테스트(){
        //given
        String name = "test";
        int amount = 1000;
        //when
        HelloResponseDto helloResponseDto = new HelloResponseDto(name,amount);

        //then
        assertThat(helloResponseDto.getName()).isEqualTo(name);
        assertThat(helloResponseDto.getAmount()).isEqualTo(amount);
    }

}