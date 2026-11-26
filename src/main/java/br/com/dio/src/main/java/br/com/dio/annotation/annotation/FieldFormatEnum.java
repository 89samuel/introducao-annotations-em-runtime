package br.com.dio.src.main.java.br.com.dio.annotation.annotation;
import static com.google.common.base.CaseFormat.*;
import java.util.function.Function;

import static com.google.common.base.CaseFormat.LOWER_CAMEL;

public enum FieldFormatEnum {

    CAMEL_CASE(field -> field),
    PASCAL_CASE(field -> LOWER_CAMEL.to(UPPER_CAMEL, field)),
    SNAKE_CASE(field -> LOWER_CAMEL.to(LOWER_UNDERSCORE, field)),
    KEBAB_CASE(field -> LOWER_CAMEL.to(LOWER_HYPHEN, field));

    private final Function<String, String> format;

    FieldFormatEnum(final Function<String, String> format) {
        this.format = format;
    }

    public Function<String, String> getFormat() {
        return format;
    }
}
