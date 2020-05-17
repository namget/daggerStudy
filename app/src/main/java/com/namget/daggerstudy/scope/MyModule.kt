package com.namget.daggerstudy.scope

import dagger.Module
import dagger.Provides

/**
 * Created by Namget on 2020.05.17.
 */

@Module
class MyModule {
    @Provides
    @UserScope
    fun provideString() : String{
        return ""
    }
}