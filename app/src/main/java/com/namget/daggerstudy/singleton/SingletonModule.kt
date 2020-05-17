package com.namget.daggerstudy.singleton

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Namget on 2020.05.17.
 */

@Module
class SingletonModule{
    @Provides
    @Singleton
    fun provideString() : String{
        return ""
    }
}