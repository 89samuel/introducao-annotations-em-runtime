package br.com.dio.src.main.java.br.com.dio.annotation;
import br.com.dio.src.main.java.br.com.dio.annotation.model.Person;
import br.com.dio.src.main.java.br.com.dio.annotation.model.User;
import br.com.dio.src.main.java.br.com.dio.annotation.processor.SerializerProcessor;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
       var processor = new SerializerProcessor();
       System.out.println(processor.serializer(new Person(1, "João da silva", 26)));
       System.out.println(processor.serializer(new User(2, "Maria Silva", 30, 3222.23)));

    }
}
