package com.namget.daggerstudy

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by Namget on 2020.05.17.
 * String과 String 두개의
 * 중복 타입을 선언 하면 안된다.
 */

@Module
class MyModule {
    @Provides
    fun provideHelloWorld(): String {
        return "Hello World"
    }

    @Provides
    @Named("hello")
    fun provideHello() : String{
        return "hello"
    }

    @Provides
    @Named("world")
    fun provideWorld() : String{
        return "world"
    }

    @Provides
    fun provideClassB(): ClassB = ClassB()

    /*@Provides
    fun provideCharles() : String{
        return "Charles"
    }*/
}