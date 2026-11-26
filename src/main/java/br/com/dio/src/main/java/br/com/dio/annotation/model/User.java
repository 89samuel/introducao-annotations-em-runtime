package br.com.dio.src.main.java.br.com.dio.annotation.model;

import br.com.dio.src.main.java.br.com.dio.annotation.annotation.SerializerType;

import static br.com.dio.src.main.java.br.com.dio.annotation.annotation.FieldFormatEnum.SNAKE_CASE;

@SerializerType(fieldFormat = SNAKE_CASE, prettify = false)
public record User(

        long id,
        String fullName,
        int age,
        double salary
) {
}
