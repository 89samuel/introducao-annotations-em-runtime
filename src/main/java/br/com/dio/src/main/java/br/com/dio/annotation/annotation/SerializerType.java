package br.com.dio.src.main.java.br.com.dio.annotation.annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static br.com.dio.src.main.java.br.com.dio.annotation.annotation.FieldFormatEnum.CAMEL_CASE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(TYPE)
public @interface SerializerType {

    FieldFormatEnum fieldFormat() default CAMEL_CASE;

    boolean prettify();
}
