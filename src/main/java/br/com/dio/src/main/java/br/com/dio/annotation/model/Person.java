package br.com.dio.src.main.java.br.com.dio.annotation.model;
import br.com.dio.src.main.java.br.com.dio.annotation.annotation.SerializerMethod;
import br.com.dio.src.main.java.br.com.dio.annotation.annotation.SerializerType;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static br.com.dio.src.main.java.br.com.dio.annotation.annotation.FieldFormatEnum.PASCAL_CASE;

@SerializerType(fieldFormat = PASCAL_CASE, prettify = false)
public class Person {

    private long id;
    private String name;
    private int age;

    public Person() {
    }

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @SerializerMethod("firstPersonName")
   public String firstName(){
        return name.split(" ")[0];
   }
}
