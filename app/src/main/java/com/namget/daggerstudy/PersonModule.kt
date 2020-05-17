package com.namget.daggerstudy

import dagger.Module
import dagger.Provides

/**
 * Created by Namget on 2020.05.17.
 */
@Module
class PersonModule{
    @Provides
    fun provideName() : String = "Namget"

    @Provides
    fun provideAge() : Int = 20
}