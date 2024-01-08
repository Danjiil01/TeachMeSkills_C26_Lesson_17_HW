package com.teachmeskills.lesson17.homework.task1.functional_interface;

@FunctionalInterface
public interface MyFunctionalInterface <T, R>{
    R perform (T value);
}
