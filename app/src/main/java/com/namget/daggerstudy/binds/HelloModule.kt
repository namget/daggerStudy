package com.namget.daggerstudy.binds

import dagger.Module
import dagger.Provides

/**
 * Created by Namget on 2020.05.17.
 */
@Module
class HelloModule{
    @Provides
    fun provideString() : String{
        return "Hello"
    }
}